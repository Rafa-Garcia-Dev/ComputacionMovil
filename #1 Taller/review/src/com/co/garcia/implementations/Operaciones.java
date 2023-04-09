package com.co.garcia.implementations;
import com.co.garcia.one.OperacionInterface;

public class Operaciones implements OperacionInterface {

	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double dividir(double a, double b) {
		// TODO Auto-generated method stub
		return  a / b;
	}

	
}
