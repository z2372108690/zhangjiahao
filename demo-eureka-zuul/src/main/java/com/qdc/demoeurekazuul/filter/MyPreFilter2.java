package com.qdc.demoeurekazuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class MyPreFilter2 extends ZuulFilter {
    @Override
    public boolean shouldFilter() { return true; }
    @Override
    public String filterType() { return "pre"; }

    @Override
    public int filterOrder() { return 1; }
    @Override
    public Object run() throws ZuulException {
        System.out.println("MyPreFilter2");
        return null;
    }
}