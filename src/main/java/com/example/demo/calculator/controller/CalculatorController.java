package com.example.demo.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {
	@Autowired
	private CalculatorService calculatorService;

	@GetMapping("/calculator")
	public String showMinusPage() {
		return "calculator";
	}

	//引き算結果画面表示
	@PostMapping("/calculator")
	public String calculateCalculator(
			@RequestParam("number1") int number1, //@Request...HTMLフォームやURLで送られてきた値をJavaの変数にする
			@RequestParam("number2") int number2,
			@RequestParam("operator") String operator, // 演算子を取得
			Model model) {
		try {

			int result = calculatorService.calculate(number1, number2, operator);

			model.addAttribute("result", +result);
		} catch (ArithmeticException e) {
			// エラー
			model.addAttribute("error", "ゼロ除算はできません");

		}

		return "calculator";
	}
}