/*
 * Mauricio Sanchez Barragan
 * Calculadora 
 * */

package main;

import java.io.*;

public class Main {	
		
	public static void main(String[] args) {
		try{
			
		// Se crea las variables	
		int num1,num2,operar;		
		// Se crea el buffer de almacenamiento
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("/*****************/");
		System.out.println("/** CALCULADORA **/");
		System.out.print("Ingrese el primer Numero (Debe ser el mayor de los dos) : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("Ingrese el segundo Numero: ");
		num2 = Integer.parseInt(br.readLine());
		System.out.println("/*************************/");
		do{
			System.out.println("/** MENU DE OPERACIONES **/");
			System.out.println("1. SUMAR");
			System.out.println("2. RESTAR");
			System.out.println("3. MULTIPLICAR");
			System.out.println("4. DIVIDIR");
			System.out.println("5. SALIR");
			System.out.println("Ingrese Opcion a ejecutar: ");
			operar = Integer.parseInt(br.readLine());
			// Logica del programa
			if(operar == 1){
				int suma = num1 + num2;
				System.out.println("El resultado de la suma es: " + suma);
							}
			if(operar == 2){
				int resta = num1 - num2;
				System.out.println("El resultado de la resta es: " + resta);
							}
			if(operar == 3){
				int multi = num1 * num2;
				System.out.println("El resultado de la multiplicacion es: " + multi);
							}
			if(operar == 4){
				int divi = num1 / num2;
				System.out.println("El resultado de la division es: " + divi);
							}
			if(operar == 5){ System.out.println("ADIOS"); }
			System.out.println("");
			}while(operar != 5);
		}
		catch(Exception ex){}
	}

}
