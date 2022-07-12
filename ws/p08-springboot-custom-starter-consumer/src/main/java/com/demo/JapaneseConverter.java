package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.demo.api.MessageConverter;

@Component
@Primary
public class JapaneseConverter implements MessageConverter {

	@Override
	public void translate(String msg) {
		System.out.println("Japanese: "+msg);
	}
	
}
