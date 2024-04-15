package Entities;

import java.util.Random;

public class Bilhete {

	int[] bilhete;
	int tamanho;
	
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
		
		for(int i = 0;i<tamanho;i++) {
			int chave = bilhete[i];
			int j = i - 1;
			while(j>= 0 && bilhete[j] > chave) {
				bilhete[j+1] = bilhete[j];
				j = i - 1;
			}
			bilhete[j+1] = chave;
		
	}
	
}
	
	
	
	
}
