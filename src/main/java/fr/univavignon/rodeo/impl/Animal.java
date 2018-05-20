package fr.univavignon.rodeo.impl;

import fr.univavignon.rodeo.api.IAnimal;

public class Animal implements IAnimal {
	
	private int xp;
	
	private boolean secret,boss,endangered;
	
	
	
	public Animal(String name, int xp,boolean endangered,boolean boss,boolean secret) {
		super(name);
		this.xp = xp;
		this.endangered = endangered;
		this.secret = secret;
		this.boss = boss;
		
}

	public int getXP() {
		// TODO Auto-generated method stub
		return xp;
	}

	public boolean isSecret() {
		// TODO Auto-generated method stub
		return secret;
	}

	public boolean isEndangered() {
		// TODO Auto-generated method stub
		return endangered;
	}

	public boolean isBoss() {
		// TODO Auto-generated method stub
		return boss;
	}

}
