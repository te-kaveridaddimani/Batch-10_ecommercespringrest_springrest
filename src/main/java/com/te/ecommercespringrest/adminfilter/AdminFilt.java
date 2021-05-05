package com.te.ecommercespringrest.adminfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "/*")
public class AdminFilt implements Filter{


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		System.out.println("URL is "+req.getRequestURL());
		System.out.println("URI is "+req.getRequestURI());
		System.out.println("Method is "+req.getMethod());
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		
	}
	
}
