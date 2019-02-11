package br.com.fiap.anotacoes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Mnater a anotcao ate a execucao - default mantem s� ate o codigo
@Retention(RetentionPolicy.RUNTIME)
//Pra que serve a anota�ao
@Target(ElementType.FIELD)

public @interface Coluna {
	String nome();
	String tipo();
	boolean obrigatorio() default false;
}

