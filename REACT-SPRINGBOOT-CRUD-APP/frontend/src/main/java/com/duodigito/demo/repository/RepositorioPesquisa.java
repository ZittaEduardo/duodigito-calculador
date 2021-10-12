package com.duodigito.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duodigito.demo.model.pesquisado;

@Repository
public interface RepositorioPesquisa extends JpaRepository<pesquisado, Long> {

}
