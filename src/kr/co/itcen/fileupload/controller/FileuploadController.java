package kr.co.itcen.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileuploadController {
	
	@RequestMapping("/form")
	public String form() {
		
		return "form";
	}
}
