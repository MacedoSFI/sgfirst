package br.com.sgfirst.sgfirst.funcionario.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FuncionarioResponse {
	
	private UUID idFuncionario;

}
