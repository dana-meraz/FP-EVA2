/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclos_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato, valores[];//un solo arreglo ---> valores
        int[] datos, x, y, z;//todos don arreglos
        int[] arreglo = new int [100];
        
        
        for(int i = 0; i < arreglo.length; i++){
        arreglo[i] = (int)(Math.random() * 100);
        }
        //@ --> at --> en
        //System.out.println(arreglo); SOLO IMPREME LA DIRECCIÓN EN MEMORIA
        for (int i = 0; i < arreglo.length; i++){
        System.out.println(arreglo[i] + "-");
        }
        
    }
    
}
