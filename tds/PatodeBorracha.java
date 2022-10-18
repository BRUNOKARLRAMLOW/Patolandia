package com.ifsc.tds;

public class PatodeBorracha extends Pato implements Grasnador{
	
	@Override
	public void quack() {
	System.out.println("QUACK QUACK");
		
	}
	
	public void nadar() {
		System.out.println("Boiando");
	}
	
	public void display() {
		System.out.println("Oi, eu sou um pato de borracha!");
	}

}
