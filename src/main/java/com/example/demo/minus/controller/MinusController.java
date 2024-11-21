package com.example.demo.minus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {

	@Autowired
	private MinusService minusService;
	
	@GetMapping("/minus")
	public String showMinusPage() {
		return "minus";
	}
	
	
	//引き算結果画面表示
	@PostMapping("/minus")
	public String calculateMinus(
			@RequestParam("number1") int number1,    //@Request...HTMLフォームやURLで送られてきた値をJavaの変数にする
			@RequestParam("number2") int number2,
			Model model) {
		int result = minusService.calculate(number1, number2);
		model.addAttribute("result", result);
		return "minus";
		
	}
}
