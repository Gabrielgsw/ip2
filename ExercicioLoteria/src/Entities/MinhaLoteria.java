package Entities;

import java.util.ArrayList;

public class MinhaLoteria {
	
	public static void main(String[] args) {
		Bilhete bilhetePremiado;
		
		bilhetePremiado = new Bilhete(6);
		
		int countQuadra = 0;
		int countQuina = 0;
		int countSena = 0;
		int countApostas = 0;
		
		
		
		for(int i = 6;i<=15;i++) {			
			while(countSena != 6){
				
				Bilhete bilheteSorteado = new Bilhete(i);
				countApostas++;
				ArrayList<Bilhete> bilhetes = new ArrayList<>();;
				bilhetes.add(bilheteSorteado);
				if((bilheteSorteado.qtdNumerosContidos(bilhetePremiado)) == 4) {
					countQuadra++;
					bilhetes.remove(0);
				}
				else if((bilheteSorteado.qtdNumerosContidos(bilhetePremiado)) == 5) {
					countQuina++;
					bilhetes.remove(0);
				}
				else if((bilheteSorteado.qtdNumerosContidos(bilhetePremiado)) == 6) {
					countSena = 6;
				}
			}
			System.out.printf("Jogos de %d números: voce apostou %d vezes para ganhar na mega-sena. Dentre esses jogos, voce acertou %d quadras e %d quinas.\n",i,countApostas,countQuadra,countQuina);
			countApostas = 0;
			countQuadra = 0;
			countQuina = 0;
			countSena = 0;
		}
		
		//Imprimindo as informacoes
		
	}

	
	
	
	
	
}
