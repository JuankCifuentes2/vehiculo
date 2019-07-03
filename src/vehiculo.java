/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class vehiculo {
    
   public String marca;
   public String modelo;
   public int anio;
   public String color;
   public int VelocidadActual;
   public boolean encendido;
   public String dominio;
   
   
   vehiculo( String domi,String model){
       
       this.dominio = domi;
       this.modelo = model;
       
       
   }
   
   public void encender (){
       
       if (this.encendido==true){
       System.out.println("vehiculo de dominio :"+ this.dominio + " ya esta encendido");
   }
       else {
    
        this.encendido=true;
           System.out.println("vehiculo de dominio :" + this.dominio + " se esta encendiendo");       
                
}
            
}

     public void apagar (){
       
       if (this.encendido==false){
       System.out.println("vehiculo de dominio :"+ this.dominio + " ya esta apagado");
   }
       else {
    
        this.encendido=false;
           System.out.println("vehiculo de dominio :" + this.dominio + " se esta apagando");       
                
}
            
}
   public boolean estaencendido(){     
      
       
       return this.encendido;            
}
           

   
}