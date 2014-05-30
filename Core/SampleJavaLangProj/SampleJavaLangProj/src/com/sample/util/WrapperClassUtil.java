package com.sample.util;

public class WrapperClassUtil {
	
	public void printWrapperClassType(Object object){
		if(object instanceof Boolean){
			System.out.println("Object type is Boolean.");
		}else if(object instanceof Byte){
			System.out.println("Object type is Byte.");
		}else if(object instanceof Character){
			System.out.println("Object type is Character.");
		}else if(object instanceof Double){
			System.out.println("Object type is Double.");
		}else if(object instanceof Float){
			System.out.println("Object type is Float.");
		}else if(object instanceof Integer){
			System.out.println("Object type is Integer.");
		}else if(object instanceof Long){
			System.out.println("Object type is Long.");
		}else if(object instanceof Short){
			System.out.println("Object type is Short.");
		}else if(object == null){
			System.out.println("Object is Null.");
		}
	}
}
