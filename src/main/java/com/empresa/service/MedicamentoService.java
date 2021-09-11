package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;


public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();
	public abstract Medicamento insertaActualizaMedicamento(Medicamento obj);
	public abstract void eliminaPorId(int idMedicamento);
	public abstract Optional<Medicamento> buscaPorID(int idMedicamento);
	public abstract List<Medicamento> listaMedicamentoPorNombre(String nombre);
	public abstract List<Medicamento> listaMedicamentoPorStock(String stock);

}
