package mx.com.calculadora.presentacion;

import java.util.Scanner;
import mx.com.calculadora.negocio.Operaciones;

public class main {
    
    public static void main(String[] args) {
        double primerNumeroFormateado = 0;
        double segundoNumeroFormateado = 0;
        var opcion = -1;
        var scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        
        while(opcion != 0){
            System.out.println("\nElige una opcion: \n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicacion\n"
                + "4. Dividir\n"
                + "0. Salir\n");
            opcion = Integer.parseInt(scanner.nextLine());
            
        if(opcion != 0){    
            System.out.println("Ingresa el primer numero");
            var primerNumero = scanner.nextLine();
            Operaciones.validacionNumero(primerNumero);
            primerNumeroFormateado = Double.parseDouble(primerNumero);
//            double primerNumeroFormateado = operaciones.redondearADosDecimales(primerNumero);
            
            System.out.println("Ingresa el segundo numero");
            var segundoNumero = scanner.nextLine();
            operaciones.validacionNumero(segundoNumero);
            segundoNumeroFormateado = Double.parseDouble(segundoNumero);
//            double segundoNumeroFormateado = operaciones.redondearADosDecimales(segundoNumero);
        }
        
            switch(opcion){
                case 1:
                   operaciones.sumar(primerNumeroFormateado,segundoNumeroFormateado);
                    break;
                case 2:
                    operaciones.restar(primerNumeroFormateado, segundoNumeroFormateado);
                    break;
                case 3:
                    operaciones.multiplicar(primerNumeroFormateado, segundoNumeroFormateado);
                    break;
                case 4:
                    operaciones.dividir(primerNumeroFormateado, segundoNumeroFormateado);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
                
        }
    }
}
