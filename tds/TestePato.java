package com.ifsc.tds;

public class TestePato {

	public static void main(String[] args) {
		Pato patolino = new Pato();
		PatoReal patoReal = new PatoReal();
		PatoVermelho patoVermelho = new PatoVermelho();
		PatodeBorracha patinho = new PatodeBorracha();
		PatodeMadeira patao = new PatodeMadeira();
		
		patolino.display();
		patolino.nadar();
		System.out.println("");
		
		patoVermelho.display();
		patoVermelho.quack();
		patoVermelho.nadar();
		patoVermelho.voar();
		System.out.println("");
		
		patoReal.display();
		patoReal.quack();
		patoReal.nadar();
		patoReal.voar();
		System.out.println("");
		
		patinho.display();
		patinho.quack();
		patinho.nadar();
		System.out.println("");
		
		patao.display();
		patao.nadar();
	}

}
