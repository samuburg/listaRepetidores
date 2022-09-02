package ListaRepetidores;

import java.util.Scanner;

public class PopulacaoCrescimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int populacaoA = 0;
		float taxaA= 0;
		int populacaoB = 0;
		float taxaB= 0;
		int ano = 1;
		float novoTotalA = 0;
		float novoTotalB = 0;
		
		System.out.println("População do país A: ");
		populacaoA = entrada.nextInt();
		System.out.println("Taxa de crescimento do país A: ");
		taxaA = entrada.nextFloat()/100;
		System.out.println("População do país B: ");
		populacaoB = entrada.nextInt();
		System.out.println("Taxa de crescimento do país B: ");
		taxaB = entrada.nextFloat()/100;
		
		novoTotalA = populacaoA;
		novoTotalB = populacaoB;
		
		while (novoTotalA<novoTotalB) {
			novoTotalA = (float) (populacaoA*Math.pow((1+taxaA),ano));
			novoTotalB = (float) (populacaoB*Math.pow((1+taxaB),ano));
			ano+=1;
		}
		
		System.out.println("Levou-se " + ano + " anos para o país A passar ou igualar o país B");

		
	}

}
