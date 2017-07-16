package com.tiagohs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiagohs.model.Professor;

@Repository("professorRepository")
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}