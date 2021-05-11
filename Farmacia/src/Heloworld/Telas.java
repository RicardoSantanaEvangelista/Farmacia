package Heloworld;

import java.util.Scanner;

public class Telas {
	Scanner dado = new Scanner(System.in);
	Funcionario funcionario = new Funcionario(null, null, null, null);
	Produtos produtos = new Produtos();

	public void menuPrincipal() {
		System.out.println("--------------------------------------------");
		System.out.println("              Menu Principal ");
		System.out.println("--------------------------------------------");
		System.out.println("|1 - Cadastro de Produtos|");
		System.out.println("|2 - Cadastro de Produtos|");
		System.out.println("|3 - Consulta de Produto |");
		System.out.println("|Informe o que deseja: ");

	}

	public void loginUsuario() {
		String login, senha;
		System.out.println("--------------------------------------------");
		System.out.println("                  Bem-vindo                 ");
		System.out.println("--------------------------------------------");
		System.out.println("|---------------Login cliente---------------|");
		System.out.println("|Informe o login: ");
		login = dado.nextLine();
		System.out.println("|Informe a senha: ");
		senha = dado.nextLine();
		while (!funcionario.verificaoFuncionario(login, senha)) {
			if (funcionario.verificaoFuncionario(login, senha)) {
				System.out.println("---------------Login Aceito--------------");
			} else {
				System.out.println("--------------Login Recusado-------------");
			}
		}

	}

	public void cadastroProdutos() {
		System.out.println("--------------------------------------------");
		System.out.println("          Cadastro de Produtos");
		System.out.println("--------------------------------------------");
		System.out.println("Informe o nome do produto: ");
		produtos.setNomeproduto(dado.nextLine());
		System.out.println("Informe o nome código: ");
		produtos.setCod(dado.next());
		dado.nextLine();
		System.out.println("Informe a categoria: ");
		produtos.setCategoria(dado.nextLine());
		System.out.println("Informe o preço:");
		produtos.setPreco(dado.nextDouble());
		dado.nextLine();
		System.out.println("Informe a validade: ");
		produtos.setValidade(dado.next());
		dado.nextLine();
		System.out.println("Informe a Quantidade: ");
		produtos.setQuantidade(dado.nextInt());
		dado.nextLine();
	}
}
