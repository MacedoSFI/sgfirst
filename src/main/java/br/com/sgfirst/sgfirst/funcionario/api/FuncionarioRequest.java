package br.com.sgfirst.sgfirst.funcionario.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioRequest {

	@NotBlank
	private String nomeCompleto;
	private String designacao;
	private Double salario;
	private String telefone;
	private String endereco;
}
