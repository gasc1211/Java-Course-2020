import java.util.Scanner;
public class Exercise_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float n1,n2,n3,n4;
		
		System.out.println("Ingresa cuatro números: ");
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		System.out.printf("Los resultados son: %.2f, %.2f.",(n1+n2), (n3*n4));
		
		sc.close();
	}

}
