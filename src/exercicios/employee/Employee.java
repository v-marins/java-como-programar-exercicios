package exercicios.employee;

public class Employee {

    private String nome;
    private String sobrenome;
    private double salario;

    public Employee(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario > 0) {
            this.salario = salario;
        }
    }

    public double salarioAnual(){
        return salario*12;
    }

    public void aumento(){
         salario += salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
