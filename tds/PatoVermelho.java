package com.ifsc.tds;

public class PatoVermelho extends Pato implements Voador, Grasnador{
	
	public PatoVermelho() {}
	
	public void display() {
		System.out.println("Oi, eu sou um pato vermelho!");
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
