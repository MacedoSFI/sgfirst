package br.com.sgfirst.sgfirst.funcionario.repository;

import java.util.List;

import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	
	Funcionario salva(Funcionario funcionario);

	List<Funcionario> buscaTodosFuncionarios();

}
/*
 * Cliente salva(Cliente cliente);

	List<Cliente> buscaTodosClientes();

	Cliente buscaClienteAtravesId(UUID idCliente);

	void deletaCliente(Cliente cliente);
	*/
