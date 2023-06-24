package Spring.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	@GetMapping("/")
	public String main() {
		return "Main Page";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
