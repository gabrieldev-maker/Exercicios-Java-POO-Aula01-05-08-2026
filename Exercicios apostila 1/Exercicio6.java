import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            
            while (opcao != 4) {
                
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Dizer Olá");
                System.out.println("2 - Mostrar a data");
                System.out.println("3 - Exibir uma mensagem");
                System.out.println("4 - Sair");
                System.out.print("Escolha uma opção: ");
                
                opcao = sc.nextInt();
                
                switch (opcao) {
                    case 1 -> System.out.println("Olá! Seja bem-vindo!");
                    
                    case 2 -> System.out.println("Data: 06/08/2026");
                    
                    case 3 -> System.out.println("Você está aprendendo Java!");
                    
                    case 4 -> System.out.println("Programa encerrado.");
                    
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    }
}