package misl.spring.controler;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import misl.soring.model.JsonResponseModel;

@Controller

public class HomeControler {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView usercase(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("usercase");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return model;
	}
	@RequestMapping(value = "/login_member", method = RequestMethod.GET)
	public ModelAndView login_member(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("login_member");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return model;
	}
	@RequestMapping(value = "/login_user", method = RequestMethod.GET)
	public ModelAndView login_user(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("login_user");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return model;
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("register");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return model;
	}
	@RequestMapping(value = "/add_register", method = RequestMethod.POST)
	@ResponseBody
	public JsonResponseModel add_register(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		JsonResponseModel res = new JsonResponseModel();
		try {
			String name = resquest.getParameter("firstname");
			String lname = resquest.getParameter("lastname");
			String country = resquest.getParameter("country");
			
			System.out.println(name+" "+lname+" "+country);
			if (name==""&&lname=="") {
				res.setStatus("Fail");
				res.setResult("200");
			}
			else {
				res.setStatus("success");
				res.setResult("200");
			}
			
			return res;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return res;
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("home");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return model;
	}
	@RequestMapping(value = "/forget", method = RequestMethod.GET)
	public ModelAndView forget(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("forget");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return model;
	}
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("about");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return model;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("login");
		try {
			return model;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return model;
	}
}
