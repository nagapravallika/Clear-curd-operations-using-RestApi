package com.df.pets.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="collection1")
public class Animal
{
	 @Id
	  public String id;
	  
	  public String name;
	  public String species;
	  public int breed;
	  
	  // Constructors
	  public Animal() {}
	  
	  public Animal(String id, String name, String species, int breed) {
	    this.id = id;
	    this.name = name;
	    this.species = species;
	    this.breed = breed;
	  }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getBreed() {
		return breed;
	}

	public void setBreed(int breed) {
		this.breed = breed;
	}

	public static void setname(String name2) {
		// TODO Auto-generated method stub
		
	}

	
	

	
	  // ObjectId needs to be converted to string
	 

}
