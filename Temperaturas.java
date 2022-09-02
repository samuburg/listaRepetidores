package ListaRepetidores;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
		
		int tam=0;
		int num = 0;
		int menor =0;
		int maior = 0;
		int soma = 0;
		float media = 0;
		
		System.out.print("Quantas temperaturas voce deseja analisar: ");
		tam = entrada.nextInt();
		
		
		for (int x=0;x<tam;x++) {
			System.out.print("Digite a temperatura do dia: " + x);
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
		
		
		media = soma/tam;
		
		System.out.println("A media de temperatura vale "+media);
		System.out.println("A menor temperatura vale: "+menor);
		System.out.println("A maior temperatura vale: "+maior);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
