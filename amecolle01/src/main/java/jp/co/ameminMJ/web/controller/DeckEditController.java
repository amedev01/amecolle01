package jp.co.ameminMJ.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.ameminMJ.web.form.LoginForm;

@Controller
public class DeckEditController {

	
	
	@RequestMapping("/deckedit")
	public String execute(@ModelAttribute LoginForm loginForm,HttpServletRequest request,HttpServletResponse response, Model model){
		return("home");
		
	}
	

}
