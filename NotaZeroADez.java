package ListaRepetidores;

import java.util.Scanner;

public class NotaZeroADez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		float nota = 11;
		
		while (nota>10 || nota<0) {
			System.out.println("Digite a nota: ");
			nota = entrada.nextInt();
		}
		
		System.out.println("Você digitou a nota: "+nota);

	}

}
