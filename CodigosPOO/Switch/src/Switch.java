import java.util.Scanner;
public class Switch {
    private static Scanner entrada;

	public static void main(String[] args){
        entrada = new Scanner(System.in);
        String Trabalho;
        
        System.out.println("Em que setor voc� trabalha (Ti ou Vendas)?");
        Trabalho = entrada.next();        
        switch(Trabalho){
            case "Ti":
                System.out.println("Voc� pertence ao setor de Ti");
                break;
            case "Vendas":
                System.out.println("Voc� pertence ao setor de Vendas");
                break;
            default:
                System.out.println("Digite SOMENTE o setor de Ti e de Vendas.");
                break;
        }
    }
}

