//package com.bridgelabz.zuulserverapplication.filters;
//
//import java.io.IOException;
//import java.nio.charset.Charset;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.hibernate.TransientObjectException;
//import org.hibernate.engine.jdbc.StreamUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
//import org.springframework.stereotype.Component;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//
//import lombok.extern.java.Log;
//
//@Component
//public class ZuulPostFilter extends ZuulFilter
//{
//	@Override
//	public boolean shouldFilter() 
//	{	
//		return true;
//	}
//
//	@Override
//	public Object run() throws ZuulException 
//	{
////		RequestContext requestContext=RequestContext.getCurrentContext();
////		HttpServletRequest httpServletRequest=requestContext.getRequest();
////		System.out.println("FilterConnstants.SEND_RESPONSE_fILTER_ORDER----"+FilterConstants.SEND_RESPONSE_FILTER_ORDER);
////		System.out.println("FilterConnstants.SEND_FORWARD_fILTER_ORDER----"+FilterConstants.SEND_FORWARD_FILTER_ORDER);
////		System.out.println("FilterConnstants.SEND_ERROR_fILTER_ORDER----"+FilterConstants.SEND_ERROR_FILTER_ORDER);
////		System.out.println("FilterConnstants.PRE_DECORATION_FILTER_ORDER---"+FilterConstants.PRE_DECORATION_FILTER_ORDER);
//		System.out.println("Using Post filter");
//		return null;
//	}
//
//	@Override
//	public String filterType()
//	{	
//		return FilterConstants.POST_TYPE;
//	}
//
//	@Override
//	public int filterOrder() 
//	{
//		return FilterConstants.SEND_RESPONSE_FILTER_ORDER-1;
//	}
//
//}
