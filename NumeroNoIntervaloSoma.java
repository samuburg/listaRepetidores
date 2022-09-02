package ListaRepetidores;

import java.util.Scanner;

public class NumeroNoIntervaloSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int min =0;
		int max = 0;
		int soma = 0;
		
		System.out.println("Digite o começo do intervalo: ");
		min = entrada.nextInt();
		System.out.println("Digite o final do intervalo: ");
		max = entrada.nextInt();
		System.out.println("Os números inteiros que estão entre "+min+" e "+ max + " São: ");
		
		for (int x=min+1;x<max;x++) {
			System.out.println(x);
			soma+=x;
		}
		
		System.out.println("A soma entre os números acima vale: "+soma);

	}

}
