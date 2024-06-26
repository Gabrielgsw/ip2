package Application;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Entities.Cliente;
import Entities.ItemVenda;
import Entities.Produto;
import Entities.Venda;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Produto p1 = new Produto(77, "Feijão", "Feijão KiCaldo", 9.70);
	        Produto p2 = new Produto(55, "Arroz", "Arroz KiCaldo", 6.50);
	        Produto p3 = new Produto(99, "Carne", "Carne bovina", 50);
	        
	        ItemVenda it1 = new ItemVenda(p1, 2);
	        ItemVenda it2 = new ItemVenda(p2, 5);
	        ItemVenda it3 = new ItemVenda(p3, 1);
	        
	        LocalDate dataNascimento = LocalDate.of(1981, 2, 15);
	        Cliente c1 = new Cliente("111555888-99", "Leandro", dataNascimento);
	        
	        // Criando a Venda efetivamente    
	        
	        Venda venda = new Venda(LocalDateTime.now(), "Bruno Marques",c1);
	        venda.setComprador(c1);
	        
	        venda.adicionarItem(it1);
	        venda.adicionarItem(it2);
	        venda.adicionarItem(it3);
	        
	        venda.listarItensVenda();
	}

}
