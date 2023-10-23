package com.brian.random;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RandomController {
    @GetMapping("/random")
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100); // Return a random number between 0 and 99
    }
}
