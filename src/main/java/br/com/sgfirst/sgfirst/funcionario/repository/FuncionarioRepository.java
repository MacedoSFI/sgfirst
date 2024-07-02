package br.com.sgfirst.sgfirst.funcionario.repository;

import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	
	Funcionario salva(Funcionario funcionario);

}
/*
 * Cliente salva(Cliente cliente);

	List<Cliente> buscaTodosClientes();

	Cliente buscaClienteAtravesId(UUID idCliente);

	void deletaCliente(Cliente cliente);
	*/
