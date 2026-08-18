class MAIN2 {
    int numero;
    double preco;

    double desconto() {
        return preco > 100 ? preco * 0.15 : preco * 0.05;
    }
}

class CLIENTE {
    int numero;
    String nome, sexo;

    double descontoAdicional(double preco) {
        return sexo.equalsIgnoreCase("F") ? preco * 0.05 : 0;
    }
}

class COMPRA {
    int produto, cliente, quantidade;
    double total;

    void calcular(double preco, double desconto) {
        total = quantidade * (preco - desconto);
    }
}

public class MAIN2 {
    public static void main(String[] args) {
        PRODUTO[] p = new PRODUTO[3];

        p[0] = new PRODUTO();
        p[0].numero = 1;
        p[0].preco = 150;

        CLIENTE c = new CLIENTE();
        c.numero = 1;
        c.nome = "Maria";
        c.sexo = "F";

        COMPRA compra = new COMPRA();
        compra.produto = 1;
        compra.cliente = 1;
        compra.quantidade = 2;

        double desc = p[0].desconto();
        double adicional = c.descontoAdicional(p[0].preco - desc);

        compra.calcular(p[0].preco, desc + adicional);

        System.out.println("Valor total: R$ " + compra.total);
    }
}