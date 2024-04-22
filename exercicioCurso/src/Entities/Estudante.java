package Entities;

public class Estudante extends Pessoa{
	
	private int numCursos;
	private String[] cursos;
	private int[] notas;
	
	public Estudante(String name, String endereco) {
		super(name, endereco);
		notas = new int[100];
		cursos = new String[100];
		
		for(int i = 0;i<100;i++) {
			notas[i] = -1;
			cursos[i] = "null";
		}
	}

	public boolean addCursoNota(String curso, int nota) {
		
		for(int i = 0;i<cursos.length;i++) {
			if(cursos[i] == curso) {
				System.out.println("Nao foi possivel adicionar o curso, pois o mesmo ja existe! ");
				return false;
			}
			if(cursos[i] == "null") {
				cursos[i] = curso;
			}
			if(notas[i] == -1) {
				notas[i] = nota;
			}
		}
		return true;
		
	}
	
	public void imprimeNotas() {
		for(int x : notas) {
			System.out.println(x);
		}
	}
	
	public double getNotaMedia() {
		double total = 0;
		double media = 0;
		for(int i = 0;i<notas.length;i++) {
			total+=notas[i];
		}
		media = total/notas.length;
		return media;
	}
	
}
