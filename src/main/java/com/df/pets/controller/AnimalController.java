package com.df.pets.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.df.pets.model.Animal;
import com.df.pets.repository.AnimalRepository;


@RestController
@RequestMapping("/api/collection1")
public class AnimalController
{
	@Autowired
	  private AnimalRepository repository;
	  
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Animal> getAllAnimal() {
	    return repository.findAll();
	  }
	  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	  public Animal getAnimalByName(@PathVariable("name") String name) {
	    return repository.findByname(name);
	  }
	  
	  
	  @RequestMapping(value = "/{name}", method = RequestMethod.PUT)
	  public void modifyAnimalByName(@PathVariable("name") String name, @Valid @RequestBody Animal animal) {
	    Animal.setname(name);
	    repository.save(animal);
	  }
	  
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Animal createAnimal(@Valid @RequestBody Animal animal) {
	   // animal.setName(String.get());
	    repository.save(animal);
	    return animal;
	  }

	  
//	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pets) {
//	    pets.set_id(id);
//	    repository.save(pets);
//	  }
	  
//	  @RequestMapping(value = "/", method = RequestMethod.POST)
//	  public Pets createPet(@Valid @RequestBody Pets pets) {
//	    pets.set_id(ObjectId.get());
//	    repository.save(pets);
//	    return pets;
//	  }
	  
	  @RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
	  public void deleteAnimal(@PathVariable String name ) {
	    repository.delete(repository.findByname(name));
	  }

}
