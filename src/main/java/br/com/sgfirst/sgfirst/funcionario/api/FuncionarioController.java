package br.com.sgfirst.sgfirst.funcionario.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.sgfirst.sgfirst.funcionario.service.FuncionarioService;
import lombok.RequiredArgsConstructor;

@RestController
//@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
	
	private final FuncionarioService FuncionarioService;
	
	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest FuncionarioRequest) {
		FuncionarioResponse funcionarioCriado = FuncionarioService.criaFuncionario(FuncionarioRequest);
		return funcionarioCriado;
	}
	/*
	 * 

	private final FuncionarioService FuncionarioService;
	
	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest FuncionarioRequest){
		log.info("[inicia] FuncionarioController -  postFuncionario");
		FuncionarioResponse FuncionarioCriado = FuncionarioService.criaFuncionario(FuncionarioRequest);
		log.info("[finaliza] FuncionarioController -  postFuncionario");
		return FuncionarioCriado;
	}

	@Override
	public List<FuncionarioListResponse> getTodosFuncionario() {
		log.info("[inicia] FuncionarioController -  getTodosFuncionario");
		List<FuncionarioListResponse> Funcionarios = FuncionarioService.buscaTodosFuncionarios();
		log.info("[finaliza] FuncionarioController -  getTodosFuncionario");
		return Funcionarios;
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

	@Override
	public void patchAlteraFuncionario(UUID idFuncionario, @Valid FuncionarioAlteracaoRequest FuncionarioAlteracaoRequest) {
		log.info("[inicia] FuncionarioController -  patchAlteraFuncionario");
		log.info("[idFuncionario] {}", idFuncionario);
		FuncionarioService.patchAlteraFuncionario(idFuncionario, FuncionarioAlteracaoRequest);
		log.info("[finaliza] FuncionarioController -  patchAlteraFuncionario");
	}

	 */

}
