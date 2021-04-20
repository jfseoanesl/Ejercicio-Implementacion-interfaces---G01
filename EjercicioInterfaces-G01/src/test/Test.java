package test;

import modelo.*;

public class Test {
    public static void main(String[] args) {
        
        PuedeCantar cantantes[] = new PuedeCantar[3];
        PuedeCantar person = new Persona();
        cantantes[0]=person;
        PuedeCantar gallo = new Gallo();
        cantantes[1]=gallo;
        PuedeCantar piolin = new Canario();
        cantantes[2]=piolin;
        
        MostrarCanto(cantantes);
        
        
    }
    
    public static void MostrarCanto(PuedeCantar cantante[]){
        for(PuedeCantar p: cantante){
            p.canta();
            
        }
    }
}
