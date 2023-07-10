package com.cl2ventas.test;

import com.cl2ventas.dao.EmpleadoDao;
import com.cl2ventas.dao.impl.EmpleadoDaoImpl;
import com.cl2ventas.model.Empleado;

public class EmpleadoActualizarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoDao dao = new EmpleadoDaoImpl();
		Empleado empleado = dao.buscarEmpleado(1);
		System.out.println(empleado);
		
		empleado.setNombre("Juan Pablo");
		String mensaje = dao.actualizarEmpleado(empleado);
		System.out.println(mensaje);
		System.out.println(empleado);

	}

}
