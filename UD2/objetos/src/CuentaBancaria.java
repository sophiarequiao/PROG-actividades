public class CuentaBancaria {
    String titular;
    String nombreBanco;
    double saldo;

    public CuentaBancaria(){}

    public CuentaBancaria(String titular, String nombreBanco, double saldo){
        this.titular = titular;
        this.nombreBanco = nombreBanco;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, String nombreBanco){
        this.titular = titular;
        this.nombreBanco = nombreBanco;
        saldo = 100;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String nombre){
        this.titular = titular;
    }

    public String getNombreBanco(){
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco){
        this.nombreBanco = nombreBanco;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void retirar(double cantidad){
        saldo -= cantidad;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
    }

    public String toString(){
        return "Saldo de " + titular + "(" + nombreBanco + "):" + saldo + "€";
    }




}
