import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int cantidad;
		float precio;
		float importe;
		System.out.print("Cantidad de articulos: ");
		cantidad=teclado.nextInt();
		System.out.print("Valor unitario articulo: ");
		precio=teclado.nextFloat();
		importe= precio * cantidad;
		System.out.print("El importe a abonar es: ");
		System.out.print(importe);
	}

}
