package br.com.sgfirst.sgfirst.funcionario.repository;

import java.util.List;
import java.util.UUID;

import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	
	Funcionario salva(Funcionario funcionario);

	List<Funcionario> buscaTodosFuncionarios();
	
	Funcionario buscaFuncionarioAtravesId(UUID idFuncionario);

}
/*
 * Cliente salva(Cliente cliente);

	List<Cliente> buscaTodosClientes();

	Cliente buscaClienteAtravesId(UUID idCliente);

	void deletaCliente(Cliente cliente);
	*/
