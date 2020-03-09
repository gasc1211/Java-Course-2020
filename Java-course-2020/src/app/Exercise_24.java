package app;

import java.util.Hashtable;

public class Exercise_24 {

	public static void main(String[] args) {

		Float pem, pet, pen;
		
		pem = 75f;
		pet = 100f;
		pen = 210f;
		
		pem /= 50f;
		pet /= 60f;
		pen /= 110f;
		
		Hashtable<Float, String> average = new Hashtable<Float, String>();
		
		average.put(pem, "Mañana");
		average.put(pet, "Tarde");
		average.put(pen, "Noche");
		
		System.out.printf("El promedio mayor es el de la jornada de la %s.", average.get(Math.max(pem, Math.max(pet, pen))));
	}

}
