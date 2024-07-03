package br.com.sgfirst.sgfirst.funcionario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;
import br.com.sgfirst.sgfirst.funcionario.repository.FuncionarioRepository;
import br.com.sgfirst.sgfirst.handler.APIException;
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

	@Override
	public Funcionario buscaFuncionarioAtravesId(UUID idFuncionario) {
		Funcionario funcionario = funcionarioSpringDataJPARepository.findById(idFuncionario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Funcionário não encontrado!"));
		return funcionario;
	}
	/*
	 * 
	 */

}
