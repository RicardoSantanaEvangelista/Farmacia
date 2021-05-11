package Heloworld;

import java.util.Scanner;

public class Funcionario extends Pessoa {
	int cod; double total;
	Scanner dado = new Scanner (System.in);
	public Funcionario(String _nome, String _cpf, String _telefone, String _email) {
		super(_nome, _cpf, _telefone, _email);
	}

	public boolean verificaoFuncionario(String login, String senha) {
		String loginv = "Funcionario";
		String senhav = "123456789";
		boolean verific = false;

		if (loginv.equals(login) && senhav.equals(senha)) {
			verific = true;
		}
		return verific;
	}
	
	public void MenuVendas(){
		do{
		System.out.println("-----------------------------------");
		System.out.println("              Vendas");
		System.out.println("-----------------------------------");
		System.out.println("|Digite -1 para sair              |");
		System.out.println("|Informe o código do produto      | ");
		cod = dado.nextInt();
		}while(cod < 0);
		
		
		
	}
	
	public void CupomFiscal(){
		System.out.println("-----------------------------------");
		System.out.println("              Boleto ");
		System.out.println("-----------------------------------");
		System.out.println("|Código       Nome        Preço    |");
		System.out.println(" ----------------------------------");
		
		System.out.println("                          Total    |");
		System.out.println("                              "+total);
		System.out.println("-----------------------------------");
		
	}
	
}
