package com.awareqwx.Strings;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
    @RequestMapping("/")
    public String hello()
    {
        return "<h2 style='font-family: Arial;'>Hello! How are you today?</h2>";
    }
    
    @RequestMapping("/random")
    public String generate()
    {
        String[] messages = {
                "Spring uses Java, which is my favorite language.",
                "Spring boots up a lot faster than tomcat.",
                "Spring has more powerful functionality than tomcat.",
                "Spring's logo is green, which I like a lot."
        };
        Random r = new Random();
        return "<h2 style='font-family: Arial;'>" + messages[r.nextInt(messages.length)] + "</h2>";
    }
}
