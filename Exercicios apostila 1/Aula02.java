public class Aula02 {
    // Atividade 02 - Estrutura de decisão switch case(cardápio)
    public static void main(String[] args) {
        int op = 1;

        System.out.println("1 - Hambúrguer        R$ 15,00");
        System.out.println("2 - Pizza             R$ 30,00");
        System.out.println("3 - Salada            R$ 12,00");
        System.out.println("4 - Sorvete           R$ 8,00");
        System.out.println("5 - Suco              R$ 7,00");
        System.out.println("6 - Refrigerante      R$ 6,00");
        System.out.println("7 - Água              R$ 3,00");
        System.out.println("8 - Café              R$ 5,00");
        System.out.println("9 - Chá               R$ 4,00");
        System.out.println("10 - Bolo             R$ 10,00");
        System.out.print("Escolha uma opção: ");

        switch (op) {
                    case 1 -> System.out.println("Hambúrguer - R$ 15,00");
                    
                    case 2 -> System.out.println("Pizza - R$ 30,00");
                    
                    case 3 -> System.out.println("Salada - R$ 12,00");
                    
                    case 4 -> System.out.println("Sorvete - R$ 8,00");
                    
                    case 5 -> System.out.println("Suco - R$ 7,00");
                    
                    case 6 -> System.out.println("Refrigerante - R$ 6,00");
                    
                    case 7 -> System.out.println("Água - R$ 3,00");
                    
                    case 8 -> System.out.println("Café - R$ 5,00");
                    
                    case 9 -> System.out.println("Chá - R$ 4,00");
                    
                    case 10 -> System.out.println("Bolo - R$ 10,00");
                    
                    default -> System.out.println("Opção inválida!");
        }
    }
}
