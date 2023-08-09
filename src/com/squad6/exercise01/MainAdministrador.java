package com.squad6.exercise01;

public class MainAdministrador {

	public static void main(String[] args) {

		Administrador a1 = new Administrador("gustavo", "enseada", "36682", 2, 2000, 12, 600);
		a1.calcularSalario();
		
		System.out.printf("O saldo de %s é %.2f", a1.getNome(), a1.calcularSalario());
	}

}
