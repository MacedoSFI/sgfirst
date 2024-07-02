package br.com.sgfirst.sgfirst.funcionario.service;

import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioRequest;
import br.com.sgfirst.sgfirst.funcionario.api.FuncionarioResponse;

public interface FuncionarioService {
	
	FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
	
	/*
	 * 
	List<ClienteListResponse> buscaTodosClientes();

	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	
	void deletaClienteAtravesId(UUID idCliente);

	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
	 */

}
