
import java.util.Scanner;
public class Exercise_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		byte n, nn, s;
		n = 0;
		
		System.out.println("Ingresa la cantidad de números y el paso: ");
		nn = sc.nextByte();
		s = sc.nextByte();
		
		for(byte i = 1; i == nn; i += s) {
			n += i;
		}
		
		System.out.printf("La media es de: %.2f.", n/nn);
		
		sc.close();
	}

}
