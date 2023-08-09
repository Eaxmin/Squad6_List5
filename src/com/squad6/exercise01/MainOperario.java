package com.squad6.exercise01;

public class MainOperario {

	public static void main(String[] args) {

		Operario o1 = new Operario("gustavo", "enseada", "36682", 2, 2000, 12, 2900, 30);
		o1.calcularSalario();
		
		System.out.printf("O saldo de %s é %.2f", o1.getNome(), o1.calcularSalario());
	}

}
