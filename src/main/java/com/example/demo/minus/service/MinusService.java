package com.example.demo.minus.service;
import org.springframework.stereotype.Service;


@Service
public class MinusService {
	
	public int calculate(int number1, int number2) {
		return number1 - number2;
	}

}
