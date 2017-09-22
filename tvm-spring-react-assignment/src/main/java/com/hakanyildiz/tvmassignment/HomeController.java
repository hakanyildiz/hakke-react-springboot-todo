package com.hakanyildiz.tvmassignment;

 
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	private final AtomicLong counter = new AtomicLong();
	 
	 @RequestMapping("/content")
	 public Content contenting(
			 @RequestParam(value="param1", defaultValue = "Param1") String param1 , 
			 @RequestParam(value="param2", defaultValue = "Param2") String param2  
			 ) {
		 return new Content(counter.incrementAndGet(), param1, param2);
	 }
	 
	 //example.
	 //http://localhost:8080/content?param1=uchiha&param2=hakke

}
