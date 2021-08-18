package com.resthello.springboothello.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class printMessageService {
	@Value("${valueToPrint}")
	public String pValue;
	public String message(){
		
		return pValue;
	}
}
