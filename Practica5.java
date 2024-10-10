/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica5;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        Scanner captu = new Scanner(System.in);
        String acum;
        System.out.println("Coloca un numero");
        num = captu.nextInt();
        captu.nextLine();
        acum = "";
        for(int i = 1; i <= num; i++){
                 acum = acum + "*";
        System.out.println(acum);
        }
    }
    
}
