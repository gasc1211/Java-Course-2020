import java.util.Scanner;
public class Exercise_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte qty;
		float total;
		
		System.out.println("Ingresa la cantidad de artículos: ");
		qty = sc.nextByte();
		
		total = qty * 15.85f;
		
		if (qty > 50) {
			total *= 0.79f;
		}
		
		System.out.printf("El total es de: L. %.2f.", total);
		
		sc.close();
		
	}
}
