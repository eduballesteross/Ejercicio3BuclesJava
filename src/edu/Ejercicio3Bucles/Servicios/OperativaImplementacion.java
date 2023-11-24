package edu.Ejercicio3Bucles.Servicios;

import java.util.Random;
import java.util.Scanner;

public class OperativaImplementacion implements operativaInterfaz {

    public int CapturaEnteroIntento(String mensaje, Scanner scanner) {
        int intento;

        do {
            System.out.println(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("[ERROR] Introduzca un número entero válido");
                System.out.println(mensaje);
                scanner.next();
            }

            intento = scanner.nextInt();

            if (intento <= 0 || intento>100) {
                System.out.println("[ERROR] Debe introducir un número del 1 al 100 para adivinarlo.");
            }

        } while (intento <= 0);

        return intento;
    }
    
    public void AcertarRamdon(int intento) {
        Random random = new Random();

        int numIntentos = 0, numeroAleatorio;
        numeroAleatorio = random.nextInt(100) + 1;

        while (numIntentos<10) {
        
        numIntentos++;
        
        	if(intento>numeroAleatorio) {
        	
        		System.out.println("El numero introducido es menor al numero que tienes que adivinar");
        		
        	}else if(intento<numeroAleatorio){
                	
            		System.out.println("El numero introducido es mayor al numero que tienes que adivinar");
        	
        	}else {
        		 System.out.println("¡¡¡¡HAS ACERTADO EL NÚMERO ALEATORIO!!!!!");    
                 System.out.println("Has acertado en el intento número " + numIntentos);
                 return; 
        	}
        	
        	 System.out.println("Inténtalo de nuevo: ");
             intento = CapturaEnteroIntento("", new Scanner(System.in));
         }
        
        
        System.out.println("Agotaste tus intentos. El número aleatorio era: " + numeroAleatorio);
    }
}

	

