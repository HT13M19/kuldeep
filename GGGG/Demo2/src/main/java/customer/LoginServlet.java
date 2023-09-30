package customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet 
{
		Connection con=null;
		String name;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			String s1=request.getParameter("phone");
			String s2=request.getParameter("password");
			PreparedStatement ps=con.prepareStatement("select * from user1 where phone=? and PASSWORD=?");
			ps.setString(1, s1);
			ps.setString(2, s2);
			ResultSet rs=ps.executeQuery();
			PrintWriter pw=response.getWriter();
			
			if (rs.next()) {
			    Cookie cookie = new Cookie("phone", s1);
			    response.addCookie(cookie);
			    name=request.getParameter("phone");
			    RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		        // Forward the request to the target resource
		        dispatcher.forward(request, response);
			} else 
			{
				pw.println("<font color=red>");
				pw.println("User Name or Password</font>" +s1 +" "+s2);
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
				pw.print("</body> </html>");
			}
		
	}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	
	}

}
