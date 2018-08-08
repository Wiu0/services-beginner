package com.w.servlet.v2.filter;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuditoriaFilter implements Filter{

	//TODO quando a aplicacao stop
	@Override
	public void destroy() {
		System.out.println("[" + Calendar.getInstance().getTime() + "] Finalizando filter");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		System.out.println("Call next Filter");
		chain.doFilter(req, res);
		System.out.println("Back filter");
	}

	//TODO quando a aplicacao sobe
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("[" + Calendar.getInstance().getTime() + "] Iniciando filter");
	}

}
