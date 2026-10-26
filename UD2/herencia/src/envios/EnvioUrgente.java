package envios;

public class EnvioUrgente extends Envio{
    double recargo;

    public EnvioUrgente() {
    }

    public EnvioUrgente(String codigo, double costeBase, double peso, String destino, double recargo) {
        super(codigo, costeBase, peso, destino);
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getCosteTotal() {
        return super.getCosteBase() * recargo;
    }

    public String toString() {
        return " Envío urgente " + super.getCodigo() +
                "con destino a " + super.getDestino();
    }

}
