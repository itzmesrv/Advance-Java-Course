package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.mycompany.app.*;
import java.util.*;

//RestController and GetMapping are built-in
@RestController 
public class DemoController 
{
	@PostMapping("/cipher")
	public String print(@RequestBody Map<String,String> data)
	{
		String str = data.get("data");
		//int shift = data.get("shift_amount");
		Cipher ob = new Cipher();
		String subStr = ob.Encrypt(str);
		//String subStr = ob.Encrypt(str,shift);
		//int am = ob.Encrypt(shift);
		return subStr;
	}
}
