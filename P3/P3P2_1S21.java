import java.util.Scanner;
public class P3P2_1S21{
	static Scanner teclado=new Scanner(System.in);
	public static void suma(){
	System.out.println("Suma de 2 num");
	System.out.println("Ingrese el 1er num");
	int a=teclado.nextInt();
	System.out.println("Ingrese el 2do num");
int b=teclado.nextInt();
int c=a+b;
System.out.println("La suma fue" +c);
}
public static void Resta(){
	System.out.println("Resta de 2 num");
	System.out.println("Ingrese el 1er num");
int a=teclado.nextInt();
System.out.println("Ingrese el 2do num");
int b=teclado.nextInt();
int c=a-b;
System.out.println("La resta fue" +c);
}
public static void Division(){
	System.out.println("Division de 2 num");
	System.out.println("Ingrese el 1er num");
int a=teclado.nextInt();
System.out.println("Ingrese el 2do num");
int b=teclado.nextInt();
int c=a/b;
System.out.println("La division fue" +c);
}
public static void Multiplicacion(){
	System.out.println("Multiplicacion de 2 num");
	System.out.println("Ingrese el 1er num");
int a=teclado.nextInt();
System.out.println("Ingrese el 2do num");
int b=teclado.nextInt();
int c=a*b;
System.out.println("La multiplicacion fue" +c);
}
public static void menu(){
System.out.println("Operaciones Basicas");
System.out.println("\n A)Suma");
System.out.println("B)Resta");
System.out.println("C)Division");
System.out.println("D)Multiplicacion");
System.out.println("S)Salir");
System.out.println("\n Que opcion deseas");
}

public static void main(String[]args){
	boolean estado = true;
	while(estado){
		switch(opc){

			case 'S': estado=false;break;
		}
		public static void main(String[]args){
			menu();
	String opc=teclado.nextLine();
	if(opc.equals("A"))suma();
	if(opc.equals("B"))Resta();
	if(opc.equals("C"))Division();
	if(opc.equals("D"))Multiplicacion();
	if(opc.equals("S"))Salir();
}



