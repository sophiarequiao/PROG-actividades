import envios.*;

public class Main {
    public static void main(String[] args) {
        EnvioNacional envioNacional = new EnvioNacional("1234", 1.99, 34,"Sevilla",12);
        System.out.println(envioNacional.getCosteTotal());
        System.out.println(envioNacional);

        EnvioInternacional envioInternacional = new EnvioInternacional("1234", 1.99, 34,"Sevilla",12, "España");
        System.out.println(envioInternacional.getCosteTotal());
        System.out.println(envioInternacional);
    }
}