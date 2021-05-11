package Heloworld;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String endereco;

	public Pessoa() {
		this("Não Informado!", "Não Informado!", "Não Informado!", "Não Informado!");
	}

	public Pessoa(String _nome, String _cpf, String _telefone, String _email) {
		this.getCpf();
		this.getEmail();
		this.getEndereco();
		this.getNome();
		this.getTelefone();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void dadosPessoa() {
		System.out.println("---------------------------------------------------");
		System.out.println("                  Dados da Pessoa                  ");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("|Nome....: " + this.getNome());
		System.out.println("|CPF.....: " + this.getCpf());
		System.out.println("|Telefone: " + this.getTelefone());
		System.out.println("|Email...: " + this.getEmail());
		System.out.println("|Endereço: " + this.getEndereco());
	}
}
