package ListaRepetidores;

import java.util.Scanner;

public class SerieMultiplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num = 38;
		int cont = 1;
		float total = 0;
		System.out.print(" serie (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37 ");
		
		
		for (int x=num; x>0;x--) {
			total = (float) total + (x*(x-1)/cont);
			cont+=1;
		}
		System.out.println(total);

	}

}
