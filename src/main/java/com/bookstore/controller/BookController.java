package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;

	/*
	 * @GetMapping("/Books") 
	 * public String viewBooks(Map<String, Object> map) {
	 * map.put("books", bookService.getBooks());
	 * 
	 * return "viewbooks"; }
	 */
	
	
	/*
	 * @GetMapping("/Books") 
	 * public String viewBooks(Model map) { //map.put("books",
	 * bookService.getBooks()); map.addAttribute("books", bookService.getBooks());
	 * return "viewbooks"; }
	 */
	
	
	/*
	 * @RequestMapping("/Books") 
	 * public Model viewBooks() {
	 * System.out.println("From books controller...."); Model model=new
	 * BindingAwareModelMap(); model.addAttribute("books", bookService.getBooks());
	 * System.out.println(model.toString()); return model; }//request mapping path
	 * "Books" takes as logical view name
	 */	
	
	@GetMapping("/Books")
	public ModelAndView  viewBooks() {
		System.out.println("From books controller....");
		ModelAndView mav=new ModelAndView();
		mav.addObject("books", bookService.getBooks());
		mav.setViewName("viewbooks");//Legacy style,here we can set view name
		System.out.println(mav.toString());
		return mav;
	}
	
	@GetMapping("/chain1")
	public String test1() {
		System.out.println("From test chain1....");
		return "forward:Books";//use fwd if source & destination methods are in the same web application and shares same data
	}
	
	@GetMapping("/chain2")
	public String test2() {
		System.out.println("From test chain2....");
		return "redirect:Books";//use redirect if source & destination methods are in the 2 web applications and donot shares data
	}
	
	

}
