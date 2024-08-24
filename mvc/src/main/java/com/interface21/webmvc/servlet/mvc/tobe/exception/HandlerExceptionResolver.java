package com.interface21.webmvc.servlet.mvc.tobe.exception;

import com.interface21.webmvc.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface HandlerExceptionResolver {

    ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Exception exception);
}