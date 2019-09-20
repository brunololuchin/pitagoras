import java.util.Scanner;
public class IFSimples {
private static Scanner entrada;

public static void main(String args[]) {
	entrada = new Scanner (System.in);
	char Animal;
	System.out.println("Voce tem algum animal(S ou N)?");
	Animal = entrada.next().charAt(0);
	if(Animal=='S')System.out.println("Vá Dar Comida");
	else System.out.println("Vai Adotar!");	
    }
}