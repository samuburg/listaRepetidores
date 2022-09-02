package ListaRepetidores;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimoOuNaoMelhor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int cont =0;
		ArrayList<Integer> divisores = new ArrayList <Integer>();
		
		System.out.println("Digite um numero para saber se é primo: ");
		num = entrada.nextInt();
		
		for (int x=1;x<=num;x++) {
			if (num%x==0) {
				cont+=1;
				divisores.add(x);
			}
			
		}
		
		
		
		
		if (cont==2) {
			System.out.println("É primo");
		}
		else {
			System.out.println("Não é primo");
			System.out.println("Este número é divisível por: "+divisores);
		}

	}

	}

