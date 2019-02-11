package br.com.fiap;

import java.util.Date;

public class Pessoa {
	private String cpf;
	private String nome;
	private Genero sexo;
	
	//Modificador de acesso: public, private
	//protected - pacote e nas classes filhas 
	//default/package - pacote
	
	
//	public Pessoa() {
//		super(); chama o pai
//	}
//	public Pessoa(String cpf, String nome) {
//		super();
//		this.setCpf(cpf);
//		this.nome = nome;
//	}
	
	@Deprecated
	public void cadastrar() {
		new Date("");
	}
	
	public Pessoa(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.setCpf(cpf);
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
	
	
}
