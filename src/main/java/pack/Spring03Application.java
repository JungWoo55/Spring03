package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring03Application {
	@GetMapping("/")//기본 경로
	public String open() {
		return "Spring03 Start : 250811/17:08";
	}//branch
	public static void main(String[] args) {
		System.out.println("Spring03 Start");
		SpringApplication.run(Spring03Application.class, args);
	}
}