package Controladores;

import java.util.Scanner;

import Entidades.Contador;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca el maximo del contador");
		int maximo = leer.nextInt();
		System.out.print("Introduzca el valor del contador");
		int valor = leer.nextInt();
		Contador c = new Contador(maximo,valor);
		int opcion;
		do {
			System.out.println("El valor maximo del contador es: "+c.getMaximo());
			System.out.println("El valor actual del contador es: "+c.getValorContador());
		System.out.print("Introduzca una opcion");
		opcion = leer.nextInt();
		switch(opcion) {
		case 1:
			c.Resetear();
			break;
		case 2:
			c.Incrementar();
		}
		}while(opcion!=0);
		leer.close();
	}

}
