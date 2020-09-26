/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fc;

/**
 *
 * @author User
 */
public class frontCrontrollerContext {
    //agregamos al despachador (centralizaremos nuestro despacho para hacer funciones dentro de este controlador para todas las vistas.)
    private Dispatcher despachador;
    
    public frontCrontrollerContext() {
    this.despachador = new Dispatcher();    //instanciamos el despachador en el constructor del front controller
    }
    //autenticacion para ingreso
    private boolean estaAuntenticado(){
        System.out.println("autenticando al usuario");  //metodo que haremos ha todas lasvistas (esto es lo que hace posible el FC)
        return true;
    }
    //seguimiento de solicitudes
    private void trackRequest(String request){ 
        System.out.println("pidio la pagina(solicitud): " + request); //otro metodo de seguimiento de solicitudes(posible gracias  a FC)
    }
    
    public void despacharRequest(String request){
        this.trackRequest(request);             //cuando despachamos en el FC lo bueno es q centralizamos muchos metodos para todas las vistas
        if(this.estaAuntenticado()){
            
            despachador.despachar(request);
        }
        
    }
}
