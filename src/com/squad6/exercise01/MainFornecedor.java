package com.squad6.exercise01;

public class MainFornecedor {

	public static void main(String[] args) {

		Fornecedor f1 = new Fornecedor("gustavo", "enseada", "36682", 269.80, 300);
		f1.obterSaldo();
		
		System.out.printf("O saldo de %s é %.2f", f1.getNome(), f1.obterSaldo());
	}

}
