import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        soma operacao = new soma();

        int a;
        int b;


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor para A");
        Integer valorA = scanner.nextInt();
        System.out.println("digite um valor para B");
        int valorB = scanner.nextInt();


        if (valorA.equals(valorB)){
            System.out.println("o valor C dessa operação é: " + operacao.soma(valorA, valorB));
        }if (!valorA.equals(valorB)){
            System.out.println("o valor C dessa operação é: " + operacao.multiplicacao(valorA, valorB));
        }


    }
}