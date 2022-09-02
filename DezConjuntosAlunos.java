package ListaRepetidores;

import java.util.Scanner;

public class DezConjuntosAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
		
		int tam = 2;
		int num [] = new int [tam];
		int altura [] = new int [tam];
		int menor =0;
		int maior = 0;
		int nMaior =0;
		int nMenor=0;
		
		
		for (int x=0;x<tam;x++) {
			System.out.print("Digite um numero: ");
			num [x]= entrada.nextInt();
			System.out.print("Digite a altura deste aluno, em centimetros: ");
			altura [x]= entrada.nextInt();
			
			if (x==0) {
				menor = altura [x];
				maior = altura [x];
				nMaior = num[x];
				nMenor = num[x];
			}
			else {
				if (altura [x]>maior) {
					maior = altura [x];
					nMaior = num[x];
				}
				if (altura [x]<menor) {
					menor = altura [x];
					nMenor = num[x];
				}
			}
			
			
		}
		System.out.println("A menor altura vale: "+menor+"cm, do aluno numero "+nMenor);
		System.out.println("A maior altura vale: "+maior+"cm, do aluno numero "+nMaior);
		
		
		
		
		
		
		
		
		

	}

}
