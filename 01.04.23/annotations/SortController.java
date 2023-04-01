package annotations;


import java.lang.annotation.*;
import algorithms.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SortController{
	
	String Sorter;

}
