package br.com.sgfirst.sgfirst.funcionario.infra;

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

}
