package Entities;

import java.util.Arrays;

public class Professor extends Pessoa{

	private int numCursos;
	private String[] cursos;
	
	public Professor(String name, String endereco) {
		super(name, endereco);
		cursos = new String[50];
		
		for(int i = 0;i<cursos.length;i++) {
			cursos[i] = null;
		}
	}
	
	public boolean addCurso(String curso) {
		for(int i = 0;i<cursos.length;i++) {
			if(cursos[i] == curso) {
				System.out.println("Nao foi possivel adicionar o curso! ");
				return false;
			}
			if(cursos[i] == null) {
				cursos[i] = curso;
			}
		}
		return true;
	}
	
	public boolean removeCurso(String curso) {
		for(int i = 0;i<cursos.length;i++) {
			if(cursos[i] == curso) {
				cursos[i] = null;
				System.out.println("Curso removido com sucesso! ");
				return true;
			}
		}
		System.out.println("Curso nao removido! ");
		return false;
	}

	@Override
	public String toString() {
		return "Professor"+getName()+" [numCursos=" + numCursos + ", cursos=" + Arrays.toString(cursos) + "]";
	}
	
	
	
	
}
