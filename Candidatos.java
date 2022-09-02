package ListaRepetidores;

import java.util.Scanner;

public class Candidatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int votantes = 0;
		int voto = 0;
		int cand1=0;
		int cand2=0;
		int cand3=0;
		
		System.out.println("Quantas pessoas vão votar? ");
		votantes = entrada.nextInt();
		
		for (int x=0;x<votantes;x++) {
			System.out.println("Votante "+(x+1)+ " Digite o numero do candidato que voce vota (1 a 3) ");
			voto = entrada.nextInt();
			if (voto == 1) {
				cand1+=1;
			}
			if (voto == 2) {
				cand2+=1;
			}
			if (voto == 3) {
				cand3+=1;
			}
		}
		
		System.out.println("O candidato 1 recebeu "+cand1+ " Votos");
		System.out.println("O candidato 2 recebeu "+cand2+ " Votos");
		System.out.println("O candidato 3 recebeu "+cand3+ " Votos");

	}

}
