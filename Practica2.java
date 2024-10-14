/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y,x;
        Scanner captu = new Scanner(System.in);
        System.out.println("Coloca el rpimer numero");
        y = captu.nextInt();
        captu.nextLine();
        System.out.println("Coloca el segundo numero");
        x = captu.nextInt();
        captu.nextLine();
        for(int i = y; i <= (x - 1); i++){
    System.out.println(i);
    }for(int o = x - 1; o >= (y + 1); o-- ){
    
       System.out.println(o);
    }
    }
    
}
