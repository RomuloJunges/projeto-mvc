package com.projeto.boot.dao;

import org.springframework.stereotype.Repository;

import com.projeto.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
