package edu.Ejercicio3Bucles.Controladores;

import java.util.Random;
import java.util.Scanner;

import edu.Ejercicio3Bucles.Servicios.OperativaImplementacion;
import edu.Ejercicio3Bucles.Servicios.operativaInterfaz;


public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		operativaInterfaz operativaI = new OperativaImplementacion();
		
		int intento;
		
		intento=operativaI.CapturaEnteroIntento("[INFO] El programa trata de intentar adivinar un número aleotorio entre el 1 y el 100. Intente adivinar el numero introduciendo un número.", scanner);
		operativaI.AcertarRamdon(intento);
		
	}

}
