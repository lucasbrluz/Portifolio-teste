package br.com.codificando.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import br.com.codificando.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    

}
