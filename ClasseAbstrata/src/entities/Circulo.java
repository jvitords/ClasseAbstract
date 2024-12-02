package entities;

import entities.enums.Cores;

public class Circulo extends Formas{

	private double raio;
	
	public Circulo(Cores cores, double raio) {
		super(cores);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area(){
		return 1;
	}
}
