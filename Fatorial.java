package ListaRepetidores;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		
		System.out.println("De qual número você deseja saber o fatorial? ");
		num = entrada.nextInt();
		
		for (int x=num-1;x>=1;x--) {
			num=num*x;
		}
		System.out.println(num);
		

	}

}
