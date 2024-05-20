package com.cgpr.mineurpenal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfantRepository extends JpaRepository<Enfant, String>  {

}
