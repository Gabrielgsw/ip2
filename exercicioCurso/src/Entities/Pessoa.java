package Entities;

public class Pessoa {
	
	private String name;
	private String endereco;
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(String name, String endereco) {
		super();
		this.name = name;
		this.endereco = endereco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", endereco=" + endereco + "]";
	}
	
	
	
}
