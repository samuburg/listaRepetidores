package ListaRepetidores;

import java.util.Scanner;

public class SerieUmBarraDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int num = 0;
		int denominador = 1;
		
		System.out.println("Quantos numeros da sequencia de fibonacci você deseja saber? ");
		num = entrada.nextInt();
		
		for (int i=1;i<=num;i++){
			System.out.print( i + "/"+denominador + " | ");
			denominador+=2;
		}


	}

}
