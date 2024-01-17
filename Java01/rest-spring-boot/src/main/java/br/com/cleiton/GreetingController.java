package br.com.cleiton;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final  AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greting")
	public Greting greting(
			@RequestParam(value="name", defaultValue="Word")
			String name) {
		return new Greting(counter.incrementAndGet(),String.format(template, name));
	}
	
}

