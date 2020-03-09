package app;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		Byte age;
		Float salary;
		
		System.out.println("Ingresa tu nombre, edad y salario: ");
		
		name = sc.nextLine();
		age = sc. nextByte();
		salary = sc.nextFloat();
		
		if (age > 60) {
			salary *= 1.15f;
		}else if (age > 50) {
			salary *= 1.10f;
		}else if (age > 18) {
			salary *= 1.05f;
		}
		
		if (age > 18) {
			System.out.printf("%s, su nuevo sueldo es de: L. %.2f.", name, salary);
		}else {
			System.out.println("¡No tienes edad para trabajar!");
		}
		
		sc.close();
	}

}
