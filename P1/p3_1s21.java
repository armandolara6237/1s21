import java.util.Scanner;

class p3_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Ingresa tu nombre ");
		cadena = teclado.nextLine();
		System.out.println("Bienvenido " + cadena + ", a la clase");
	}
}