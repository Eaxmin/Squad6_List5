package com.squad6.exercise01;

public class MainVendedor {

	public static void main(String[] args) {

		Vendedor v1 = new Vendedor("gustavo", "enseada", "36682", 2, 2000, 12, 2900, 30);
		v1.calcularSalario();
		
		System.out.printf("O saldo de %s é %.2f", v1.getNome(), v1.calcularSalario());
	}

}
