package ma.asp.springaspect.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.asp.springaspect.service.IServiceClient;

@RestController
@RequestMapping("/")
public class RestService {
	@Autowired
	private IServiceClient service;
	
	@GetMapping("/verser/{montant}")
	public void verser(@PathVariable double montant) {
		this.service.verser(montant);
	}
	@GetMapping("/retirer/{montant}")
	public void retirer(@PathVariable double montant) {
		this.service.retirer(montant);
	}
}
