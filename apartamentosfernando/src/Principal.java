/*
 * NewMain.java
 *
 * Created on 28 de enero de 2008, 18:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.io.*;
public class Principal {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
            /**
            * entero,es el numero de metros del apartamento
            */
        int metros;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Anota el numero del apartamento:");
        int numero=Integer.parseInt(br.readLine());
            /**
            * bucle hasta introducir correctamente los parametros
            */
        do{
            System.out.println("Anota los metros:");
            metros=Integer.parseInt(br.readLine());
        }while(ValMetros(metros)==true);
        System.out.println("Anota el precio:");
        double precio=Double.parseDouble(br.readLine());
        Apartamento apart1=new Apartamento(numero,metros,precio);
        System.out.println("Anota el numero del segundo apartamento");
        int num2=Integer.parseInt(br.readLine());
            /**
             * bucle hasta introducir correctamente los parametros
             */
        do{
            System.out.println("Anota los metros  del segundo apartamento:");
            metros=Integer.parseInt(br.readLine());
        }while(ValMetros(metros)==true);
        System.out.println("Anota el precio  del segundo apartamento:");
        double precio2=Double.parseDouble(br.readLine());
        Apartamento apart2=new Apartamento(num2,metros,precio2);
        
            /**
             * alquila el apartamento
             */
        apart1.Alquilar();
        System.out.println("Anota el porcentaje a subir para el primer apartamento:");
        double porcentaje=Double.parseDouble(br.readLine());
            /**
             * se le sube el precio al apart1
             */
        apart1.subirPrecio(porcentaje);
            
        System.out.println(apart1.toString());
        System.out.println(apart2.toString());
            /**
            * se sacan las ganancias totales
            */
        System.out.println("Ganancias totales:"+Apartamento.total);
        
    }
            /**
             * ValMetros 
            introduce un entero
            valida si esta entre 40 y 100 metros
            retorna 
     * 
     * @param metros son los metros del apartamento
     
     * @return boolean
     */
    public static boolean ValMetros(int metros){
        if(metros<40 || metros>100)
            return true;
        else
            return false;
    }
    
}
