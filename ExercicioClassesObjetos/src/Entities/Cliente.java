package Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Cliente {

	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	
	public Cliente(String cpf, String nome, LocalDate dataNascimento) {
		//super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public int calcularIdade() {
		return (int)ChronoUnit.YEARS.between(this.dataNascimento, LocalDateTime.now());
	}
	
}
