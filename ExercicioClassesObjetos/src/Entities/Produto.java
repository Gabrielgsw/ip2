package Entities;

public class Produto {

	private int codigo;
	private String nome;
	private String descricao;
	private double preco;
	
	public Produto() {
		
	}
	
	public Produto(int Codigo, String Nome, String descricao, double Preco) {
		this.codigo = Codigo;
		this.nome = Nome;
		this.descricao = descricao;
		this.preco = Preco;			
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setCodigo(int Codigo) {
		codigo = Codigo;
	}
	
	public void setNome(String Nome) {
		nome = Nome;
	}
	
	public void setDescricao(String Descricao) {
		descricao = Descricao;
	}
	
	public void setPreco(double Preco) {
		preco = Preco;
	}
}
