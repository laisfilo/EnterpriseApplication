package br.com.fiap;

import br.com.fiap.Aluno;

@SuppressWarnings("all") //avisa o tipo, s� usar se ja sabe onde estao os problemas do alerta
public class Teste {
	public static void main(String[] args) {
		//instanciar um Aluno
		
		Aluno aluno = new Aluno("Marcos", "12345", null);
		
		//atribuit valor para o genero
		
		aluno.setSexo(Genero.MASCULIUNO);
		
		int nota;
	}
}
