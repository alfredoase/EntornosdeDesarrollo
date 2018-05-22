package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Clase examen, varios metodos que trabajan con numeros.
 * 
 * @author alfredo
 * @version 1.0
 */
public class Examen {
	
	//VARIABLES
	private int num1;
	private int num2;
	private int num3;
	
	/**
	 * CONSTRUCTOR DE 3 PARAMETROS
	 * @param a
	 * @param b
	 * @param c
	 */
	public Examen(int a, int b, int c){
		this.num1 = a;
		this.num2 = b;
		this.num3 = c;
	}
	
	/**
	 * METODO QUE CUENTA LOS NUMEROS IGUALES QUE HAY ENTRE 3 NUMEROS
	 * @param num1, num2, num3
	 * @return contador
	 */
	public int ContadorIguales(){
		int[] listaNumeros = new int[3];
        listaNumeros[0] = num1;
        listaNumeros[1] = num2;
        listaNumeros[2] = num3;
        
        int contador = 0;
        
        for(int i = 0; i < listaNumeros.length; i++){
        	for (int j = i + 1 ; j < listaNumeros.length; j++) {
	            if(listaNumeros[i] == listaNumeros[j - 1]){
	                contador++;
	            }
        	}
        }
		
		return contador;
	}
	
	/**
	 * METODO QUE DEVUELVE EL MENOR DE 3 NUMEROS
	 * @param num1, num2, num3
	 * @return numeroMenor
	 */
	public int numeroMenor() {
		int numMenor = 0;
        int[] listaNumeros = new int[3];
        listaNumeros[0] = num1;
        listaNumeros[1] = num2;
        listaNumeros[2] = num3;
        
        for(int i = 0; i < listaNumeros.length; i++){
        	for (int j = 0; j < listaNumeros.length; j++) {
	            if(listaNumeros[i] < listaNumeros[j]){
	                numMenor = listaNumeros[i];
	            }
        	}
        }
		return numMenor;
	}
	
	/**
	 * METODO QUE DEVUELVE EL MAYOR DE 3 NUMEROS
	 * @param num1, num2, num3
	 * @return numeroMenor
	 */
	public int numeroMayor() {
		int numMayor = 0;
        int[] listaNumeros = new int[3];
        listaNumeros[0] = num1;
        listaNumeros[1] = num2;
        listaNumeros[2] = num3;
        
        for(int i = 0; i < listaNumeros.length; i++){
        	for (int j = 0; j < listaNumeros.length; j++) {
	            if(listaNumeros[i] < listaNumeros[j]){
	                numMayor = listaNumeros[j];
	            }
        	}
        }
		return numMayor;
	}
}