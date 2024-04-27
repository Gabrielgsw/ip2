package Entities;

import java.util.Random;

public class Bilhete {

	private int[] bilhete;
	private int tamanho;
	public static int qntd = 0;
	
	Random rd = new Random();	
	
	public Bilhete(int tamanho) {
		this.tamanho = tamanho;
		this.bilhete = new int[tamanho];
		
		// Preenchendo o bilhete
		for(int i = 0;i < tamanho ; i++) {
			bilhete[i] = rd.nextInt(60) + 1;
			
		}
		
		// Verificando se ha repeticoes
		for(int i = 0; i<tamanho;i++) {
			for(int j = 0;j<tamanho;j++) {
				if(bilhete[i] == bilhete[j] && i!=j) {
					bilhete[i] = rd.nextInt(60) + 1;
					i = 0;
					j = 0;
				}
			}
		}
		
		//Ordenando os numeros
		
		
	
}
	//Implementando metodo num cont
	public int qtdNumerosContidos(Bilhete bilheteLoteria) {
		int qtd = 0;
		//Verificando a quantidade de numeros iguais
		for(int i = 0;i<tamanho;i++) {
			for(int j = 0;j<6;j++) {
				if(this.bilhete[i] == bilheteLoteria.bilhete[j]) {
					qtd++;
				}
			}
		}
		return qtd;
	}
	
	
	// Implementando o toString
	public String toString() {
		String resultado = "[";
		for(int i = 0; i< tamanho ; i++ ) {
			resultado += bilhete[i] + ",";
		}
		return resultado;
	}
	
}
