package aa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDemo extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		String name=req.getParameter("user");
		String pass=req.getParameter("password1");
		//pw.println(name);
		if(pass.equals("abc")) {
			pw.println("log in successful");
			
		}
		else
		{
			pw.println("login failed");
		}
		pw.close();
	}
}
