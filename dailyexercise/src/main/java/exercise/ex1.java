package exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex1 {
    @GetMapping("welcome")
    public String welcome() {
    	return "Welcome String BOOt!";
    }
    
}
