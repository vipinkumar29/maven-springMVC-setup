/**
 * 
 */
package com.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vipin
 *
 */
@Controller
public class HelloWorld {
	String message = "Welcome to Spring MVC!";

	/*
	 * In the code above, @RequestMapping annotation maps web requests onto
	 * specific handler classes and/or handler methods, in this case,
	 * showMessage(). It provides a consistent style between Servlet and Portlet
	 * environments, with the semantics adapting to the concrete environment.
	 * 
	 * RequestParam indicates that a method parameter should be bound to a web
	 * request parameter. In this case, we also make it not required and give it
	 * a default value.
	 */

	@RequestMapping("/hello")
	public ModelAndView showesage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView view = new ModelAndView("helloworld");
		view.addObject("message", message);
		view.addObject("name", name);
		return view;

	}

}
