package kr.pj.captcha.Controller;

import java.io.File;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class CaptchaSolveController {

	@GetMapping("/") 
	public String uploadPage() {
		return "imageUpload";
	}
	
	@PostMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file) {
		return "";
	}
	
}
