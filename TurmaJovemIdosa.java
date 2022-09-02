package ListaRepetidores;

import java.util.Scanner;

public class TurmaJovemIdosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tam = 0;
		float idade=0;
		float total = 0;
		float media = 0;
		
		System.out.print("A media de idade de quantas pessoas voce deseja saber? ");
		tam = entrada.nextInt();
		
		for (int x=0;x<tam;x++) {
			System.out.println("Digite a idade "+x);
			idade = entrada.nextFloat();
			total = total+idade;
		}
		
		media = total/tam;

		
		System.out.println("A media entre as idades digitada é: "+media);
		if (media<25) {
			System.out.print("Turma Jovem");
		}
		if (media>25 && media<60 ) {
			System.out.print("Turma Adulta");
		}
		if (media>60 ) {
			System.out.print("Turma Idosa");
		}
		
		
		
		
	}
		
		
		
		
	}

