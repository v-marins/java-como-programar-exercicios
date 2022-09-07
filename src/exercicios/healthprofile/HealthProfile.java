package exercicios.healthprofile;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HealthProfile {
    private String nome;
    private String sobrenome;
    private char sexo;
    private int dia;
    private int mes;
    private int anos;
    private double altura;
    private double peso;
    int idadeAnos;

    Calendar cal = GregorianCalendar.getInstance();
    private final int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
    private final int mesAtual = cal.get(Calendar.MONTH) + 1;
    private final int anoAtual = cal.get(Calendar.YEAR);

    public HealthProfile(String nome, String sobrenome, char sexo, int dia, int mes, int anos, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F') {
            this.sexo = sexo;
        }
        if(dia > 0 && dia < 32) {
            this.dia = dia;
        }
        if(mes > 0 && mes < 13) {
            this.mes = mes;
        }
        if(anos > 1900 && anos <= anoAtual) {
            this.anos = anos;
        }
        if(altura > 0.0) {
            this.altura = altura;
        }
        if(peso > 0.0) {
            this.peso = peso;
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

    public double imc(){
        return peso / (altura*altura);
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
