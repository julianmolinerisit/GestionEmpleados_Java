package com.gestion.empleados.repositorios;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.gestion.empleados.entidades.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

    // Método para obtener todos los empleados con paginación
    Page<Empleado> findAll(Pageable pageable);
}
