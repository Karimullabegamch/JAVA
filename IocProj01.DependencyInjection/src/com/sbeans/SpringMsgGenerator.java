package com.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("smg")
public class SpringMsgGenerator {

	@Autowired
	private LocalDateTime ldt;
	public String showSpringMsg()
	{
		int hour=ldt.getHour();
		if(hour>12)
			return "gm";
		else
			return "ev";
	}
}
