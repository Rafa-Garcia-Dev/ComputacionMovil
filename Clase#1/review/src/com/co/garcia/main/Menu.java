package com.co.garcia.main;

import java.util.Scanner;

import com.co.garcia.implementations.Operaciones;
import com.co.garcia.one.OperacionInterface;

public class Menu {

	Scanner sc = new Scanner(System.in);
	Operaciones op = new Operaciones();

	public void mostrarMenu() {

		System.out.println("Digite el numero uno :");
		double numUno = sc.nextDouble();

		System.out.println("Digite el numero Dos :");
		double numDos = sc.nextDouble();

		System.out.println("Que operacion desea hacer :");
		int seleccion = sc.nextInt();
		
		
		switch (seleccion) {
		case 1:
			System.out.println(op.sumar(numUno, numDos));
		break;
		case 2:
			System.out.println(op.restar(numUno, numDos));
		break;
		case 3:
			System.out.println(op.dividir(numUno, numDos));
		break;
		case 4:
			System.out.println(op.multiplicar(numUno, numDos));
		break;

		
	}
		

	}

	
	
	
}
