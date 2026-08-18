import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7: ");
            int dia = sc.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Número inválido!");
        }

        sc.close();
    }
    }
}
