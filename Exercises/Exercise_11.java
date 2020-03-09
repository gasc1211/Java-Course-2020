import java.util.Scanner;
import static java.lang.System.out;
public class Exercise_11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n;
		
		out.println("Ingresa un número entre 10 y 20 en letras: ");
		n = sc.nextLine();
		
		switch (n.toLowerCase()) {
			case "diez":
				out.println("10");
				break;
			case "once":
				out.println("11");
				break;
			case "doce":
				out.println("12");
				break;
			case "trece":
				out.println("13");
				break;
			case "catorce":
				out.println("14");
				break;
			case "quince":
				out.println("15");
				break;
			case "dieciseis":
				out.println("16");
				break;
			case "diecisiete":
				out.println("17");
				break;
			case "dieciocho":
				out.println("18");
				break;
			case "diecinueve":
				out.println("19");
				break;
			case "veinte":
				out.println("20");
				break;
			default:
				out.println("Error: dato no válido.");
				break;
		}
		
		sc.close();
	}
}
