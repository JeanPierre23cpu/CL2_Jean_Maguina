package com.cl2ventas.dao;

import java.util.List;

import com.cl2ventas.model.Empleado;

public interface EmpleadoDao {
	
	public String registrarEmpleado(Empleado empleado);
	
	public Empleado buscarEmpleado(int id);
	
	public List<Empleado> listarEmpleado();
	
	public String actualizarEmpleado(Empleado empleado);
	
	public String eliminarEmpleado(int id);

}
