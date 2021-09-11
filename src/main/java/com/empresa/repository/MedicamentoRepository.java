package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

	public List<Medicamento> findByNameLike(String nombre);
	public List<Medicamento> findByStock(String stock);
}
