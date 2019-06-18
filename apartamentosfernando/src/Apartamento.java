/*
 *
 * Created on 28 de enero de 2008, 17:45
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 * 
 * @author admin
 */
public class Apartamento {
    public int numero;
    public int metros;
    public double precio;
    public boolean alquilado;
    public static double total=0;
    
    
    /*
 * constructor de Apartamento 
   se le introducen los valores @n = numero ,@m = metros , @pre = precio
   y se pone alquilado a falso
 */
    /**
     * 
     * @param n numero de apartamento 
     * @param m numero de metros
     * @param pre precio del apartamento
     */
    public Apartamento(int n,int m,double pre) {
        numero=n;
        metros=m;
        precio=pre;
        alquilado=false;
    }
    
    
    /*
 * metodo alquilar
    si esta alquilado retorna falso , si no retorna true y suma el @precio al @total
 */
    /**
     * si esta alquilado retorna falso , si no retorna true y suma el @precio al @total
     * @return boolean
     */
    public boolean Alquilar(){
        if (alquilado)
            return false;
        alquilado=true;
        total+=precio;
        return true;
    }
     
        /*
 * metodo subirprecio
    se pasa un double con el cual se hace un porcentaje , re retorna el precio
    */
    /**
     * se pasa un double con el cual se hace un porcentaje , re retorna el precio
     * @param porcentaje es un 
     * @return precio
     */
    public double subirPrecio(double porcentaje){
        precio=precio+porcentaje*precio/100;
        return precio;
    }

    
        /*
 *  toString 
    escribe todos los datos del constructor
    */
    
    @Override
      /**
     * @return numero,metros,precio,alquilado
     */
    public String toString() {
        return "a{" + "numero=" + numero + ", metros=" + metros + ", precio=" + precio + ", alquilado=" + alquilado + '}';
    }
    
    
   
}
