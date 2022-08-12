package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		VetorController vet = new VetorController();
		int[] vetor = {5, 8, 4, 3};
		int tamanho = vetor.length;
		int resultado = vet.soma(vetor, tamanho);
		System.out.println(resultado);
	}
}
