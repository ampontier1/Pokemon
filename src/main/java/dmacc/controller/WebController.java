/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Nov 4, 2021
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Monster;
import dmacc.repository.PokemonRepository;

@Controller
public class WebController {
	@Autowired
	PokemonRepository repo;
	
	@GetMapping("/inputMonster")
	public String addNewMonster(Model model) {
		Monster m = new Monster();
		model.addAttribute("newMonster", m);
		return "input";
	}
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllMonsters(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewMonster(model);
		}
		
		model.addAttribute("monsters", repo.findAll());
		return "results";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateMonster(@PathVariable("id") long id, Model model) {
		Monster m = repo.findById(id).orElse(null);
		model.addAttribute("newMonster", m);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseMonster(Monster m, Model model) {
		repo.save(m);
		return viewAllMonsters(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deletePokemon(@PathVariable("id") long id, Model model) {
		Monster m = repo.findById(id).orElse(null);
		repo.delete(m);
		return viewAllMonsters(model);
	}
}
