package com.javadevsguide.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	/*@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView("helloworld")
				.addObject("name", "Ramesh");
		return modelAndView;
	}*/
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("name", "Hello World from Spring 4 MVC");
		return "helloworld";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		return "welcome";
	}
}
