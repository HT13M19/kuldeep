package customer;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tranfer
 */
@WebServlet("/Tranfer")
public class Tranfer extends HttpServlet {	Connection con;
public void init(ServletConfig config)
{
	try 
	{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","santosh");
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
{
	try 
	{
		String s1=request.getParameter("account_number");
		String s2=request.getParameter("second");
		String s3=request.getParameter("amount");
		String s4=request.getParameter("date");
		
		
		PreparedStatement ps=con.prepareStatement("Select Balance from create_Account where AccountFirst=?");
		
		ps.setString(1, s1);;
		
		ResultSet rs=ps.executeQuery();
		
		
		PreparedStatement ps2=con.prepareStatement("Select Balance from create_Account where AccountFirst=?");
		
		ps2.setString(1, s2);
		
		ResultSet rs2=ps2.executeQuery();
		
		boolean b=rs2.next();
		int secondAccountBal=0;
		if(b)
		{
			secondAccountBal=rs2.getInt(1);
		}
				
		PrintWriter pw=response.getWriter();
		while(rs.next())
		{
			int x=rs.getInt(1);
			
			if(x>Integer.parseInt(s3)) 
			{
			    int updatedBal=secondAccountBal+Integer.parseInt(s3);
			    int n=updatedBal;
			    
			    String s=Integer.toString(updatedBal);
				
			    PreparedStatement ps3=con.prepareStatement("update Create_Account set balance=? where AccountFirst=?");
				ps3.setString(1, s);
				ps3.setString(2, s2);
				
				ps3.executeUpdate();
				
				pw.print("<h1>Money Transfer successful with Updated Amount is "+n+"</h1>");
				
				int firstAccountBal=x-Integer.parseInt(s3);
				
				 PreparedStatement ps4=con.prepareStatement("update Create_Account set balance=? where AccountFirst=?");
					ps4.setInt(1, firstAccountBal);
					ps4.setString(2, s1);
					
					ps4.executeUpdate();
					pw.print("<h1>Updated balance of first Account is"+firstAccountBal+"</h1>");
					
				RequestDispatcher rd = request.getRequestDispatcher("moneytransfer.jsp");
				rd.include(request, response);
				
			}else
			{
				
				pw.print("<h1>Money Transfer Failed Due to Insufficent Bal</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("moneytransfer.jsp");
				rd.include(request, response);
				
			}
		
		}
		
		
		
		/*
		 * // ps=con.
		 * prepareStatement("update Create_Account set balance=? where AccountFirst=?");
		 * ps.setString(1, s1); ps.setString(2, s2); ps.setString(3, s3);
		 * ps.setString(4, s4); ps.executeUpdate(); // PrintWriter
		 * pw=response.getWriter(); pw.print("<h1>Money Transfer successfully "+s2);
		 * pw.print("<br>amount : "+s3+"</h1>"); RequestDispatcher rd =
		 * request.getRequestDispatcher("moneytransfer.jsp"); rd.include(request,
		 * response);
		 */
	} 
	catch (Exception e) 
	{
		System.out.println(e);
	}
}

}

