package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public List<String> generateFizzBuzz() {
		List<String> fizzBuzzList = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzzList.add("FizzBuzz"); //３、５倍数
			} else if (i % 3 == 0) {
				fizzBuzzList.add("Fizz"); //3の倍数
			} else if (i % 5 == 0) {
				fizzBuzzList.add("Buzz"); //5の倍数
			} else {
				fizzBuzzList.add(String.valueOf(i)); //それ以外,,,,,valueOf..数値を表現する文字列を実際の数値へと変換するメソッド
			}

		}

		return fizzBuzzList;
	}
}
