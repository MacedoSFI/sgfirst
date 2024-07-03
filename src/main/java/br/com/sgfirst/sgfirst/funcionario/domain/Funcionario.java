package br.com.sgfirst.sgfirst.funcionario.domain;

import java.util.UUID;

import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioAlteracaoRequest;
import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idFuncionario;

	@NotBlank
	private String nomeCompleto;
	private String designacao;
	private Double salario;
	private String telefone;
	private String endereco;
	
	public Funcionario(FuncionarioRequest funcionarioRequest) {
		this.nomeCompleto = funcionarioRequest.getNomeCompleto();
		this.designacao = funcionarioRequest.getDesignacao();
		this.salario = funcionarioRequest.getSalario();
		this.telefone = funcionarioRequest.getTelefone();
		this.endereco = funcionarioRequest.getEndereco();
	}

	public void altera(FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
		this.nomeCompleto = funcionarioAlteracaoRequest.getNomeCompleto();
		this.designacao = funcionarioAlteracaoRequest.getDesignacao();
		this.salario = funcionarioAlteracaoRequest.getSalario();
		this.telefone = funcionarioAlteracaoRequest.getTelefone();
		this.endereco = funcionarioAlteracaoRequest.getEndereco();
	}
}
