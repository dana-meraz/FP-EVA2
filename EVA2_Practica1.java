/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_practica1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;
        int num;
        Scanner captu = new Scanner(System.in);
        System.out.println("Coloca una cadena");
        cade = captu.nextLine();
        System.out.println("Coloca un numero");
        num = captu.nextInt();
        captu.nextLine();
     for(int i = 1; i <= num; i++){
         System.out.println(cade);
     }
    }
    
}
