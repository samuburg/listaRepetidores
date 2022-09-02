package ListaRepetidores;

import java.util.ArrayList;
import java.util.Scanner;

public class IntervaloDePrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int cont =0;
		int num = 0;
		ArrayList<Integer> primo = new ArrayList <Integer>();
		
		
		
		System.out.println("Você quer saber os numeros primos de 0 até quanto? ");
		num = entrada.nextInt();
		
		
		for (int i=1;i<=num;i++) {
			cont=0;
			for (int x=1;x<=i;x++) {
				if (i%x==0) {
					cont+=1;
				}
			}
			if (cont==2) {
				primo.add(i);
			}
				
		}
		
		
		
	
		System.out.println("Numeros primos entre 1 e "+num + ": "+primo);
		
		

	}

	}
