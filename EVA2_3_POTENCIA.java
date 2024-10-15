/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int num, exp;
        System.out.println("Coloca el numero que quieres elevar");
        num = captu.nextInt();
       captu.nextLine();
        System.out.println("Coloca el exponente");
        exp = captu.nextInt();
        captu.nextLine();
        int res = 1;
        for(int i = 1; i <= exp; i++){
             res = res * num;
        
        }
        System.out.println("El resultado es =" + res);
    }
    
}
