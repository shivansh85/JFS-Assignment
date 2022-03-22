package com.springmvc.q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SIC {
	
	@RequestMapping(value = "/Shivansh",method = RequestMethod.GET)
	public ModelAndView getValues(){
		
		ModelAndView mv =new ModelAndView("simpleInterest");
		mv.addObject("boy","Shivansh");
		return mv;
	}
	
	@RequestMapping(value = "/Submit",method = RequestMethod.POST)
	public ModelAndView submitValue(@ModelAttribute("si") SI si) {
		ModelAndView mv =new ModelAndView("simpleInterestprint");
		return mv;
	}

}