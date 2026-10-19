public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Parte 1 ---------");

        System.out.println("\n Ejercicio 1: \n");
        saludar();

        System.out.println("\n Ejercicio 2: \n");
        saludarNombre("Sophia");
        saludarNombre("Jose");

        System.out.println("\n Ejercicio 3: \n");
        System.out.println(sumar(2,5));

        System.out.println("\n Ejercicio 4: \n");
        System.out.println(celsiusAFahrenheit(31.0));

        System.out.println("\n Ejercicio 5: \n");
        System.out.println(2.0);

        System.out.println("\n Ejercicio 6: \n");
        System.out.println(media(6.0, 5.6, 3.9));

        System.out.println("\n Ejercicio 7: \n");
        System.out.println("La manzana es " + "roja");

        System.out.println("\n Ejercicio 8: \n");
        System.out.println(nombreCompleto("Pepito", "Pepito", "Pepito"));

        System.out.println("\n Ejercicio 9: \n");
        System.out.println(2006);

        System.out.println("\n Ejercicio 10: \n");
        presentacion("Pepito", "Pepito", "Pepito", 2006);

        System.out.println("\n Ejercicio 11: \n");
        System.out.println("11001");

        System.out.println("\n Ejercicio 12: \n");
        System.out.println("1754");

        System.out.println("\n Ejercicio 13: \n");
        System.out.println("2A45F");

        System.out.println("\n Ejercicio 14: \n");
        System.out.println(124);

        System.out.println("--------- Parte 2 ---------");

        System.out.println("\n Ejercicio 1: \n");
        bienvenida();

        System.out.println("\n Ejercicio 2: \n");
        bienvenidaNombre("Pepito");

        System.out.println("\n Ejercicio 3: \n");
        System.out.println(doble(34));

        System.out.println("\n Ejercicio 4: \n");
        System.out.println(precioConIVA(12.4));

        System.out.println("\n Ejercicio 5: \n");
        System.out.println(precioConImpuesto(12.4, "45%"));

        System.out.println("\n Ejercicio 6: \n");
        System.out.println(volumenCubo(10));

        System.out.println("\n Ejercicio 7: \n");
        System.out.println(tiempoASegundos(12, 15, 10));

        System.out.println("\n Ejercicio 8: \n");
        System.out.println(decoraTexto("texto de Sophia"));

        System.out.println("\n Ejercicio 9: \n");
        System.out.println(formateaNombre("Pepito", "Pérez Álvarez"));

        System.out.println("\n Ejercicio 10: \n");
        System.out.println("Aprobado: " + aprobado(4, 9, 6));

        System.out.println("\n Ejercicio 11: \n");
        alumnoAprobado("Pepito", "Pérez Álvarez", 4, 9, 6);

    }

    public static void saludar(){
        System.out.println("Hola mundo");
    }

    public static void saludarNombre(String nombre){
        System.out.println("Hola " + nombre);
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static double celsiusAFahrenheit(double temperatura){
        return temperatura * 1.8 + 32;
    }

    public static double areaCirculo(double radio){
        return radio * Math.pow(Math.PI, 2);
    }

    public static double media(double a, double b, double c){
        return (a + b + c)/3;
    }

    public static String concatenar(String a, String b, String c){
        return a + b + c;
    }

    public static String nombreCompleto(String nombre, String primerApellido, String ultimoApellido){
        return nombre + " " + primerApellido + " " + ultimoApellido;
    }

    public  static int edadActual(int anyoNacimiento){
        return 2026 - anyoNacimiento;
    }

    public  static void presentacion(String nombre, String primerApellido, String ultimoApellido, int anyoNacimiento){
        System.out.println("Hola, soy " + nombreCompleto(nombre,primerApellido,ultimoApellido) +
                " y tengo " + edadActual(anyoNacimiento) + " años");
    }

    public  static int  binarioADecimal(String binario){
        return Integer.parseInt(binario, 2);
    }

    public  static int  octalADecimal(String octal){
        return Integer.parseInt(octal, 8);
    }

    public  static int hexadecimalADecimal(String hexadecimal){
        return Integer.parseInt(hexadecimal, 16);
    }

    public static void decimalABinOctHex(int  decimal){
        String binario = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Decimal: " + decimal +
                "\n Binario: " + binario +
                "\n Octal: " + octal +
                "\n Hexadecimal:  " + hexadecimal);
    }

    public static void bienvenida(){
        System.out.println("Te doy la bienvenida a la clase de Programación");
    }

    public static void bienvenidaNombre(String nombre){
        System.out.println("Hola, " + nombre + ", the doy la bienvenida a la clase de Programación");
    }

    public static double doble(double numero){
        return numero * 2;
    }

    public static double precioConIVA(double precio){
        return 1.21*precio;
    }

    public static double precioConImpuesto(double precio, String impuesto){
        return precio * (1 + (double)Integer.parseInt(impuesto.substring(0,impuesto.length()-2))/100);
    }

    public static double volumenCubo(double lado){
        return Math.pow(lado,3);
    }

    public static int tiempoASegundos(int horas, int minutos, int segundos){
        return horas + 3600 + minutos * 60 + segundos;
    }

    public static String decoraTexto(String texto){
        return "===<" + texto + ">===";
    }
    public static String formateaNombre(String nombre, String apellidos){
        return apellidos + ", " + nombre;
    }

    public static boolean aprobado(int nota1, int nota2, int nota3){
        return nota1 + nota2 + nota3 / 3 >= 5;
    }

    public static void alumnoAprobado(String nombre, String apellidos, int nota1, int nota2, int nota3){
        System.out.println(formateaNombre(nombre, apellidos) + " ha aprobado: " + aprobado(nota1,nota2,nota3));
    }


}