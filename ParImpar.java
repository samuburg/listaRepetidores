package ListaRepetidores;

import java.util.ArrayList;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 10;
		int vet [] = new int[TAM];
		ArrayList<Integer> impares = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList <Integer>();
		
		for(int x=0;x<TAM;x++) {
			System.out.println("Digite o " + (x+1)+"° número: ");
			vet[x]= entrada.nextInt();
			if (vet [x]%2>0) {
				impares.add(vet[x]);
			}
			else {
				pares.add(vet[x]);
			}
		}
		
		System.out.println("Os numeros pares são: ");
		System.out.println(pares);
		System.out.println("Os numeros impares são: ");
		System.out.println(impares);
		
	}

}
