package com.lihai.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// session created called.
		System.out.println("sessionCreated(HttpSessionEvent) called.");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// session destoryed called.
		System.out.println("sessionDestroyed(HttpSessionEvent) called.");
	}
}