package ListaRepetidores;

import java.util.Scanner;

public class Loja199Manuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int num = 0;
		final float preco = (float) 1.99;
		float total = 0;
		
		System.out.println("Quantos produtos o clientes está levando?");
		num = entrada.nextInt();
		
		for (int x=0;x<num;x++) {
			total = (x+1)*preco;
			System.out.println((x+1) + " - RS " + total);
		}
		
		System.out.println("O valor a ser pago pelo cliente é de : "+ num*preco);

	}

}
