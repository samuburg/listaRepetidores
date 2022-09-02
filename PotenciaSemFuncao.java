package ListaRepetidores;

import java.util.Scanner;

public class PotenciaSemFuncao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int n1 = 0;
		int n2 = 0;
		int multiplica = 1;
		
		System.out.println("DIgite um numero para a base: ");
		n1 = entrada.nextInt();
		System.out.println("DIgite um numero para o expoente: ");
		n2 = entrada.nextInt();
		
		//multiplica=n1;
		System.out.println("O primeiro numero elevado no segundo vale: ");
		
		for (int x=0;x<n2;x++) {
			multiplica*=n1;
		}
		System.out.println(multiplica);

	}

}
