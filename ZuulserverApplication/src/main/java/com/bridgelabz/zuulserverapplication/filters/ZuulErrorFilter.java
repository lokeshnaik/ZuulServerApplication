//package com.bridgelabz.zuulserverapplication.filters;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
//import org.springframework.stereotype.Component;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//
//@Component
//public class ZuulErrorFilter extends ZuulFilter
//{
//
//	@Override
//	public boolean shouldFilter() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public Object run() throws ZuulException 
//	{
////		RequestContext requestContext=RequestContext.getCurrentContext();
////		HttpServletRequest httpServletRequest=requestContext.getRequest();
//		System.out.println("using Errorfilter");
//		return null;
//	}
//
//	@Override
//	public String filterType() {
//		// TODO Auto-generated method stub
//		return FilterConstants.ERROR_TYPE;
//	}
//
//	@Override
//	public int filterOrder() {
//		// TODO Auto-generated method stub
//		return FilterConstants.SEND_ERROR_FILTER_ORDER-1;
//	}
//
//}
