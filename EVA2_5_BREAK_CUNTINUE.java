/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_break_cuntinue;

/**
 *
 * @author invitado
 */
public class EVA2_5_BREAK_CUNTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BREAK ---> TERMINA EL CICLO COMPRETAMENTE
        //CUNTINUE --> iterrumpe la repetición actual
        for(int i =1; i <= 10; i++){
            if(i == 8)
                break;
                
        System.out.println(i + " - ");
        
        }
        
        System.out.println("");
        
        
        for(int i =1; i <= 10; i++){
            if(i == 8)
                continue;
                
        System.out.println(i + " - ");
        
        }
        
        
    }
    
}
