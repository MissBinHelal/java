package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.time.LocalDate;

@Controller

public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date d=new Date();
		SimpleDateFormat Date_format = new SimpleDateFormat("dd-MM-yyyy");  
	    String today_date = Date_format.format(d);
	    model.addAttribute("date", today_date);
		//model.addAttributes("date","d");
	    System.out.print(today_date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date t =new Date();
		SimpleDateFormat Time_format = new SimpleDateFormat("hh:ss");  
		String time = Time_format.format(t);
		 model.addAttribute("time",time);
		    System.out.print(time);
		return "time.jsp";
	}
	
}
