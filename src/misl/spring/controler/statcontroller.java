package misl.spring.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/stat")
public class statcontroller {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("member/stat/home");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return model;
	}
}
