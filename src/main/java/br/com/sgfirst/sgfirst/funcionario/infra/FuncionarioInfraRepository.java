package br.com.sgfirst.sgfirst.funcionario.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;
import br.com.sgfirst.sgfirst.funcionario.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
	
	private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;
	
	@Override
	public Funcionario salva(Funcionario funcionario) {
		funcionarioSpringDataJPARepository.save(funcionario);
		return funcionario;
	}

	@Override
	public List<Funcionario> buscaTodosFuncionarios() {
		List<Funcionario> funcionarios = funcionarioSpringDataJPARepository.findAll();
 		return funcionarios;
	}
	/*
	 * @Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[incia] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
		
		return todosClientes;
	}
	 */

}
