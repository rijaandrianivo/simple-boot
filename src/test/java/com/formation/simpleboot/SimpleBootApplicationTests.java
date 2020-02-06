package com.formation.simpleboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.formation.simpleboot.service.calculator;

@SpringBootTest
class SimpleBootApplicationTests {

	private calculator calculator = new calculator();
	@Test
	void TestSomme() {
		assertEquals(6, calculator.somme(2, 4));
		
		
	}

}
