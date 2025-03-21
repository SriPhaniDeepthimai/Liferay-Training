package com.liferay.training.osgi.service;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		property= {
				"osgi.command.function=telltime",
				"osgi.command.scope=training"
				
		},
		service=ClockCommand.class
		
		)
public class ClockCommand {
	
	@Reference
	private ClockApi clock;
	
	
	public void telltime() {
		System.out.println(clock.getTime());
	}
	
	

}
