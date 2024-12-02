package application;

import java.util.ArrayList;
import java.util.List;

import entities.Formas;
import entities.Retangulo;
import entities.enums.Cores;

public class Program {

	public static void main(String[] args) {
		
		List<Formas> formas = new ArrayList<Formas>();
		
		formas.add(new Retangulo(Cores.RED, 5, 2.0));
		
		for(Formas item : formas) {
			System.out.println(item.area());
		}
		
	}

}
