/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author cano
 */
public class Vivienda {
    
    double precio;
    int numHabitaciones;
    double superficie;
    boolean parking;
    String estado;
    String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /* Actualiza el precio con 0.05  */
    public void actualizarPrecio()
    {
        precio = precio - precio * 0.05;
    }
    
}
