package exercicios.healthprofile;

import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Adicione seu nome:");
        String nome = input.nextLine();
        System.out.println("Adicione seu sobrenome:");
        String sobrenome = input.nextLine();
        System.out.println("Sexo: (M) masculino (F) feminino");
        char sexo = input.next().charAt(0);
        System.out.println("Dia do nascimento:");
        int dia = input.nextInt();
        System.out.println("Mês do nascimento:");
        int mes = input.nextInt();
        System.out.println("Ano do nascimento:");
        int ano = input.nextInt();
        System.out.println("Informe sua altura:");
        double altura = input.nextDouble();
        System.out.println("Informe seu peso:");
        double peso = input.nextDouble();

        HealthProfile profile = new HealthProfile(nome,sobrenome,sexo,dia,mes,ano,altura,peso);

        System.out.println("Sr(a) "+profile.getNome()+" "+profile.getSobrenome()+": Idade -> " +
                profile.calculaIdade()+", Sexo -> "+profile.getSexo()+", Frequencia Maxima -> " +
                profile.frequenciaMaxima()+", Frequencia Alvo -> "+profile.frequenciaAlvo()+
                ", Altura -> "+profile.getAltura()+", Peso -> "+profile.getPeso()+", IMC -> "+
                profile.imc());
    }
}
