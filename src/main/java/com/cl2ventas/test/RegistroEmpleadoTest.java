package com.cl2ventas.test;

import com.cl2ventas.dao.EmpleadoDao;
import com.cl2ventas.dao.impl.EmpleadoDaoImpl;
import com.cl2ventas.model.Empleado;

public class RegistroEmpleadoTest {

	public static void main(String[] args) { 
		EmpleadoDao dao = new EmpleadoDaoImpl();
		Empleado empleado = new Empleado(0,"Juan","Perez","77777777");
		String mensaje = dao.registrarEmpleado(empleado);
		System.out.println(mensaje);

	}

}
