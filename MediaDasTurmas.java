package ListaRepetidores;

import java.util.Scanner;

public class MediaDasTurmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tam = 0;
		int aluno=0;
		int total = 0;
		float media = 0;
		
		System.out.print("De quantas turmas você quer saber a media? ");
		tam = entrada.nextInt();
		
		for (int x=0;x<tam;x++) {
			System.out.println("Digite o numero de alunos da turma "+x+ " (max 40 alunos): ");
			aluno = entrada.nextInt();
			while (aluno>40){
				System.out.println("Digite um numero até 40 abestado");
				aluno = entrada.nextInt();
			}
			total = total+aluno;
		}
		
		media = total/tam;
		
		System.out.println("A media de aluno entre as turmas é: " + media);

	}

}
