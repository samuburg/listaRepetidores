package ListaRepetidores;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaConvenienciaManuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int cont = 0;
		float preco = (float) 1.99;
		float total = 0;
		ArrayList<Float> tPreco = new ArrayList<Float>();
		
		
		while (preco!=0) {

			System.out.println("Digite o valor do produto :"+cont + " (zero finaliza)");
			preco = entrada.nextFloat();
			if (preco == 0) {
				break;
			}
			tPreco.add(preco);
			total+=preco;
			cont+=1;
		}
		
		System.out.println("O valor a ser pago pelo cliente é de : "+total);

	}

		
		
		
		
		
		
		
		
	}

