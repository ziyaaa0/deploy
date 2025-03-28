package com.yedam.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@Value("${file.upload}")
	String upload;
	
	@GetMapping("/")
	@ResponseBody
	public String main() {
		return "hello:" + upload;
	}
}
