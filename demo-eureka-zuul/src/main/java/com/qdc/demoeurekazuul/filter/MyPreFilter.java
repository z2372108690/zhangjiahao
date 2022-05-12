package com.qdc.demoeurekazuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class MyPreFilter extends ZuulFilter {
    @Override
    public boolean shouldFilter() { return true; }

    @Override
    public String filterType() { return "pre"; }

    @Override
    public int filterOrder() { return 0; }

    @Override
    public Object run() throws ZuulException {
        System.out.println("MyPreFilter");
        return null;
    }
}