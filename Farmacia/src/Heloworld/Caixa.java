package Heloworld;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		Telas telas = new Telas();
		int op = 0;

		telas.menuPrincipal();
		op = dado.nextInt();
		if (op == 1) {
			telas.cadastroProdutos();
		}
		telas.loginUsuario();
	}
}
