package ListaRepetidores;

import java.util.Scanner;

public class ValorCDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tam = 0;
		float cd=0;
		float total = 0;
		float media = 0;
		
		
		System.out.print("De quantas cds voce tem? ");
		tam = entrada.nextInt();
		
		float [] valorCD = new float [tam];
		
		for (int x=0;x<tam;x++) {
			System.out.println("Digite o valor pago pelo cd "+x+ ": ");
			cd = entrada.nextInt();
			total = total+cd;
			valorCD [x] = cd;
		}
		
		media = total/tam;
		
		System.out.println("O valor medio pago pelos cds é " + media +" reais");
		for (int x=0;x<tam;x++) {
			System.out.println("No cd "+x+ " voce pagou " + valorCD[x]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
