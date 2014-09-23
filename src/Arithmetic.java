/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Arithmetic {


 //Método que suma dos números enteros y devuelve el resultado.
 public double diam (double radio) {

	double result = 0;
	result = 6.283185307179586476925286766559 * radio;
	return result;
 }



 //Método que resta dos números enteros y devuelve el resultado.
 public double area (double radio) {

	double result = 0;
	result = 3.1415926535897932384626433832795 * Math.pow(radio,2);
	return result;
 }

}

