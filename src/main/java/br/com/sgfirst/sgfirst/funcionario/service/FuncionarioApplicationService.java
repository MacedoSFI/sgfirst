package br.com.sgfirst.sgfirst.funcionario.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioAlteracaoRequest;
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

	@Override
	public void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
		Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
		funcionario.altera(funcionarioAlteracaoRequest);
		funcionarioRepository.salva(funcionario);
	}

	@Override
	public void deletaFuncionarioAtravesId(UUID idFuncionario) {
		Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
		funcionarioRepository.deletaFuncionario(funcionario);	
	}
}
