package comer;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Guilherme", 93.4);
		Comida c1 = new Comida("Mega Stacker Rodeio 2.0", 1.0);
		Comida c2 = new Comida("Fritas", 0.190);
		Comida c3 = new Comida("Sorvete de banoffee (balde)", 0.350);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
		p.comer(c3);
		System.out.println(p.apresentar());
		
	}
	
}
