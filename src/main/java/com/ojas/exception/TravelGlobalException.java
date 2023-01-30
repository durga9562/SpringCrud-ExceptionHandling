package com.ojas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ojas.entities.TravelResponse;

@ControllerAdvice

public class TravelGlobalException {
	
@ExceptionHandler(ResourceNotFoundExcception.class)
public ResponseEntity<TravelResponse> resourceNotFound(ResourceNotFoundExcception resource){
	
	String str=resource.getMessage();
	TravelResponse response=new TravelResponse(str,false);
	
	return new ResponseEntity<TravelResponse>(response,HttpStatus.NOT_FOUND);
	
}
	

}
