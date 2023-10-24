import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int numero1 = numero1Scanner.nextInt();
        Scanner numero2Scanner = new Scanner (System.in); 
        System.out.print("Digite o segundo numero:");
        int numero2 = numero1Scanner.nextInt();
        int resultado = numero1 + numero2;   
        System.out.println(" O resultado e: " + resultado);
    }
}