package com.app.example;
public class AccessDenied  extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AccessDenied(String message){
        super(message);
    }
    
}
