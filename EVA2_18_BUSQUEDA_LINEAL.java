/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dato = {10, 50, 85, 73, 11, 25, 48, 9, 97};
        int valor, poci = -1;
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a buscar: ");
        valor = captu.nextInt();
        for(int i = 0; i < dato.length; i++){
           if(valor == dato[i]){
           //Regresarle la posición
               poci = i;
               //detener el ciclo
               break;
           }
        
        }
        if(poci == -1)
        System.out.println("Valor no encontrado");
        else
            System.out.println("el valor esta en la posicion: " + poci);
        
        
        
        
    }
    
}
