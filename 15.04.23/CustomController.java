import annotations.*;
import java.util.*;
import algorithms.*;


public class CustomController {

	@RestController(setstrategy="Bubble")
	double arr[]={10,14,12,1,2,-85,45,-25,3,4};
	
	@Sort(invoke = true)
	public void sort()
	{
		System.out.println(arr.toString());
	}
}
