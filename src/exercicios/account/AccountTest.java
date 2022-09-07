package exercicios.account;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double depositAmount;
        double withdrawAmount;

        Account account1 = new Account("Jane Red" , 50.00);
        Account account2 = new Account("Jane Blue", -71.00);

        displayAccount(account1);
        displayAccount(account2);

        System.out.println("Adicione o valor de depósito para " + account1.getName());
        depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        displayAccount(account1);


        System.out.println("Adicione o valor de depósito para " + account2.getName());
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        displayAccount(account2);

        System.out.println("Adicione o valor do saque para: " + account1.getName());
        withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);
        displayAccount(account1);
    }
    public static void displayAccount(Account account){
        System.out.println(account.getName() + " Saldo: " + account.getBalance());
    }
}
