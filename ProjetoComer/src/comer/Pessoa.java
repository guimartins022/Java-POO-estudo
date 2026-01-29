package comer;

public class Pessoa {

	// Atributos:
	String nome;
	double peso;
	
	// Construtor:
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	// Métodos (comportamentos):
	void comer(Comida comida) {
		if(comida != null && comida.peso > 0) {
			this.peso += comida.peso;
		}
	}
	
	String formatar = "Olá! Eu sou o %s e tenho %.2f Kgs.";
	
	String apresentar() {
		return String.format(formatar, nome, peso);
	}
	
}
