package coms.SpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/pg1")
	public String DemoPage1(Model m)
	{
		return "Page1";
	}

	@GetMapping("/")
	public String Page1(Model m)
	{
		return "index";
	}

	@GetMapping("/pg2")
	public String DemoPage2(Model m)
	{
		return "Page2";
	}

}
