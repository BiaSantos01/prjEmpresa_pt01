package com.beatriz.PrjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.beatriz.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
