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
@WebServlet("/withdral")
public class withdral extends HttpServlet {	Connection con;
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
		String s2=request.getParameter("amount");
//		String s3=request.getParameter("date");
		PreparedStatement ps=con.prepareStatement("select balance from Create_Account	 where accountfirst=?");
				ps.setString(1, s1);
				
				ResultSet rs=ps.executeQuery();
				PrintWriter pw=response.getWriter();
				int y=Integer.parseInt(s2);
				int remainingAmount=0;
				while(rs.next())
				{
					
					int  x=rs.getInt(1);
					 if((x>y))
						{
						 
						remainingAmount=x-y;

							
							ps=con.prepareStatement("update  create_account set balance=? where ACCOUNTFIRST=? ");
							ps.setInt(1,remainingAmount );
							ps.setString(2, s1);
							ps.executeUpdate();
							pw.print("<h1>Withdrawal successfully completed of amount "+y+"  With remainng balance of "+remainingAmount);
							RequestDispatcher rd = request.getRequestDispatcher("withdrawal.jsp");
							rd.include(request, response);
						}
						else
						{
							pw.print("<h1>Withdrawn failed due to insufficient funds ");
							RequestDispatcher rd = request.getRequestDispatcher("withdrawal.html");
							rd.include(request, response);
						}
					
				}
				
				
		
		
		
	} 
	catch (Exception e) 
	{
		System.out.println(e);
	}
}

}

