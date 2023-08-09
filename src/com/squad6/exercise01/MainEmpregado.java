package com.squad6.exercise01;

public class MainEmpregado {

	public static void main(String[] args) {

		Empregado e1 = new Empregado("gustavo", "enseada", "36682", 2, 2000, 12);
		e1.calcularSalario();
		
		System.out.printf("O saldo de %s é %.2f", e1.getNome(), e1.calcularSalario());
	}
}