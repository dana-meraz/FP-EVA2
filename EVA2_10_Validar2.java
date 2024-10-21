/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_validar2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_Validar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner (System.in);
        while(true){
        System.out.println("Número correspondiente al dia (1 - 7):");
        dia = captu.nextInt();
        //break;
        if(dia >= 1 && dia <= 7)
        break;
        
    }
    switch(dia){
            case 1:
                System.out.println("Lunes");
                break;//ultima instruccion - FIN del caso
            case 2:
                System.out.println("Martes");
                break;//ultima instruccion - FIN del caso
            case 3:
                System.out.println("Miercoles");
                break;//ultima instruccion - FIN del caso
            case 4:
                System.out.println("Jueves");
                break;//ultima instruccion - FIN del caso
            case 5:
                System.out.println("Viernes");
                break;//ultima instruccion - FIN del caso
            case 6:
                System.out.println("Sabado");
                break;//ultima instruccion - FIN del caso
            case 7:
                System.out.println("Domingo");
                break;//ultima instruccion - FIN del caso
            default: //OPCIONAL, SIN BREAK, ULTIMA SECCIÓN DEL SWITCH 
                System.out.println("Número no válido (Debe ser entre 1 al 7)");
        }
    }
}
