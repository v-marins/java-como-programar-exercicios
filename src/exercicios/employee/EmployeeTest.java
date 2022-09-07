package exercicios.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee funcionario1 = new Employee("Carlos","Manuel",-2500);
        Employee funcionario2 = new Employee("Rodolfo", "Rodrigues",1500);

        System.out.println("Funcionário: " + funcionario1.getNome()+" "+funcionario1.getSobrenome()+". Salário anual R$ = " + funcionario1.salarioAnual());
        System.out.println("Funcionário: " + funcionario2.getNome()+" "+funcionario2.getSobrenome()+". Salário anual R$ = " +funcionario2.salarioAnual());

        funcionario1.aumento();
        funcionario2.aumento();

        System.out.println("Funcionário: " + funcionario1.getNome()+" "+funcionario1.getSobrenome()+". Salário anual R$ = " + funcionario1.salarioAnual());
        System.out.println("Funcionário: " + funcionario2.getNome()+" "+funcionario2.getSobrenome()+". Salário anual R$ = " +funcionario2.salarioAnual());


    }
}
