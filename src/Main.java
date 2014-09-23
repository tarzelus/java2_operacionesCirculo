import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de la suma y la resta de dos números.
 */
public class Main {

	public static void main (String args[]) {


		double radio, resultadoDiametro, resultadoArea;
		Arithmetic operaciones = new Arithmetic();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la radio de la circunferencia en cm: ");
		radio = sc.nextInt();


		resultadoDiametro = operaciones.diam(radio);
		resultadoArea = operaciones.area(radio);

		System.out.println("\nEl del diametro de la circunferencia es: " + resultadoDiametro +"cm");
		System.out.println("\nEl área de la circunferencia es: " + resultadoArea + "cm²");
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
