package br.com.sgfirst.sgfirst.funcionario.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.sgfirst.sgfirst.funcionario.service.FuncionarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
	
	private final FuncionarioService FuncionarioService;
	
	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest FuncionarioRequest) {
		FuncionarioResponse funcionarioCriado = FuncionarioService.criaFuncionario(FuncionarioRequest);
		return funcionarioCriado;
	}

	@Override
	public List<FuncionarioListResponse> getTodosFuncionarios() {
		List<FuncionarioListResponse> funcionarios = FuncionarioService.buscaTodosFuncionarios();
		return funcionarios;
	}

	@Override
	public void patchAlteraFuncionario(UUID idFuncionario,
			@Valid FuncionarioAlteracaoRequest FuncionarioAlteracaoRequest) {
		FuncionarioService.patchAlteraFuncionario(idFuncionario, FuncionarioAlteracaoRequest);
	}

	@Override
	public void deletaFuncionarioAtravesId(UUID idFuncionario) {
		FuncionarioService.deletaFuncionarioAtravesId(idFuncionario);		
	}
}
