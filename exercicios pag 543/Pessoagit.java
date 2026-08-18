class PESSOA {
    String nome;
    int idade;

    int idadeMeses() {
        return idade * 12;
    }

    int idade2050() {
        return idade + (2050 - 2026);
    }
}

public class Pessoagit pull {
    public static void main(String[] args) {
        PESSOA p = new PESSOA();

        p.nome = "João";
        p.idade = 20;

        System.out.println("a) Idade em meses: " + p.idadeMeses());
        System.out.println("b) Idade em 2050: " + p.idade2050());
    }
}