package ListaRepetidores;

import java.util.Scanner;

public class GeradorDeTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner entrada = new Scanner(System.in);
		int tab = 0;
		
		
		System.out.println("Qual tabuada você quer saber? ");
		tab = entrada.nextInt();
		
		System.out.println("Tabuada de "+tab);
		for (int x=1; x<=10;x++) {
			System.out.println(x + " x " +tab + " = " + (tab*x));
		}

	}

}
