package br.com.fiap;

public class Aluno extends Pessoa{
	private String rm;
	Genero sexo;
	
	public Aluno(String nome, String cpf, String rm) {
		super(nome, cpf);
		this.rm = rm;
	}
	
	@Override
	public void cadastrar() {
		
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public void setSexo(Genero masculiuno) {
		// TODO Auto-generated method stub
		
	}


}

