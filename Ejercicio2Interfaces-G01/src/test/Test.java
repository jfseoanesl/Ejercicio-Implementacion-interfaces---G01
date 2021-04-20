package test;

import modelo.*;

public class Test {
    public static void main(String[] args) {
        
        IOperacion calculadora = new ImplCalculadoraManual();
        
        System.out.println("Multiplicacion: " + calculadora.Multiplicacion(5, 5));
        System.out.println("Division: " + calculadora.Division(25, 5));
        System.out.println("Potencia:" + calculadora.Potencia(2, 5));
        
    }
}
