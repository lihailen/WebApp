package com.lihai.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lihailen
 * 
 * Cookie学习类
 */
@WebServlet(name = "CookieServlet", urlPatterns = "/cookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 8821668693154446633L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		String username = getCookValue(cookies, "username");
		if (username == null) { // 如果cookie中有非Ascii的字符，必须用URLEncoder处理
			resp.addCookie(new Cookie("username", URLEncoder.encode("李海龙", "utf-8")));
		}
			
		String age = getCookValue(cookies, "age");
		if (age == null) { // 每次调用addCookie(Cookie)就会在响应中增加一个"Set-Cookie"头
			resp.addCookie(new Cookie("age", "19"));
		}

		req.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(req, resp);
	}

	private String getCookValue(Cookie[] cookies, String key) {
		if (cookies != null) { // 必须加此判断，因为用户可能在第一次进入此站点就在浏览器的地址栏中直接输入此servlet的映射
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(key))
					return cookie.getValue();
			}
		}

		return null;
	}
}
