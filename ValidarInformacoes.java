package ListaRepetidores;

import java.util.Scanner;

public class ValidarInformacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		String nome = "";
		int idade = -1;
		float salario = 0;
		String sexo = "";
		Boolean validaSexo = false;
		String estadoCivil = "";
		Boolean validaEstado = false;

		while (idade<0 || idade>150) {
			System.out.println("Idade: ");
			idade = entrada.nextInt();
		}
		
		while (salario<=0) {
			System.out.println("salario: ");
			salario = entrada.nextFloat();
		}
		
		while (validaEstado ==false) {
			System.out.println("Estado Civil: (s - solteiro, c - casado, d - divorciado, v - viuvo ");
			estadoCivil = entrada.next().toUpperCase();
			if (estadoCivil.equals("C")|| estadoCivil.equals("S") || estadoCivil.equals("V") || estadoCivil.equals("D")) {
				validaEstado = true;
			}
		}
		
		while (validaSexo ==false) {
			System.out.println("Sexo: M ou F ");
			sexo = entrada.next().toUpperCase();
			if (sexo.equals("M")|| sexo.equals("F")) {
				validaSexo = true;
			}
		}
		
		
		
		
		
	}

}
