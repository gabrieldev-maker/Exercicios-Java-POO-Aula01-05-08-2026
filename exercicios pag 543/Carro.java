public class Carro {
    private String placa;
    private int ano;

    public void setPlaca(String p) { placa = p; }
    public void setAno(int a) { ano = a; }
    public String getPlaca() { return placa; }
    public int getAno() { return ano; }

    public int imposto(int atual) {
        int uso = atual - ano;
        if (uso >= 10) return 0;
        return Math.max(100, 500 - uso * 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro[] c = new Carro[5];
        int atual = 2021, total = 0, sem = 0;

        for (int i = 0; i < 5; i++) {
            c[i] = new Carro();
            c[i].setPlaca("ABC" + i);
            c[i].setAno(2015 + i);

            int imp = c[i].imposto(atual);
            System.out.println(c[i].getPlaca() + ": R$ " + imp);

            total += imp;
            if (imp == 0) sem++;
        }

        System.out.println("Total: R$ " + total);
        System.out.println("Sem imposto: " + sem);
    }
} 
