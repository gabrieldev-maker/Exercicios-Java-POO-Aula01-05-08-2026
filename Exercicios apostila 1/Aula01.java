public class Aula01 {
    public static void main(String[] args) {
        int idade = 43;

        if (idade >= 16 && idade < 18 || idade >= 70) {
            System.out.println("Facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }
}
}