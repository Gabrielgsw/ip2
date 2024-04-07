package Entities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Venda {

	private LocalDateTime data;
	private String atendente;
	private Cliente comprador;
	private List<ItemVenda> itensVenda;
	
	public Venda(LocalDateTime data, String atendente, Cliente comprador) {
		//super();
		this.data = data;
		this.atendente = atendente;
		this.comprador = comprador;
		this.itensVenda = new ArrayList<>();
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}
	
	public void adicionarItem(ItemVenda iv) {
		itensVenda.add(iv);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(ItemVenda i : itensVenda) {
			total += i.calcularTotal();
		}
		return total;
	}
	
	public void listarItensVenda() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.printf("Data da venda: %s\n",sdf.format(this.data));
		System.out.printf("Cliente: %s | CPF: %s | idade: %s\n",this.comprador.getNome(),this.comprador.getCpf(),this.comprador.calcularIdade());
		System.out.printf("Atendente: %s\n\n",this.atendente);
		
		System.out.println("Nome do produto | Preco    | Quantidade | Total ");
		System.out.println("-------------------------------------------------------------");
		
		for(ItemVenda i : itensVenda) {
			System.out.printf("%s   |  %s  |  %s   | R$ %s\n",i.getProdutoVendido().getNome(),i.getProdutoVendido().getPreco(),i.getQuantidade(),i.getQuantidade()*i.getProdutoVendido().getPreco());
		}
		System.out.println("-------------------------------------------------------------");
		System.out.printf("Total da venda:            R$ %s",this.calcularTotal());
	}
	
}
