package xiongcz.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/con")
public class MyController {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}

}
