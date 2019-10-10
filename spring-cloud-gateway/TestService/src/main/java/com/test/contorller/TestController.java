package com.test.contorller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/allCountries")
	public List<String> getListOfCountries(){
		return Arrays.asList("India", "Afghanistan", "Kabul", "Pakistan", "Turkey");
	}
	
	@GetMapping("/allFruits")
	public List<String> getListOfFruits(){
		return Arrays.asList("Apple", "Banana", "Pineapple");
	}
}
