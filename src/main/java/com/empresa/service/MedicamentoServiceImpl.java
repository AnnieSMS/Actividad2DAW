 package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	private MedicamentoRepository repository;

	@Override
	public List<Medicamento> listaMedicamento() {
		return repository.findAll();
	}

	@Override
	public Medicamento insertaActualizaMedicamento(Medicamento obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaPorId(int idMedicamento) {
		repository.deleteById(idMedicamento);
	}

	@Override
	public Optional<Medicamento> buscaPorID(int idMedicamento) {
		return repository.findById(idMedicamento);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorNombre(String nombre) {
		return repository.findByNameLike(nombre);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorStock(String stock) {
		return repository.findByStock(stock);
	}
	

	
	

}
