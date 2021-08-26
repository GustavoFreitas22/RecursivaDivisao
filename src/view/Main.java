package view;

import controller.ControllerRecursiva;

public class Main {
	public static void main(String[] args) {
		int num = 555;
		int cont = 0;
		int numSolicitado = 5;
		int aux = num;
		
		ControllerRecursiva recursiva = new ControllerRecursiva();
		
		num = recursiva.recursiva(num, aux, cont, numSolicitado);
		
	}
}
