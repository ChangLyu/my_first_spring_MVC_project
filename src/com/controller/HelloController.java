package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sun.media.sound.ModelAbstractChannelMixer;
// insert /hi/welcome or /hi/goodbye
@Controller
@RequestMapping("/hi")
public class HelloController {

	//second method of say hello using annotation:
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView modelandview=new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi User, welcome to the first spring MVC project");
		return modelandview;
	}
	
	@RequestMapping("/goodbye")
	public ModelAndView goodbye(){
		ModelAndView modelandview=new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Goodbye, see you tomorrow!");
		return modelandview;
	}
	
	
/**first method of say hello (no annotation):	
	
extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelandview= new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi User, welcome to the first spring MVC project");
		return modelandview;
	} */
}
