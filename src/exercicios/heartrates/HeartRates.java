package exercicios.heartrates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int anos;
    int idadeAnos;

    Calendar cal = GregorianCalendar.getInstance();
    private final int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
    private final int mesAtual = cal.get(Calendar.MONTH) + 1;
    private final int anoAtual = cal.get(Calendar.YEAR);

    public HeartRates(String nome, String sobrenome, int dia, int mes, int anos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(dia > 0 && dia < 32) {
            this.dia = dia;
        }
        if(mes > 0 && mes < 13) {
            this.mes = mes;
        }
        if(anos > 1900 && anos <= anoAtual) {
            this.anos = anos;
        }
    }

    public int calculaIdade(){
        int nascimento = (anos * 365)+(mes*30)+dia;
        int atual = (anoAtual*365)+(mesAtual*30)+diaAtual;
        idadeAnos =  (atual - nascimento) / 365;
        return idadeAnos;
    }

    public int frequenciaMaxima(){
        return 220 - idadeAnos;
    }

    public String frequenciaAlvo(){
        int freqAlvo1 = (int) ((220 - idadeAnos) * 0.6);
        int freqAlvo2 = (int) ((220 - idadeAnos) * 0.85);

        return "Entre " + freqAlvo1 + " e " + freqAlvo2 + " batimentos";
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

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }
}
