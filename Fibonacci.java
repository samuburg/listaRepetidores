package ListaRepetidores;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int num = 0;
		int sequen = 0;
		int auxi = 1;
		
		System.out.println("Quantos termos da serie de Fibonacci você deseja saber? ");
		num = entrada.nextInt();
		
		for (int x=0;x<num;x++) {
			if (sequen<=auxi) {
				sequen = sequen+auxi;
			}
			else{
				auxi = sequen+auxi;
			}
			
			if (sequen<auxi) {
				System.out.println(sequen);
			}

			else{
				System.out.println(auxi);
			}
			  
		}

	}

}
