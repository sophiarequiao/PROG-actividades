package envios;

public class EnvioNacional extends Envio{
    public double iva;

    public EnvioNacional() {
    }

    public EnvioNacional(String codigo, double costeBase, double peso, String destino, double iva) {
        super(codigo, costeBase, peso, destino);
        this.iva = iva;
    }

    public EnvioNacional(String codigo, double costeBase, double peso, String destino) {
        super(codigo, costeBase, peso, destino);
        this.iva = 21.0;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getCosteTotal(){
        return super.getCosteBase()*(1+this.iva/100);
    }
    public String toString(){
        return "Envio nacional " + super.getCodigo() + " con destino a " + super.getDestino();
    }
}
