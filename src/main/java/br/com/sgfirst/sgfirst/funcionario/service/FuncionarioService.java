package br.com.sgfirst.sgfirst.funcionario.service;

import java.util.List;

import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioListResponse;
import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioRequest;
import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioResponse;

public interface FuncionarioService {
	
	FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

	List<FuncionarioListResponse> buscaTodosFuncionarios();
	
	/*
	 * 
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	
	void deletaClienteAtravesId(UUID idCliente);

	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
	 */

}
