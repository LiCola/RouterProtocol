package com.licola.route.api;

/**
 * Created by LiCola on 2018/7/5.
 * 对请求进行处理的拦截器
 */
public interface Interceptor {

  RouteResponse intercept(RouteApi route, RouteResponse response);
}
