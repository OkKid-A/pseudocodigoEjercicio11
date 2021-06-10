import java.util.Scanner;

public class Ejercicio11{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int impares = 0;
		int pares = 0;
		int totalPar = 0;
		int docena = 0;
		int mayor = 0;
		for (int i = 0;i < 10;i++) {
			System.out.println("\nIngresa un número");
			int muestra = scanner.nextInt();
			if (muestra > mayor) {
				mayor = muestra;
			}
			if ((muestra % 2) == 0 && muestra != 0) {
				pares++;
				totalPar += muestra;
			} else if (muestra != 0){
				impares++;
			}
			if (muestra > 12 && muestra <= 24) {
				docena++;
			}
		}
		double promedio = totalPar/pares;
		System.out.println("\nHay " + impares + " impares, el promedio de los pares es " + promedio + ", el número más grande es " + mayor + " y hay " + docena + " números de la segunda docena");
	}

	/* Para solucionar el inciso e deberiamos cambiar el loop por:
	int muestra = 0;
	do {
			System.out.println("\nIngresa un número");
			muestra = scanner.nextInt();
			if (muestra > mayor) {
				mayor = muestra;
			}
			if ((muestra % 2) == 0 && muestra != 0) {
				pares++;
				totalPar += muestra;
			} else if (muestra != 0){
				impares++;
			}
			if (muestra > 12 && muestra <= 24) {
				docena++;
			}
		} while (muestra != 36);
	*/
}