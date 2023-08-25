package AnnotaionsProgram;

import java.util.Arrays;

public class Repository <T>{
	
	public void save (T t) {
		
		//System.out.println(t);
		var clazz = t.getClass();
		var fields = clazz.getDeclaredFields();
		
		for(var field :fields)
		{
			var annotation = field.getAnnotationsByType(Field.class);
			//System.out.println(Arrays.asList(annotation));
			/*if(annotation.length>0)
			{
				System.out.println(field);
			}*/
			
			if(annotation.length == 0)
			{
				
				continue;
			}
			
			var annotations = annotation[0];
			var fieldname = annotations.value();
			var iskey  = annotations.iskey();
			
			if(fieldname.length()==0)
			{
				fieldname = field.getName();
			}
			
			System.out.println(fieldname +" "+iskey);
			 
			
		}
		
	}

}
