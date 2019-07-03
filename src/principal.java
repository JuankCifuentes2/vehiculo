/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vehiculo auto1 = new vehiculo ("AZ1456","Ford Fiesta");
        auto1.color = "rojo";
        auto1.encendido = false;
        
        auto1.apagar();
       
        
        
        vehiculo auto2 = new vehiculo ("PQ2334","Renault Clio");
        auto2.color = "azul";
        auto2.encendido = true;
        
        vehiculo auto3 = new vehiculo ("AP34324","Chevrolet Cruze");
        auto3.color = "blanco";
        auto3.encendido = false;
        
        
        vehiculo auto4 = new vehiculo ("AX432434","Renault XXX");
        auto4.color = "amarillo";
        auto4.encendido = true;
        
        vehiculo auto5 = new vehiculo ("AG32323","Toyota Corolla");
        auto5.color = "negro";
        auto5.encendido = false;
        
        
       
        if(auto1.estaencendido()==true){
        
        System.out.println("el auto1 esta encendido");  
        
        // TODO code application logic here
        }
    
        else{
        
        System.out.println("el auto1 esta apagado");  
        
        
        
}
}
}