import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import algorithms.*;

import annotations.*;

public class Main{
	
	public String execute() throws Throwable {
		Class<CustomController> controller = CustomController.class;

		Object obj = controller.newInstance();

		RestController restController = controller.getAnnotation(RestController.class);
		{
		
			Field[] fields = controller.getDeclaredFields();
			for(Field field : fields){
				RestController rest = field.getAnnotation(RestController.class);
				
			if(rest != null)
			{
				Object x = field.get(obj);
				double[] array = (double[])(x);
				Sorter i = new Sorter();
				i.main(array);
				field.set(obj,array);
			}
			}
			
			Method[] methods = controller.getMethods();
			for(Method method : methods){
				Sort sort = method.getAnnotation(Sort.class);
				
				if(sort.invoke()){
					if(sort != null){
					    //String strategy = sort.strategy();
						method.invoke(sort);
					}
					
				}
					
				
				}
		
		}
			return null;
		}

	public static void main(String... args){
		try{
		new Main().execute();
		} catch (Throwable e){

		}
	}
}
