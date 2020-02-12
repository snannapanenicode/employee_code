package com.employee_code;
import com.google.common.base.CaseFormat;


public class ConvertToUpperCase {
	public String result;
	
	public ConvertToUpperCase() {
		
	}
	public ConvertToUpperCase (String value) {
		result= CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, value); 
	    
	}
	
	 
	


}
