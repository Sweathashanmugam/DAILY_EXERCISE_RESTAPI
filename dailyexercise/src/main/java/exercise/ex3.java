package exercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex3 {
	@Value("${var1}")
 private String favColor;
	@GetMapping("color")
 public String getfavColor() {
	 return "My Favorite Color is "+favColor;
 }
}
