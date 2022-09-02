package ListaRepetidores;

import java.util.Scanner;

public class TabuadaMelhor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tab = 0;
		int min = 0;
		int max = 0;
		
		
		System.out.println("Qual tabuada você quer saber? ");
		tab = entrada.nextInt();
		System.out.println("Começa em quanto? ");
		min = entrada.nextInt();
		System.out.println("termina em quanto? ");
		max = entrada.nextInt();
		
		
		System.out.println("Tabuada de "+tab);
		for (int x=min; x<=max;x++) {
			System.out.println(x + " x " +tab + " = " + (tab*x));
		}


	}

}
