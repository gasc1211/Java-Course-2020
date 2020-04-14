package app;

import javax.swing.JOptionPane;

public class Exercise_111 {
	public static void main(String[] args) {
		
		float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el area de cada habitación (m):"));
		int rooms = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de habitaiciones:"));
		int ceramicDimensions = 9;
		int amountOfTilesPerBox = 10;


		int totalCeramicBoxes = (int) Math.ceil(((area * rooms * 10000) / ceramicDimensions) / amountOfTilesPerBox);

		JOptionPane.showMessageDialog(null, String.format("El total de cajas de ceramica necesarias es: %,3d.", totalCeramicBoxes), "Resultado", 1);

	}
}