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
public class pruebaFrontController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos el front controller del cual centralizaremos las solicitudes(para nuestras vistas)
        frontCrontrollerContext frontController = new frontCrontrollerContext();
        /**----solicitando vista1----*/
        System.out.println("pidiendo al front controller q nos despache la vista1\n");
        frontController.despacharRequest("vista1");
        /**----solicitando vista2----*/
        System.out.println("\npidiendo al front controller q nos despache la vista2\n");
        frontController.despacharRequest("vista2");
    }
    
}
