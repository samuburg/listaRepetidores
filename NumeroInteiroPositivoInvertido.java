package ListaRepetidores;

import java.util.Scanner;

public class NumeroInteiroPositivoInvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		String num = "";
		
		System.out.println("Digite um numero inteiro e positivo");
		num = entrada.next();
		String vet [] = num.split("");
		
		for (int x=num.length()-1;x>=0;x--) {
			System.out.print(vet[x]);
		}
		
	}

}
