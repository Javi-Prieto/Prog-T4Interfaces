package ejercicio3;

import java.util.Random;

public class ArrayReales implements IEstadistica {
	//Fields
	double [] num;
	//Constructorr

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}
	//Methods
	public double generarAleatorio(double hasta, double desde) {
		Random rnd = new Random(System.nanoTime());
		return rnd.nextDouble(hasta- desde +1)+ desde;
	}
	public void rellenarArray(double hasta, double desde) {
		for(int i = 0; i < num.length; i++) {
			num[i] = generarAleatorio(hasta, desde);
		}
	}
	
	public double calcularMinimo() {
		double minimo = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i] < minimo) {
				minimo = num[i];
			}
		}
		return minimo;
	}
	public double calcularMaximo() {
		double maximo = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i] > maximo) {
				maximo = num[i];
			}
		}
		return maximo;
	}
	public double calcularSumatorio() {
		double suma= 0;
		for(int i = 0; i < num.length; i++) {
			suma += num[i];
		}
		return suma;
	}
	public void mostrarArray() {
		for(int i = 0; i < num.length; i++) {
			System.out.println((i+1)+". " + num[i]);
		}
	}
}
