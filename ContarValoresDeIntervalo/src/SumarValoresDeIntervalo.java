import java.util.Scanner;		//IMPORTAR SCANNER
public class SumarValoresDeIntervalo {

	//INTERVALO DEFINIDO POR USUARIO
	//MOSTRAR CANTIDAD DE NUMS MENORES AL ANTERIOR EN LA SECUENCIA
	//FINALIZAR SECUENCIA AL INTRODUCIR UN VALOR FUERA DEL INTERVALO
	
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		
		//INTERVALO: [A,B]
		System.out.println("Introduzca el primer valor del intervalo: ");		//SOLICITAR VALOR A DEL INTERVALO
		double a = teclado.nextDouble();		//ALMACENAR VALOR EN A
		System.out.println("Introduzca el �ltimo valor del intervalo: ");		//SOLICITAR VALOR B DEL INTERVALO
		double b = teclado.nextDouble();		//ALMACENAR VALOR EN B
		System.out.println("Introduzca el valor del primer n�mero: ");		//SOLICITAR PRIMER VALOR DE LA SECUENCIA
		double x = teclado.nextDouble();		//ALMACENAR VALOR EN X
		
		double anterior = x;		//ASIGNAR EL VALOR ANTERIOR AL SIGUIENTE (X) EN ANTERIOR
		int contador = 0;		//CONTADOR DE N�MEROS MENORES AL ANTERIOR
		
		while (a<=x && x<=b) {		//MIENTRAS LOS VALORES DE X EST�N EN EL INTERVALO
			System.out.print("Introduzca el siguiente valor: ");		//SOLICITAR VALOR
			x = teclado.nextDouble();		//ALMACENAR VALOR EN X
			if (anterior>x) {		//COMPARAR VALOR NUEVO DE X CON ANTERIOR (ANTERIOR = VALOR ANTIGUO DE X L�NEA 20)
				contador++;		//CONDICI�N TRUE: AUMENTAR VALOR DE CONTADOR EN UNO
				
				/*JUSTIFICACI�N EXISTENCIA DE SIGUIENTE CONDICI�N:
				 * AL INTRODUCIR EL VALOR FUERA DEL INTERVALO, PUEDE SER MENOR AL ANTERIOR ==> SER�A MENOR A A.
				 * AL SER MENOR AL ANTERIOR (POR SER MENOR A TODOS) EL CONTADOR SUMAR�A UN VALOR.
				 * SI TENEMOS EN CUENTA QUE EL ESTE N�MERO NO CUENTA POR ESTAR FUERA DEL INTERVALO,
				 * DEBEMOS RESTAR UNO AL CONTADOR 
				 */
				
				if (x<a) {		//SI X ES MENOR A A (FUERA DEL INTERVALO ==> MENOR A CUALQUIER OTRO VALOR)
					contador--;		//RESTAR UNO AL CONTADOR		SUPONIENDO QUE EL �LTIMO N�MERO (EL QUE EST� FUERA DEL INTERVALO) NO SE CUENTA
				}
			}
			anterior = x;		//ACTUALIZAR VALOR DE ANTERIOR
		}
				//OUTPUT
		System.out.printf("El n�mero de valores consecutivos en los que el primero era menor que el segundo es de: %d. (Sin contar el valor fuera del intervalo)",contador);
	}
}
