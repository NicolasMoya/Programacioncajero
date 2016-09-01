/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

//import java.util.Random;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author lab
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Num_Cliente;
	int Identificacion;
	String Nombre;
	String Direccion;
	int Telefono;
        double saldo;
        String tipocuenta;
        Scanner leer= new Scanner(System.in);
        Cliente cli[] = new Cliente[19];
       ArrayList<Tarjeta> array = new ArrayList<Tarjeta>();
       Tarjeta tarj = new Tarjeta();
       Cuenta cuen = new Cuenta();
       ArrayList<Cuenta> arrcuen = new ArrayList<Cuenta>();
       
        
        
        for(int i=0;i<cli.length;i++){
            
            Num_Cliente = i+10001;
            Identificacion = i+1;
            System.out.println("Ingrese nombre Cliente: ");    
            Nombre = leer.nextLine();
            System.out.println("\nIngrese direccion: ");
            Direccion = leer.nextLine();
            System.out.println("\nIngrese telefono: ");
            Telefono = leer.nextInt();
            System.out.println("\nIngrese Cuantas tarjetas tendrá :");
            int b= leer.nextInt();
            if (b<0 || b>3){
                System.out.println("Ingrese un numero de tarjetas entre 1 y 3 :");   
            }else
            for(int n=0;n<b;b++){
                cuen.setNumCliente(Num_Cliente);
                cuen.setNumCuenta(45648846+n*i+i);
                System.out.println("Ingrese saldo :");
                saldo = leer.nextDouble();
                cuen.setSaldo(saldo);
                System.out.println("Ingrese tipo de cuenta :");
                tipocuenta = leer.nextLine();
                cuen.setTipodecuenta(tipocuenta);
                tarj.setNumCliente(Num_Cliente);
                tarj.setNumTarjeta(5220+n*i+i);
                tarj.setNumCuenta(cuen.getNumCuenta());
                
                Tarjeta tarj2 = new Tarjeta(tarj.getNumCliente(),tarj.getNumCuenta(),tarj.getNumTarjeta());
               array.add(n, tarj2);
               cuen.setTarjeta(tarj2);
               
            }
            
            
        }
       
        
        
        
        
        
    }
    
}
