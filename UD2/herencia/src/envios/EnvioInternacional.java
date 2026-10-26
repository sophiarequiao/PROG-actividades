package envios;

public class EnvioInternacional extends Envio {
    private double tasaAduanas;
    private String paisDestino;

    public EnvioInternacional() {
    }

    public EnvioInternacional(String codigo, double costeBase, double peso, String destino, double tasaAduanas, String paisDestino) {
        super(codigo, costeBase, peso, destino);
        this.tasaAduanas = tasaAduanas;
        this.paisDestino = paisDestino;
    }

    public double getTasaAduanas() {
        return tasaAduanas;
    }

    public void setTasaAduanas(double tasaAduanas) {
        this.tasaAduanas = tasaAduanas;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }
    public double getCosteTotal() {
        return super.getCosteBase() * (1 + this.tasaAduanas / 100);
    }
    @Override
    public String toString() {
        return "Envío internacional" + super.getCodigo() +
                " con destino a " + super.getDestino() +
                "(" + paisDestino + ")";
    }
}
