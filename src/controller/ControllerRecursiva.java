package controller;

public class ControllerRecursiva {

	public ControllerRecursiva() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int recursiva(int num, int aux, int cont, int numSolicitado){
		if((aux%10) == numSolicitado) {
			cont++;
		}
		if(num%10 == 0) {
			return aux;
		}else {
			num = aux;
			aux = num/10;
			System.out.println(cont);
			return recursiva(num, aux, cont, numSolicitado);
		}
	}
}
