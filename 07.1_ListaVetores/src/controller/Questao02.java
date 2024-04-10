package controller;

import util.Teclado;

public class Questao02 {
	public static void main(String[] args) {
		int a[] = new int[3];
		int soma = 0;
		
		for (int i = 0; i < 3; i++) {
			a[i] = Teclado.lerInt("Digite número:");
			soma +=a[i];
		}
		
		System.out.println("------------------");
		System.out.println("Somatório: " + soma);
	}
}
