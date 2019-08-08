package aa1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login1 extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name= req.getParameter("name");
		String pass= req.getParameter("pass");
		if(name.equals("abc"));
		{
			pw.println("Login success");
			RequestDispatcher rd =req.getRequestDispatcher("welcome");
			rd.forward(req,res);
		}
		else
		{
			pw.println("Login Failed ");
			RequestDispatcher rd =req.getRequestDispatcher("/login.html");
			rd.include(req, res);
			
			rd.forward(req,res);
		}
	}
}
