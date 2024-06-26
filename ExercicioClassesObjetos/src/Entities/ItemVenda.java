package Entities;

public class ItemVenda {
	
	private int quantidade;
	private Produto produtoVendido;
	
	public ItemVenda(Produto produtovendido,int quantidade) {
		//super();
		this.quantidade = quantidade;
		this.produtoVendido = produtovendido; 
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
		
	public Produto getProdutoVendido() {
		return produtoVendido;
	}

	public void setProdutoVendido(Produto produtoVendido) {
		this.produtoVendido = produtoVendido;
	}

	public double calcularTotal() {
		return quantidade*getProdutoVendido().getPreco();
	}
	
}
