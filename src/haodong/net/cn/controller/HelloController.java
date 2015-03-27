package haodong.net.cn.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleHash;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModelException;
import haodong.net.cn.model.User;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

@Controller
public class HelloController {
	@Autowired
	private FreeMarkerConfig freemarkerConfig;
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getNextPage1(@ModelAttribute("model") ModelMap model) throws TemplateModelException {
		User user = new User();
		user.setUsername("haodong");
		model.put("test", user);
		return "welcome";
	}
}
