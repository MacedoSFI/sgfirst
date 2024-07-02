package br.com.sgfirst.sgfirst.funcionario.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/funcionario")
public interface FuncionarioAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest FuncionarioRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<FuncionarioListResponse> getTodosFuncionarios();
	/*
	 * 
@RestController
@RequestMapping("/funcionario")
public interface FuncionarioAPI {
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<FuncionarioListResponse> getTodosFuncionarios();

	@GetMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.OK)
	FuncionarioDetalhadoResponse getFuncionarioAtravesId(@PathVariable UUID idFuncionario);
	
	@DeleteMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaFuncionarioAtravesId(@PathVariable UUID idFuncionario);
	
	@PatchMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraFuncionario(@PathVariable UUID idFuncionario, @Valid @RequestBody FuncionarioAlteracaoRequest FuncionarioAlteracaoRequest);
	
	 */

}
