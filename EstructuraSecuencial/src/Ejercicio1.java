import java.util.Scanner; 
public class Ejercicio1 {
	public static void main (String[] ar) {
		Scanner teclado=new Scanner (System.in);
		int lado, producto;
		System.out.print("Ingrese el lado del cuadrado:");
		lado=teclado.nextInt();
		producto= lado * 4;
		System.out.print("El perimetro del cuadrado es:");
		System.out.print(producto);
		
	}
}

