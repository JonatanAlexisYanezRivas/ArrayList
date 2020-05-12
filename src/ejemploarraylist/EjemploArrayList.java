/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Batman
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//______________________________________________________________________        
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        lista.forEach(Elemento -> {
            System.out.println("Valor de la lista " + Elemento);
                if(Elemento.equals("D")){
                    System.out.println("Se encontro la cadena ");
                }
        });
        
//______________________________________________________________________        
     lista.add("G");
     lista.add("H");
        System.out.println("\n\n otra forma de recorrer la lista \n");
     for ( String contenido : lista){
         System.out.println("Valor de la lista " + contenido);
     }
     lista.add("I");
     lista.add("J");
     lista.add("K");
     String varibale = "L";
     lista.add(varibale);
            
//______________________________________________________________________     
     System.out.println("\n\n otra forma de recorrer la lista \n");
     
             lista.stream().forEach(contiene -> {
         //System.out.println("contiene " + contiene);
         mensaje(contiene);
     });
    }
    
//______________________________________________________________________    
    public static void mensaje(String valor){
        System.out.println("contiene " + valor);
    }
}
