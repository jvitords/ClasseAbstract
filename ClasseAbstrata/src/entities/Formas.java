package entities;

import entities.enums.Cores;

public abstract class Formas {
	
	private Cores cor;

	public Formas() {
	}

	public Formas(Cores cores) {
		this.cor = cores;
	}

	public Cores getCores() {
		return cor;
	}

	public void setCores(Cores cores) {
		this.cor = cores;
	}

	public abstract double area();
}