package com.example.RestAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
