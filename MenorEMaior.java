package ListaRepetidores;

import java.util.Scanner;

public class MenorEMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int tam = 0;
		int num = 0;
		int menor =0;
		int maior = 0;
		int soma = 0;
		
		System.out.print("Quantos numeros voce quer analisar? ");
		tam = entrada.nextInt();
		
		
		for (int x=0;x<tam;x++) {
			System.out.print("Digite um numero: ");
			num = entrada.nextInt();
			
			if (x==0) {
				menor = num;
				maior = num;
			}
			else {
				if (num>maior) {
					maior = num;
				}
				if (num<menor) {
					menor = num;
				}
			}
			soma=soma+num;
			
			
		}
		System.out.println("A soma de todos os numeros vale: "+soma);
		System.out.println("O menor numero vale: "+menor);
		System.out.println("O maior numero vale: "+maior);
				

	}

}
