/*
* Analisis
* Descripcion del programa: Programa para calcular costos de paquete 
* Entradas: 
* Salidas: costos de viaje, costos de hospedaje, total a pagar
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_CADA_NOCHE_CON_ATALAS = 150000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        int edad, documento,noches_de_estadia; 
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
          System.out.println("Cual es tu edad?");
        edad = escaner.nextInt();
             System.out.println("Digita tu numero de documento");
        documento = escaner.nextInt();
              System.out.println("Desde que ciudad te estas comunicando?");
        nombre = escaner.nextLine();
              System.out.println("Cuantas noches piensas hospedarte?");
        noches_de_estadia = escaner.nextInt();

        // ...
        System.out.println("Bienvenido " + nombre + "!");
        // ...

        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        int vuelo_de_ida;
        int vuelo_de_vuelta;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(vuelo_de_ida, vuelo_de_vuelta); // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
       
	}
    public int calcularTotalTransporte(int vuelo_de_ida, vuelo_de_vuelta){
        return vuelo_de_ida + vuelo_de_vuelta;
    }
       
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }

	

	
}