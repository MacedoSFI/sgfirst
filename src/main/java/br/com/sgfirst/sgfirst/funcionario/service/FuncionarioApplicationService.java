package br.com.sgfirst.sgfirst.funcionario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioListResponse;
import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioRequest;
import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioResponse;
import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;
import br.com.sgfirst.sgfirst.funcionario.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;

	@Override
	public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
		Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
		return FuncionarioResponse.builder()
				.idFuncionario(funcionario.getIdFuncionario())
				.build();
	}

	@Override
	public List<FuncionarioListResponse> buscaTodosFuncionarios() {
		List<Funcionario> funcionarios = funcionarioRepository.buscaTodosFuncionarios();
		return FuncionarioListResponse.converte(funcionarios);
	}
	/*
	 * @Override
	public List<ClienteListResponse> buscaTodosClientes() {
		
		log.info("[incia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}
	 */

}
