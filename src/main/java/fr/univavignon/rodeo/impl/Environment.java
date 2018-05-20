package fr.univavignon.rodeo.impl;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment{

	private int environments;
	
	private ArrayList<ISpecie> species;

	public Environment(String name,int environments,List<ISpecie> sp) {
		
		super(name);
		species = new ArrayList<ISpecie>();
		species.addAll(sp);
		this.environments=environments;
		
	}

	public int getEnvironments() {
		
		return environments;
		
	}

	public List<ISpecie> getSpecies() {
		
		return species;
		
	}

}