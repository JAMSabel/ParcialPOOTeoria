package Pregunta5;
import java.util.Scanner;
public class Pregunta5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
        String nombre, nombre1 = ""; 
        System.out.println("Ingrese un nombre"); 
        nombre = teclado.nextLine(); 
        nombre=nombre.replaceAll(" ", "");
        for (int i = nombre.length() - 1; i >= 0; i--) { 
            nombre1 = nombre1 + nombre.charAt(i); 
        } 
        if (nombre.compareToIgnoreCase(nombre1)==0) { 
            System.out.println("La palabra es palindroma"); 
        }else{    
            System.out.println("La palabra no es palindroma");
        } 
	}

}
