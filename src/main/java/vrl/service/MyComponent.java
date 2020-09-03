package vrl.service;

import java.io.Serializable;
import java.util.ServiceLoader;

import eu.mihosoft.vrl.annotation.ComponentInfo;

@ComponentInfo(
		name = "MyComponent",
		category = "TEST",
		description = "Service loader test"
)
public class MyComponent implements Serializable {
	private static final long serialVersionUID = 1L;

	public MyComponent() {
		System.out.println("******* Instantiated: MyComponent");
	}
	
	public void findService() {
		ServiceLoader<SomeService> loader = ServiceLoader.load(SomeService.class);
		
		int counter = 0;
		for (SomeService someService : loader) {
			counter++;
			System.out.println("**************** " + someService.getService());
		}
		System.out.println("******************* num services found: " + counter);
	}
}
