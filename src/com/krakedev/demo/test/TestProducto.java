package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto(2565, "Atun");
		
		producto.setDescripcion("Rico y barato");
		producto.setPeso(0.95);
		
		System.out.println("PRODUCTO");
		System.out.println("Codigo: "+ producto.getCodigo());
		System.out.println("Nombre: "+ producto.getNombre());
		System.out.println("Descripcion: "+ producto.getDescripcion());
		System.out.println("Peso: "+ producto.getPeso());
		
		

	}

}
