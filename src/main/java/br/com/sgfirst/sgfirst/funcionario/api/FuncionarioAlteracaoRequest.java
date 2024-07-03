package br.com.sgfirst.sgfirst.funcionario.api;

import lombok.Value;

@Value
public class FuncionarioAlteracaoRequest {
	
	private String nomeCompleto;
	private String designacao;
	private Double salario;
	private String telefone;
	private String endereco;

}
