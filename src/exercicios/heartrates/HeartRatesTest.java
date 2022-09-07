package exercicios.heartrates;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.println("Informe seu sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.println("Informe o dia do seu nascimento: ");
        int dia = input.nextInt();
        System.out.println("Informe o mes do seu nascimento: ");
        int mes = input.nextInt();
        System.out.println("Informe o ano do seu nascimento: ");
        int ano = input.nextInt();

        HeartRates rate = new HeartRates(nome, sobrenome,dia,mes,ano);

        System.out.println("Sr(a)" + rate.getNome()+" "+rate.getSobrenome()+" -> Idade: " + rate.calculaIdade()+", Frequencia Máxima -> "+rate.frequenciaMaxima()+", Frequencia Alvo -> "+rate.frequenciaAlvo());



    }
}
