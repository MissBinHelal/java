package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class Home_Controller {
	@RequestMapping("/")
	public String index(HttpSession session) {
		 if(session.getAttribute("count") == null) {
	        	
	        	session.setAttribute("count", 0);
	        }
	        else {
	        	int count = (Integer) session.getAttribute("count");
	        	count ++;
	        	session.setAttribute("count", count);
	        }
		 
		return "index.jsp";
	}
	@RequestMapping("/counter")
	 public String counter(){
			return "counter.jsp";
	    }
}
