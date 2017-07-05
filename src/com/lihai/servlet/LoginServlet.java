package com.lihai.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author lihailen
 * @date 2017-07-05
 *
 * cookie的一个应用，保存用户名与密码
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String username = getCookie(cookies, "username");
		String password = getCookie(cookies, "password");
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}
	
	private String getCookie(Cookie[] cookies, String key) {
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals(key))
					return cookie.getValue();
			}
		}
		return null;
	}
}