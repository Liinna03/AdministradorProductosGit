/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */
//Se crea una clase llamada Producto
public class Producto {
    // se declaran las variables de la clase
    private int id;
    private String nombre;
    private double precio;
    
    public Producto() {
    }
    // se crear un constructor que inicializa las variables de clase
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //metodo get para mostrar/ retornar el valor del atributo id
    public int getId() {
        return id;
    }

    //metodo set para modificar el valor del atributo id
    public void setId(int id) {
        this.id = id;
    }

    //metodo get para mostrar/ retornar el valor del atributo nombre
    public String getNombre() {
        return nombre;
    }

    //metodo set para modificar el valor del atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo get para mostrar/ retornar el valor del atributo precio
    public double getPrecio() {
        return precio;
    }
    //metodo set para modificar el valor del atributo precio y se verifica que si el precio es menor que cero se muestre una validación que no puede ser 0,
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("No se permiten precios negativos");
        } else {
            this.precio = precio;
        }
    }
    //metodo get para mostrar el valor del atributo descuento
    public double getDescuento(){
        return precio * 0.1d;
    }
    
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    }
}
