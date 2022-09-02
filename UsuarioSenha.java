package ListaRepetidores;

import java.util.Scanner;

public class UsuarioSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String usuario = "";
		String senha ="";
		
		System.out.println("Digite o nome de usuário: ");
		usuario = entrada.next();
		senha = usuario;
		
		while (senha.equals(usuario)) {
			System.out.println("Digite uma senha válida: ");
			senha = entrada.next();
		}
		
		
		System.out.println("Usuário: " + usuario);
		System.out.println("Senha: "+ senha);
		

	}

}
