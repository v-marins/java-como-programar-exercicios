package exercicios.invoice;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice nota = new Invoice("1","Biscoito",3,3.00);
        System.out.println("O valor da nota é de R$: " + nota.getInvoiceAmount());


    }
}
