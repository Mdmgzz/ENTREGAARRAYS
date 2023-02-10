package ejercicio01;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	 public static String[] bombas(String bombas[]) {
		// generamos aleatoriamente el array con las minas 
		 for (int i=0 ; i<=6;i++) {
			 bombas[(int) (Math.random()*20)]="*";
			}
		return (bombas);
	}
	 
public static void main(String[] args) {
		//bloque de variables
		String tablerOculto []=new String [20];
		String tablero []=new String [20];
		int numero; 							// sera el numero que vaya escribiendo el usuario
		
		//creamos scanner para leer los numeros del usuario
		Scanner sc= new Scanner (System.in);
		
		// llamamos a la funcion para generar las bombas
		tablerOculto=bombas(tablerOculto);
		
		//rellenemos el tablero de - en los lugares que no haya bombas
		for (int i=0 ; i<tablerOculto.length;i++) {
			if (tablerOculto[i]!="*") {
				tablerOculto[i]="-";
			}
		}

		System.out.println(Arrays.toString(tablerOculto));
		
		//llamamos a la funcion para rellenar el tablero que mostraremos con guiones
		for (int i=0 ; i<tablero.length;i++) {
			if (tablero[i]!="*") {
				tablero[i]="-";
			}
		}
		
		// empezamos mostrando el tablero vacio
		System.out.println("Empieza el juego:");
		//empezamos con el juego, mostrando el tablero vacio
		System.out.println(Arrays.toString(tablero));
		
		//pedimos al usuario un numero del 1-20 para saber si hay bomba en esa posicion

		
		// comprobamos que el numero este dentro del rango
		do {
			System.out.println("Escribe un numero del 0-19: ");
			numero=sc.nextInt();
		}while(numero>19 || numero<0); 
		
		// ahora es el momento de comprobar si en el numero dicho por el usuario hay una mina
		for (int i=0;i<tablerOculto.length;i++) {
			if (tablero[numero]=="*") {
				
			}
		}
		
		//cerramos scanner 
		sc.close();
	}

}
