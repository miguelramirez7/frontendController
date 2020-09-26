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
public class Dispatcher {
    
    //utiliza agregacion para agregar las vistas que despachara cuadno se le haga una solicitud
    private Vista1 vista1;
    private Vista2 vista2;
    
    //instanciamos las vistas en el constructor del despachador
    public Dispatcher() {
        this.vista1 = new Vista1();
        this.vista2 = new Vista2();
    }
    //creamos el metodo para despachardependiendo de la vista que solicite
    public void despachar(String request){//entra una peticion para despachar
        if(request.equalsIgnoreCase("vista1")){
            vista1.mostrar();
        }else{
            vista2.mostrar();
        }
    }
    
    
}
