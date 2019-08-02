import java.util.Scanner;

public class ArraysInicio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaración de un array
		int[] array = new int[5];
		
		//Inicializar un array
		/*
		array[0]=-1;
		array[1]=-1;
		array[2]=-1;
		array[3]=-1;
		array[4]=-1;
		*/
		
		//Mostramos el array nuevo antes de inicializar
		for(int i=0; i<5; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	
		//Iniciarlizar un array (mejor opcion)
		for(int i=0; i<5; i++)
		{
			array[i]=i;
		}
		
		//Mostramos la posición de memoria del array
		System.out.println(array);
		
		//Mostrar un array entero
		for(int i=0; i<5; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		//Un String es una Array controlado por Java, no tenemos acceso directametne a sus celdas.
		String hola="HOLA MUNDO";
		//Mostramos el contenido caracter por caracter del tipo String llamado "hola".
		for(int i=0; i<8; i++)
		{
			System.out.print(hola.charAt(i));
		}
		
		System.out.println();
		//En lugar de introducir nosotros el tamaño introducimos la longitud del array
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		//Introducimos nosotros el tamaño del array por teclado.
		int tam=0;
		int[] array2;
		
		System.out.print("\nIntroduzca el tamaño del vector: ");
		tam=teclado.nextInt();
		teclado.nextLine();
		
		array2 = new int[tam];
		
		for(int i=0; i<array2.length; i++)
		{
			array2[i]=i;
		}
		
		for(int i=0; i<array2.length; i++)
		{
			System.out.println(array2[i] + " ");
		}
	}
}