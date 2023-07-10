package com.cl2ventas.test;

import com.cl2ventas.dao.EmpleadoDao;
import com.cl2ventas.dao.impl.EmpleadoDaoImpl;

public class EmpleadoEliminarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoDao dao = new EmpleadoDaoImpl();
		
		String mensaje = dao.eliminarEmpleado(4); 
		System.out.println(mensaje);

	}

}
