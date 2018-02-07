package com.groza.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * SwaggerFilter
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */
@WebFilter(urlPatterns = "/*", filterName = "SwaggerFilter")
public class SwaggerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // initial request / response
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //可以跨站访问
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, PATCH, DELETE");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type , X-FORWARDED-FOR , X-Forwarded-Proto");

        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
