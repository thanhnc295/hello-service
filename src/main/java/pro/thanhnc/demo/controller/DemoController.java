package pro.thanhnc.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pro.thanhnc.demo.model.Greeting;

@RestController
public class DemoController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		System.out.println("Hello ....  !!!");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
