package fr.univavignon.rodeo.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie extends NamedObject implements ISpecie {

	private List<IAnimal> animals;
	
	private int environment;

	public Specie(String _name,int environment,List<IAnimal> animals) {
		
		super(name);
		
		animals = new ArrayList<IAnimal>();
		
		this.environment=environment;
		
		this.animals.addAll(animals);
	}

	public int getEnvironment() {
		return environment;
	}

	public List<IAnimal> getAnimals() {
		return animals;
	}

}