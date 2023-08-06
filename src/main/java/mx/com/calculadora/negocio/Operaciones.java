package mx.com.calculadora.negocio;

import java.text.DecimalFormat;
import mx.com.calculadora.excepciones.Excepciones;

public class Operaciones {

    public static void validacionNumero(String numeroString) {
        boolean entradaValida = false;
        int reintentos = 0;
        boolean prueba = numeroString.matches("-?\\d+(\\.\\d+)?");

        try{
        while (!entradaValida) {
            
            if (numeroString.matches("-?\\d+(\\.\\d+)?")) {
                entradaValida = true;

            } else {
                throw new Excepciones("Numero Invalido, favor de considerar solo numeros enteros o numeros con decimales");
            }}
            
        }
        catch(Excepciones e){
                System.err.println("Error: " + e.getMessage());
            }
    }

    public static double redondearADosDecimales(double Numero) {
        String numeroFormato = "";

        DecimalFormat df = new DecimalFormat("#.##");
        numeroFormato = df.format(Numero);
        Numero = Double.parseDouble(numeroFormato);

        return Numero;
    }

    public static double sumar(double primerNumero, double segundoNumero) {
        double suma = 0;
        suma = primerNumero + segundoNumero;
        suma = redondearADosDecimales(suma);
        System.out.println("La suma de los 2 numeros es: " + suma);
        return suma;
    }

    public static double restar(double primerNumero, double segundoNumero) {
        double restar = 0;
        restar = primerNumero - segundoNumero;
        restar = redondearADosDecimales(restar);
        System.out.println("La resta de los 2 numeros es: " + restar);
        return restar;
    }

    public static double multiplicar(double primerNumero, double segundoNumero) {
        double multiplicacion = 0;
        multiplicacion = primerNumero * segundoNumero;
        multiplicacion = redondearADosDecimales(multiplicacion);
        System.out.println("La multiplicacion de los 2 numeros es: " + multiplicacion);
        return multiplicacion;
    }

    public static double dividir(double primerNumero, double segundoNumero) {
        double dividir = 0;
        dividir = primerNumero * segundoNumero;
        dividir = redondearADosDecimales(dividir);
        System.out.println("La division de los 2 numeros es: " + dividir);
        return dividir;
    }

}
