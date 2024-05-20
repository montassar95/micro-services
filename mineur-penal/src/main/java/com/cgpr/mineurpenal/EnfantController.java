package com.cgpr.mineurpenal;


import org.springframework.web.bind.annotation.*;


import org.springframework.beans.factory.annotation.Autowired;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/enfant")
public class EnfantController {


	@Autowired
	private EnfantService enfantService;



	@GetMapping("/getone/{id}")
	public  Enfant  getEnfantById(@PathVariable("id") String id) {

		return  enfantService.getEnfantById(id) ;
	}

}
