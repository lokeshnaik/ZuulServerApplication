//package com.bridgelabz.zuulserverapplication.filters;
//
////import javax.servlet.http.HttpServletRequest;
////
//////import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
////import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
////import org.springframework.stereotype.Component;
////
////import com.netflix.zuul.ZuulFilter;
////import com.netflix.zuul.context.RequestContext;
////import com.netflix.zuul.exception.ZuulException;
//
////@Component
////public class ZuulRouterFilter extends ZuulFilter
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
//		// TODO Auto-generated method stub
//		System.out.println("Using Route filter");
////		RequestContext requestContext=RequestContext.getCurrentContext();
////		HttpServletRequest httpServletRequest=requestContext.getRequest();
//		return null;
//	}
//
//	@Override
//	public String filterType() {
//		// TODO Auto-generated method stub
//		return FilterConstants.ROUTE_TYPE;
//	}
//
//	@Override
//	public int filterOrder() 
//	{
//		// TODO Auto-generated method stub
//		return FilterConstants.SEND_FORWARD_FILTER_ORDER-1;
//	}
//
//}
