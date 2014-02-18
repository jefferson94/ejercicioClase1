/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.gui;
import ufps.negocio.MatrizEnteros;

/**
 *
 * @author MADARME
 */
public class TestMatriz {
    
        public static void main(String nada[])
        {
            MatrizEnteros m=new MatrizEnteros(3,5);
            System.out.println(m.toString());
            
            System.out.println("------------------------------");
            MatrizEnteros m2=new MatrizEnteros(3,0);
            System.out.println(m2.toString());
       
            boolean esDispersa = m.esDispersa();
        System.out.println(esDispersa);
        
//         int v1[]= {0,0,3}; 
//         
//         int v2[]= {0,4,3}; 
//         
//         
//         boolean a = vectoresIguales(v1,v2);
//         System.out.println(a);
        }

    private static boolean vectoresIguales(int[] v1, int[] v2) {
          for (int i=0; i<v1.length;i++){
        
            if (v1[i]!=v2[i]) {
                return false;
            }
        }
        
        
        return true;
    
    }
    
    
}
