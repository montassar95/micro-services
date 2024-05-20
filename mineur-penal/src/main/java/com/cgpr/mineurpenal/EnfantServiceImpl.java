package com.cgpr.mineurpenal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EnfantServiceImpl implements EnfantService {

	
	 
	@Autowired
	private EnfantRepository enfantRepository;


	@Override
	public Enfant getEnfantById(String id) {
		Optional<Enfant> enfanttData = enfantRepository.findById(id);
		if (enfanttData.isPresent()) {


			return  enfanttData.get();
		} else {
			return  null;
		}
	}

}

