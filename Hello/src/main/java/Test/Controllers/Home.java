package Test.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Home", "/Trangchu"})
public class Home extends HttpServlet {
	
	private static final long serialVersionUID = -883555915311596535L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printW = resp.getWriter();
		printW.println("<h1>HelloWorld</h1>");
		printW.close();
		
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		// Set response content type
		 resp.setContentType("text/html");
		 resp.setCharacterEncoding("UTF-8");
		 req.setCharacterEncoding("UTF-8");
		 //Nhận dữ liệu từ request URL
		 String ten = req.getParameter("ten");
		 String holot = req.getParameter("holot");
		//Hiển thị dữ liệu ra web bằng đối tượng PrintWriter
		 PrintWriter out = resp.getWriter();
		out.println("<b>First Name</b>: " + ten + "<br/><b>Last Name</b>: "+ holot);
	}
	
}