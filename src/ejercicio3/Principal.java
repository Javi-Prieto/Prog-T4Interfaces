package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		ArrayReales arr;
		double [] nums;
		int tam, hasta, desde;
		System.out.println("Indique la cantidad de números que va a mirar");
		tam = Leer.datoInt();
		nums = new double[tam];
		arr = new ArrayReales(nums);
		System.out.println("Indique el mayor de los numeros autogenerados");
		hasta = Leer.datoInt();
		System.out.println("Indique el menor de los número autogenerados");
		desde = Leer.datoInt();
		arr.rellenarArray(hasta, desde);
		arr.mostrarArray();
		System.out.printf("El mínimo es: %.2f\n", arr.calcularMinimo());
		System.out.printf("El maximo es: %.2f\n", arr.calcularMaximo());
		System.out.printf("La suma es: %.2f\n", arr.calcularSumatorio());


	}

}
