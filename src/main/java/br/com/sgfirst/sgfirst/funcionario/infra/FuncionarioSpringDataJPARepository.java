package br.com.sgfirst.sgfirst.funcionario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sgfirst.sgfirst.funcionario.domain.Funcionario;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID>{

	
}
