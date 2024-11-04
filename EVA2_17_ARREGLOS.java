/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        int califas[];
        String nombre[];
        Scanner captu = new Scanner(System.in);
        System.out.println("Cantidad de calificaciones a capturar:");
        cantidad = captu.nextInt();
        captu.nextLine();
        califas = new int[cantidad];
        nombre = new String[cantidad];
        
        for(int i = 0; i < califas.length; i++){
            System.out.println("nombre estudiante #" + i);
        nombre[i] = captu.nextLine();
            
        System.out.println("Calificaciones estudiante #" + i);
        califas[i] = captu.nextInt();
        captu.nextLine();
        
        }
        
       for(int i = 0; i < califas.length; i++){
        System.out.println(nombre[i] + ":" + califas[i] + "-");
        }
        
    }
    
}
