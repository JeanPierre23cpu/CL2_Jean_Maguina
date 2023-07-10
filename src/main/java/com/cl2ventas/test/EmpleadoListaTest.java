package com.cl2ventas.test;


import com.cl2ventas.dao.EmpleadoDao;
import com.cl2ventas.dao.impl.EmpleadoDaoImpl;

public class EmpleadoListaTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmpleadoDao dao = new EmpleadoDaoImpl();
		
		dao.listarEmpleado().stream().forEach(System.out::println);

	}

}
