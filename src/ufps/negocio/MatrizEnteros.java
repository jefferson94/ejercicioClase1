/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.negocio;

        
/**
 *
 * @author MADARME
 */
public class MatrizEnteros {
    
    private int matriz[][];
    private int length;

    public MatrizEnteros() {
    }

    public MatrizEnteros(int filas , int columnas) {
        
       if(columnas==0)
       {
           //creando matrices dispersas
           this.matriz=new int[filas][];
           crearElementosDispersos();
       }
       else
       {
        this.matriz = new int[filas][columnas];
        crearElementos();
       }
    }
    
    
    private void crearElementosDispersos()
    {
        for(int i=0;i<this.matriz.length;i++)
        {
            int columnas=(int)(Math.random()*this.matriz.length+1);
            this.matriz[i]=new int[columnas];
            crearElementosVector(this.matriz[i]);
        }
    }
    
    
    
    private void crearElementos()
    {
        for(int i=0;i<this.matriz.length;i++)
        {
            crearElementosVector(this.matriz[i]);
        }
        
    }
    
    
    private void crearElementosVector(int vectorCols[])
    {
        for(int j=0;j<vectorCols.length;j++)
        {
            int elemento=(int)(Math.random()*vectorCols.length);
            vectorCols[j]=elemento;
        }
    }
    
    
    
    //foreach o iterador
    public String toString()
    {
    String msg="";
        for(int vectorCols[]:this.matriz)
        {
            for(int elemento:vectorCols)
            {
                msg+=elemento+"\t";
            }
            msg+="\n";
        }
     return (msg);
    }
    
    
    //manera convencional
    public String toString2()
    {
    String msg="";
        for(int i=0; i<this.matriz.length;i++)
        {
            for(int j=0;j<this.matriz[i].length;j++)
            {
                msg+=this.matriz[i][j]+"\t";
            }
            msg+="\n";
        }
     return (msg);
    }
    
    
    
    /*
     * @return true si la matriz es dispersa o false en caso contrario
     */
    public boolean esDispersa()
            {

             int tamaño = matriz[0].length;
             
           
          for ( int i=0; i<matriz.length;i++){
          
                if (matriz[i].length!=tamaño) {
                  return true ;
              }
          
          }
              
             return false ;
            }
    
    
    /**
     * Compara si dos objetos de la clase MatrizEnteros son iguales
     * @param obj la matriz2 a comparar
     * @return 
     */
    public boolean equals(Object obj) {
        MatrizEnteros m2=(MatrizEnteros)obj;
      
        boolean a = this.esDispersa();
        boolean b= m2.esDispersa();
       int m4[][]= this.matriz;
        
        if (this.matriz.length == m2.matriz.length) {

            if (a == b) {

                boolean m = sonIguales(m2);


                if (m == true) {



                    boolean comparar=false ;//vectoresIguales(this[0],m2[0]);

                    if (comparar == true) {
                    }

                }
            }

return false ;
        }
        return true;
        }

    private boolean sonIguales(MatrizEnteros m2) {
         int contador=0;

       if (matriz.length==m2.matriz.length){
       for (int i=0;i<matriz.length;i++){
          
               if (matriz[i].length==m2.matriz[i].length){
                   contador ++;
               }
               if (contador == matriz.length){
                   return true;
               }
           }
       }
     
    return false;
}


      
    
    public boolean vectoresIguales ( int m1[] ,int m2[]){
       
     
        for (int i=0; i<m1.length;i++){
        
            if (m1[i]!=m2[i]) {
                return false;
            }
        }
        
        
        return true;
    
    
   }

}
    

