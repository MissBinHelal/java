package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/trycode", method=RequestMethod.POST)
	 public String trycode(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		
		if (code.equals("bushido")) {
			return "result.jsp";
		}
		 redirectAttributes.addFlashAttribute("error", "A test error!");
	        return "redirect:/";
		}
}
