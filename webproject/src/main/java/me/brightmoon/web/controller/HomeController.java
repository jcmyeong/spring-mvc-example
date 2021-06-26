package me.brightmoon.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// 		http://.../WEB
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public void aaaa() {
		System.out.println("abasdcvda");
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC~");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		return mv;
//	}

}
