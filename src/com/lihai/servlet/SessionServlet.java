package com.lihai.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/sessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = -2924545851463487450L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		session.setAttribute("lastName", "li");
		request.getRequestDispatcher("/WEB-INF/jsp/session.jsp").forward(request, response);
	}
}
