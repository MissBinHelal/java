package com.example.demo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DojoController {
	@RequestMapping("dojo")
	public String dojo() {
		return "The dojo is awesome!";
	}
	  @RequestMapping("/{city}")
	    public String showLesson(@PathVariable("city") String city){
	    	return  city + " is located in  Southern California";
	    }
}
