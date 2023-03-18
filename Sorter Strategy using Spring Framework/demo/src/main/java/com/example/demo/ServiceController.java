package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.App;
import com.mycompany.app.Sorter;
import com.mycompany.app.Bubble;

@RestController
public class ServiceController{
	
	@RequestMapping("/resource")
	public String service(){
		App ob=new App();
		String str=ob.message();
		return(str);
	}
	
	@RequestMapping("/sort") 	
	public double[] fun(){
		Sorter obj=new Sorter();
		double[] arr=obj.sorter();
		return(arr);
	}
}
