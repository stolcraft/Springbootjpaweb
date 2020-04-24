package eu.ensup.springbootjpaweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.ensup.springbootjpaweb.dao.UserRepository;


	@Controller
	public class UserController {
		@Autowired
		UserRepository userRepo;

		@RequestMapping("/users")
		public String home(Model model) {
			model.addAttribute("users", userRepo.findAll());
			return "users";
		}
	}
