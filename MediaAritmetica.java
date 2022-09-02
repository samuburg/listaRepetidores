package ListaRepetidores;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tam = 0;
		float nota=0;
		float total = 0;
		float media = 0;
		
		System.out.print("A media de quantas notas voce deseja saber? ");
		tam = entrada.nextInt();
		
		for (int x=0;x<tam;x++) {
			System.out.println("Digite a nota "+x);
			nota = entrada.nextFloat();
			total = total+nota;
		}
		
		media = total/tam;

		
		System.out.print("A media entre as notas digitada é: "+media);
	}

}
