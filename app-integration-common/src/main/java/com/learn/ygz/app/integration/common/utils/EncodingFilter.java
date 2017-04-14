package com.learn.ygz.app.integration.common.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodingFilter implements Filter {
    FilterConfig config = null;
    // default to GBK
    private String targetEncoding = "GBK";

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
        this.targetEncoding = config.getInitParameter("encoding");
    }

    public void destroy() {
        config = null;
        targetEncoding = null;
    }

    public void doFilter(ServletRequest srequest, ServletResponse sresponse,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest)srequest;
        request.setCharacterEncoding(targetEncoding);
        chain.doFilter(srequest, sresponse);
    }
}

