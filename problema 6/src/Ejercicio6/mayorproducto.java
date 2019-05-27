package Ejercicio6;
import java.util.Scanner;
public class mayorproducto {
	private static Scanner Lector;
	public static void main(String[] args) {
		System.out.println("Ingresar la dimension del Vector:");
		Lector = new Scanner(System.in);
		int x=Lector.nextInt();
		int Vector[]= new int[x];
		int Producto=0, ProdMax=0;
		//Ingresamos los elementos del vector a utilizar
		System.out.println("Ingresar los elementos del Vector:");
		for (int i=0;i<Vector.length;i++) {	
			Vector[i]=Lector.nextInt();
		}
		//Vamos a hallar el producto mayor del vector
		for (int j=0;j<Vector.length-3;j++) {
			Producto=Vector[j]*Vector[j+1]*Vector[j+2]*Vector[j+3];
			if (Producto>ProdMax) {
				ProdMax=Producto;
			}
		}
		//Tenemos que buscar 4 numeros consecutivos que nos den el mayor producto
		for (int j=0;j<Vector.length-3;j++) {
			if (Vector[j]*Vector[j+1]*Vector[j+2]*Vector[j+3]==ProdMax) {
				System.out.println("El Producto Maximo es: "+ProdMax+"");
				System.out.println("y es generado por:"+Vector[j]+" "+Vector[j+1]+" "+Vector[j+2]+" "+Vector[j+3]+" ");
			}
		}
	}
}
