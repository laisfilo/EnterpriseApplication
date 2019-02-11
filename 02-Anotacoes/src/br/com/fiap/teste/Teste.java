package br.com.fiap.teste;

import java.lang.reflect.Field;

import br.com.fiap.anotacoes.Coluna;
import br.com.fiap.anotacoes.Tabela;
import br.com.fiap.bean.Aluno;
import br.com.fiap.bean.Carro;

public class Teste {

		public static void main(String[] args) {
			//instanciar carro
			Carro carro = new Carro();
			criarTabela(carro); //chamei o metodo
			criarSelect(carro);
			
			Aluno aluno = new Aluno();
			criarSelect(aluno);
			
		}
		
		public static void criarTabela(Object obj) {
			//API Reflection vamos recuperar nome da classe;
			
			//coloca no metodo
			String nome = obj.getClass().getName();			
			System.out.println(nome);
			
			//recuparar atributos d classe
			Field[] atributos = obj.getClass().getDeclaredFields(); //com declared eu pego todos os campos que foram declarados na minha classe
			
			for(Field f : atributos) {
				System.out.println(f.getName());
				
				//recuperar a anotacao que esta acima dos atributos(@coluna)
				Coluna anotacao = f.getAnnotation(Coluna.class);
				System.out.println("Nome: " + anotacao.nome());
				System.out.println("Tipo: " + anotacao.tipo());
				System.out.println("Obrigatorio: " + anotacao.obrigatorio());
			}
		}
		
		public static void criarSelect(Object obj) {
			//recuperar nome configurado na anotcao @tabela
			Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
			
			
			//exibir sql
			System.out.println("SELECT * FROM " + anotacao.nome());
			
		}
}
