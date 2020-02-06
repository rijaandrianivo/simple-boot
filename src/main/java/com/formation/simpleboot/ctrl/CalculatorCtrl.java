package com.formation.simpleboot.ctrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.formation.simpleboot.service.calculator;


@RestController
public class CalculatorCtrl {

	@Autowired
	private calculator calculator;
	
	@RequestMapping("/somme")
	String somme(@RequestParam("a")  Integer a, @RequestParam("b") Integer b ) {
		return String.valueOf(calculator.somme(a, b));
	}
}
