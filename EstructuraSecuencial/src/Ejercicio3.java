import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3,num4,suma,promedio;
		System.out.print("El primer valor es: ");
		num1=teclado.nextInt();
		System.out.print("El segundo valor es: ");
		num2=teclado.nextInt();
		System.out.print("El tercer valor es: ");
		num3=teclado.nextInt();
		System.out.print("El cuarto valor es: ");
		num4=teclado.nextInt();
		suma=num1 + num2 + num3 + num4;
		promedio= suma / 4;
		System.out.print("La suma de los valores es: ");
		System.out.println(suma);
		System.out.print("El promedio de los valores es: ");
		System.out.println(promedio);
	}

}
