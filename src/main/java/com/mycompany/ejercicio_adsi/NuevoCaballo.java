
package com.mycompany.ejercicio_adsi;

public class NuevoCaballo {
    
    public static void main(String[] args) {
        
        Caballo caballo1 = new Caballo("Tornado", 8, 1.60, 430);
        
        System.out.println(caballo1);
        caballo1.correr();
        caballo1.levantaCabeza();
        
        
    }
}
