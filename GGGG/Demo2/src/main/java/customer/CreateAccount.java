package customer;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tranfer
 */
@WebServlet("/create")
public class CreateAccount extends HttpServlet {	Connection con;
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
		String s1=request.getParameter("U_ID");
		String s2=request.getParameter("account_number");
		String s3=request.getParameter("amount");
		String s4=request.getParameter("date");
		PreparedStatement ps=con.prepareStatement("INSERT INTO Create_Account (uniqueId,ACCOUNTFIRST,balance,tdate) VALUES (?, ?, ?,?)");
				ps.setString(1, s1);
				ps.setString(2, s2);
				ps.setString(3, s3);
				ps.setString(4, s4);
				ps.executeUpdate();
		PrintWriter pw=response.getWriter();
		pw.print("<h1>ACCOUNT CREATED WITH INITIAL BALANCE OF "+s3+"</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("CreateAccount.jsp");
		rd.include(request, response);
	} 
	catch (Exception e) 
	{
		System.out.println(e);
	}
}

}

