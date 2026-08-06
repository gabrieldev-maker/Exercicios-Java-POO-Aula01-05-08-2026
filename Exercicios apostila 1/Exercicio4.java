import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            int soma = 0;

        System.out.println("Digite números (0 para encerrar):");

        while (true) {
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

    }
}
}