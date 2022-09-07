package exercicios.date;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        if(dia > 0 && dia < 32) {
            this.dia = dia;
        }
        if(mes > 0 && mes < 13) {
            this.mes = mes;
        }
        if(ano > 1900) {
            this.ano = ano;
        }
    }

    public void displayDate(){
        System.out.println(dia +"/"+mes+"/"+ano);
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
