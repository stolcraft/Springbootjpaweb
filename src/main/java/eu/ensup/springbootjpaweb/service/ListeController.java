package eu.ensup.springbootjpaweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.ensup.springbootjpaweb.dao.FormationRepository;
import eu.ensup.springbootjpaweb.dao.UserRepository;

@Controller
public class ListeController {

	@Autowired
	IFormationService iformationService;

	@Bean
	public FormationService iformationService() {
		return new FormationService();

	}

	public ListeController() {
		super();
	}

	public ListeController(IFormationService formationService) {
		super();
		this.iformationService = formationService;
	}

	@RequestMapping("/liste")
	public String home(Model model) {
		System.out.println("entree dans la liste");
		model.addAttribute("liste", iformationService.trouverTout());
		return "liste";
	}
}