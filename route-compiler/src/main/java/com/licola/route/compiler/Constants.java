package com.licola.route.compiler;

/**
 * Created by LiCola on 2018/7/2.
 */
public class Constants {


  static final String KEY_MODULE_NAME = "moduleName";

  static final String PACKAGE_BASE = "com.licola.route";
  static final String PACKAGE_COMPILER = PACKAGE_BASE + ".compiler";
  static final String PACKAGE_API = PACKAGE_BASE + ".api";
  static final String PACKAGE_ANNOTATION = PACKAGE_BASE + ".annotation";

  static final String ROUTE_CLASS_PREFIX = "Route";

  static final String ROUTE_CLASS_ROUTE_ROOT = "RouteRoot";
  static final String ROUTE_CLASS_INNER_ROUTE = "Route";
  static final String ROUTE_CLASS_INNER_API = "Api";
  static final String ROUTE_CLASS_ROUTE_API = "Api";
  static final String ROUTE_CLASS_INTERCEPTOR = "Interceptor";
  static final String ROUTE_CLASS_ROUTE_REQUEST = "RouteRequest";


  static final String ROUTE_ANNOTATION_PROTOCOL = "Protocol";
  static final String ROUTE_ANNOTATION_CODE = "Code";

  static final String ROUTE_METHOD_LOAD = "load";
  static final String ROUTE_METHOD_LOAD_PARAMETER = "metas";
  static final String ROUTE_METHOD_NAVIGATION = "navigation";
  static final String ROUTE_METHOD_NAVIGATION_PARAMETER_TARGET = "target";
  static final String ROUTE_METHOD_NAVIGATION_PARAMETER_INTERCEPTOR = "interceptor";
  static final String ROUTE_METHOD_NAVIGATION_PARAMETER_REQUEST = "request";

  static final String ROUTE_FIELD_ROUTE_MODULE_NAME = "MODULE_NAME";

  static final String PATH_SEPARATOR = "/";


}
