package Heloworld;

public class Produtos {

	private String nomeproduto;
	private String cod;
	private String categoria;
	private double preco;
	private String validade;
	private int quantidade;

	public Produtos() {
		this(null, null, null, 0000, null, 0000);
	}

	public Produtos(String nomeproduto, String cod, String categoria, double preco, String validade, int quantidade) {
		this.getNomeproduto();
		this.getCod();
		this.getCategoria();
		this.getPreco();
		this.getValidade();
		this.getQuantidade();
	}

	// aprimorar gets and sets//
	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		if (nomeproduto.equals(" ")) {
			this.nomeproduto = "N�o informado";
		} else
			this.nomeproduto = nomeproduto;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		if (cod.equals(" ")) {
			this.cod = "N�o informado";
		} else
			this.cod = cod;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		if (validade.equals(" ")) {
			this.validade = "00/00/0000";
		} else
			this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void DadosdoProduto() {
		System.out.println("--------------------------------------");
		System.out.println("          Dados do Produto     ");
		System.out.println("--------------------------------------");
		System.out.println("Nome......:       " + this.getNomeproduto());
		System.out.println("C�digo....:       " + this.getCod());
		System.out.println("Categoria.:       " + this.getCategoria());
		System.out.println("Pre�o.....:       " + this.getPreco());
		System.out.println("Validade..:       " + this.getValidade());
		System.out.println("Estoque...:       " + this.getQuantidade());
		System.out.println("--------------------------------------");
	}

}
