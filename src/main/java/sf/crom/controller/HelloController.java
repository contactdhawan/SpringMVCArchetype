package sf.crom.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping("/hello/{name}/{country}")
	public ModelAndView sayHello(@PathVariable("name") String name, @PathVariable("country") String country) {
		
		ModelAndView mav = new ModelAndView("HelloPage");
		mav.addObject("welcomeMessage", "Hello World!!! "+name+" from "+country);
		return mav;
	}

	@RequestMapping("/hi")
	public ModelAndView sayHi(){
		ModelAndView mav = new ModelAndView("HelloPage");
		mav.addObject("welcomeMessage","Hi world!!!");
		return mav;
	}
}
