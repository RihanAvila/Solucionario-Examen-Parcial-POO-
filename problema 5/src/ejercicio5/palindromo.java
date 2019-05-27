package ejercicio5;
import java.util.Scanner;
public class palindromo {
	private static Scanner Lector;
	public static void main(String[] args) {
		Lector = new Scanner(System.in);
		System.out.println("Ingrese su palabra o frase:");
		String Cadena=Lector.nextLine();
		String Cadena1="";
		String Cadena2="";
		for (int i=0;i<Cadena.length();i++) {
			if (Cadena.charAt(i)!=' ') {
				Cadena1=Cadena1+Cadena.charAt(i);
			}
		}
		for (int i=Cadena.length()-1;i>=0;i--) {
			if (Cadena.charAt(i)!=' ') {
				Cadena2=Cadena2+Cadena.charAt(i);
			}
		}
		if (Cadena1.equals(Cadena2)) {
			System.out.print("¡ES UN PALINDROMO!");
		}else {
			System.out.print("¡NO ES PALINDROMO!");
		}
	}
}
	