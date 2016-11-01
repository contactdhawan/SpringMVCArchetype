package sf.crom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView sayHello() {
		
		ModelAndView mav = new ModelAndView("HelloPage");
		mav.addObject("welcomeMessage", "Papa Story sunao");
		return mav;
	}

}
