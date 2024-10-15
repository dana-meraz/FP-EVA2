/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        num = captu.nextInt();
        captu.nextLine();
        System.out.println("Ingresa el segundo numero");
        num2 = captu.nextInt();
        captu.nextLine();
        for(int i = num; i <= num2; i++){
            int modulo = i % 2;//RESIDUO DE LA DIVISION
            if(modulo == 0) //verdad ---> sea impar, para detener la impreción
                continue;
        System.out.println(i + " - ");
        }
        
    }
    
}
