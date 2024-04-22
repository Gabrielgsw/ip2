package Application;

import Entities.*;

public class Program {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[10];
		
		Estudante e1 = new Estudante("Joaozinho", "Rio Doce");
		Estudante e2 = new Estudante("Pedro", "Camaragibe");
		Professor p1 = new Professor("Leandro", "Boa Viagem");
		Professor p2 = new Professor("Pacífico","Alto do Pascoal");
			
		
		e1.addCursoNota("Programacao 2", 10);
		e1.addCursoNota("Machine Learning", 8);
		e2.addCursoNota("Matemática discreta", 7);
		e2.addCursoNota("Algoritmos e estrutura de dados", 10);
		
		p1.addCurso("Programacao 2");
		p1.addCurso("Matemática discreta");
		p2.addCurso("Algoritmos e estrutura de dados");
		p2.addCurso("Machine Learning");
		pessoas[0] = e1;
		pessoas[1] = e2;
		pessoas[2] = p1;
		pessoas[3] = p2;
		
	}
	
	

}
