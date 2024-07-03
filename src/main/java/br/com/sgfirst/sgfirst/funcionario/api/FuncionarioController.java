package br.com.sgfirst.sgfirst.funcionario.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.sgfirst.sgfirst.funcionario.service.FuncionarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
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
	/*
	 * 

	@Override
	public List<FuncionarioListResponse> getTodosFuncionarios() {
		List<FuncionarioListResponse> funcionarios = FuncionarioService.buscaTodosFuncionarios();
		return funcionarios;
	}

	@Override
	public FuncionarioDetalhadoResponse getFuncionarioAtravesId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioController -  getFuncionarioAtravesId");
		log.info("[idCleinte] {}", idFuncionario);
		FuncionarioDetalhadoResponse FuncionarioDetalhado = FuncionarioService.buscaFuncionarioAtravesId(idFuncionario);
		log.info("[finaliza] FuncionarioController -  getFuncionarioAtravesId");
		return FuncionarioDetalhado;
	}

	@Override
	public void deletaFuncionarioAtravesId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioController -  DeletaFuncionarioAtravesId");
		log.info("[idCleinte] {}", idFuncionario);
		FuncionarioService.deletaFuncionarioAtravesId(idFuncionario);
		log.info("[finaliza] FuncionarioController -  DeletaFuncionarioAtravesId");
	}

	 */

}
