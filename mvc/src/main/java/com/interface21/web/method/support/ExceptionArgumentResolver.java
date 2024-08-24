package com.interface21.web.method.support;

import com.interface21.core.MethodParameter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ExceptionArgumentResolver {

    boolean supportsParameter(MethodParameter parameter);

    Object resolveArgument(HttpServletRequest request, HttpServletResponse response, Exception exception);
}
