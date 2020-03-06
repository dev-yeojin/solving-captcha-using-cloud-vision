package kr.pj.captcha.Controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

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
	//public void upload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
	public String saveFileAndSolveCaptcha(HttpServletRequest req, @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		String savePath = "D:/project/vision-api/images/";
		String orgFilename = file.getOriginalFilename();
		File dest = new File(savePath + orgFilename);
		file.transferTo(dest);
		
		return "uploadSuccess";
	}
}
