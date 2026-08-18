class Aluno {
    int codigo;
    String nome;

    Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}

class Disciplina {
    int codigo;
    String nome;
    int carga;

    Disciplina(int codigo, String nome, int carga) {
        this.codigo = codigo;
        this.nome = nome;
        this.carga = carga;
    }
}

class DisciplinaPratica extends Disciplina {
    int pratica;

    DisciplinaPratica(int codigo, String nome, int carga, int pratica) {
        super(codigo, nome, carga);
        this.pratica = pratica;
    }
}

class Matricula {
    int ano, serie;
    Aluno aluno;
    Disciplina disciplina;
    double n1, n2, n3, n4;

    Matricula(int ano, int serie, Aluno aluno, Disciplina disciplina) {
        this.ano = ano;
        this.serie = serie;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    double media() {
        if (disciplina instanceof DisciplinaPratica)
            return (n1 + n2 * 2 + n3 + n4 * 2) / 6;
        return (n1 + n2 + n3 + n4) / 4;
    }
}

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1234, "Joãozinho");

        Disciplina ingles =
            new DisciplinaPratica(1, "Inglês", 100, 40);

        Matricula m =
            new Matricula(2026, 1, aluno, ingles);

        m.n1 = 5;
        m.n2 = 7;
        m.n3 = 10;
        m.n4 = 7.5;

        System.out.println("Código: " + aluno.codigo);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Disciplina: " + ingles.nome);
        System.out.println("Média: " + m.media());
    }
}