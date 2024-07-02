package br.com.sgfirst.sgfirst.funcionario.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioListResponse {
	
	private UUID idFuncionario;
	private String nomeCompleto;
	private String designacao;
	private Double salario;
	private String telefone;
	private String endereco;
	
	public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
		return funcionarios.stream()
				.map(FuncionarioListResponse::new)
				.collect(Collectors.toList());
	}

	public FuncionarioListResponse(Funcionario funcionario) {
		this.idFuncionario = funcionario.getIdFuncionario();
		this.nomeCompleto = funcionario.getNomeCompleto();
		this.designacao = funcionario.getDesignacao();
		this.salario = funcionario.getSalario();
		this.telefone = funcionario.getTelefone();
		this.endereco = funcionario.getEndereco();
	}

}
