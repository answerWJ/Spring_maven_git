package com.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/** 
  * @author  作者 E-mail: zyj_daan@163.com
  * @date 创建时间：2016年8月17日  下午3:27:16 
  * @version 1.0 
  * @parameter  异常处理类
  * @since  JDK 1.8
  * @return  
  */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	/**
	 * 加注解 @ExceptionHandler
	 * @param req
	 * @param e
	 */
	@ExceptionHandler
	public void defaultErrorHandler(HttpServletRequest req,Exception e){
//       If the exception is annotated with @ResponseStatus rethrow it and let
//       the framework handle it - like the OrderNotFoundException example
//       at the start of this post.
//       AnnotationUtils is a Spring Framework utility class.
//      if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
//          throw e;
//
//      // Otherwise setup and send the user to a default error-view.
//      ModelAndView mav = new ModelAndView();
//      mav.addObject("exception", e);
//      mav.addObject("url", req.getRequestURL());
//      mav.setViewName(DEFAULT_ERROR_VIEW);
//      return mav;
      
      //打印异常信息：
       e.printStackTrace();
       System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
       System.out.println(System.currentTimeMillis()+"---- req:--------"+req.getContextPath());
 
       /*
        * 返回json数据或者String数据：
        * 那么需要在方法上加上注解：@ResponseBody
        * 添加return即可。
        */
       
       /*
        * 返回视图：
        * 定义一个ModelAndView即可，
        * 然后return;
        * 定义视图文件(比如：error.html,error.ftl,error.jsp);
        *
        */
	}
}
