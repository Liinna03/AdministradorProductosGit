/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;

/**
 *
 * @author cafajardo
 */

// clase (subclase) Comida que hereda los atributos y metodos de la  clase producto
public class Comida extends Producto {
    // se declaran las variables de la clase
    private LocalDate fechaVencimiento;

    // se crea un constructor que inicializa las variables de clase
    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {
        // se utiliza super para acceder a los atributos de la clase padre Producto
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    //metodo get para mostrar el valor del atributo fecha de vencimiento
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    //metodo set para modificar el valor del atributo fecha de vencimiento
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    //metodo get para mostrar el valor del atributo fecha de vencimiento
    public double getDescuento() {
        //se crea una condición para mirar si la fecha de vencimiento es igual a la fecha actul se realizara un descuento en el precio.
        if (fechaVencimiento.equals(LocalDate.now()) || fechaVencimiento.isAfter(LocalDate.now())){
            //se utiliza super para acceder al metodo getDescuento de la clase padre Producto
            return super.getDescuento();
        }
        else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    }
}
