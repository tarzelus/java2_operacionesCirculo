import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de la suma y la resta de dos números.
 */
public class MainCirculo {

	public static void main (String args[]) {


		double radio, resultadoCircun, resultadoArea;
		operacionesCirculo operaciones = new operacionesCirculo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la radio de la circunferencia en cm: ");
		radio = sc.nextInt();


		resultadoCircun = operaciones.circun(radio);
		resultadoArea = operaciones.area(radio);

		System.out.println("\nla ciercunferencia del circulo es: " + resultadoCircun +"cm");
		System.out.println("\nEl área de la circunferencia es: " + resultadoArea + "cm²");
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
