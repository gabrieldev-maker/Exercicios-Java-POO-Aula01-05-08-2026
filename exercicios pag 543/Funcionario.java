public class Funcionario {
    private int numero;
    private String nome;
    private String cargo;
    private double salario;

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}

class Dependente {
    private Funcionario funcionario;
    private String nome;

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario f) { funcionario = f; }
    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }
}

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNumero(1);
        f.setNome("João");
        f.setCargo("Analista");
        f.setSalario(3000);

        Dependente d = new Dependente();
        d.setFuncionario(f);
        d.setNome("Pedro");

        System.out.println("Funcionário: " + f.getNome());
        System.out.println("Salário: R$ " + f.getSalario());
        System.out.println("Dependente: " + d.getNome());
        System.out.println("Bônus: R$ " + f.getSalario() * 0.02);
    }
} 
    

