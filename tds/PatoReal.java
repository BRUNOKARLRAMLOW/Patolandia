package com.ifsc.tds;

public class PatoReal extends Pato implements Voador, Grasnador{
	
	public PatoReal() {}
	
	public void display() {
		System.out.println("Oi, eu sou um pato real!");
	}

	@Override
	public void voar() {
	System.out.println("Voando");
	}
	
	@Override
	public void quack() {
	System.out.println("QUACK QUACK");
		
	}

}
