package controller;

import util.Teclado;

public class Questao01 {
	public static void main(String[] args) {
		String nome[] = new String[5];
		String profissao[] = new String[5];
		
		for (int i = 0; i < 3; i++) {
			nome[i] = Teclado.lerTexto("Digite nome:");
			profissao[i] = Teclado.lerTexto("Digite profissao:");
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(nome[i] + " é " + profissao[i]);
		}
	}
}