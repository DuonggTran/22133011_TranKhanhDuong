package LapTrinhWebT4.controllers;

import java.io.IOException;

import LapTrinhWebT4.models.UserModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/waiting")
public class WaitingController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("account") != null) {
			UserModel u = (UserModel) session.getAttribute("account");
			session.setAttribute("account", u);
            req.setAttribute("account", u);
            session.setAttribute("userId", u.getId());
			if (u.getRoleid() == 1) {
				RequestDispatcher rd =req.getRequestDispatcher("/views/login-success.jsp");
				rd.forward(req, resp);
			} else if (u.getRoleid() == 2) {
				resp.sendRedirect(req.getContextPath() + "/views/home.jsp");
			} else {
				resp.sendRedirect(req.getContextPath() + "/home");
			}
		} else {
			RequestDispatcher rd =req.getRequestDispatcher("/views/home.jsp");
			rd.forward(req, resp);
			/* resp.sendRedirect(req.getContextPath() + "/views/home.jsp"); */
		}
	}
}
