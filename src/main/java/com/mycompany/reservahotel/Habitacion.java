package com.mycompany.reservahotel;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:20:25
 */
public abstract class Habitacion {
    private int nHabitacion;
    private String estado;
    private double precio;
    private String serviciosAdicionales;

    public Habitacion(int nHabitacion, String estado, double precio, String serviciosAdicionales) {
        this.nHabitacion = nHabitacion;
        this.estado = estado;
        this.precio = precio;
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public int getnHabitacion() {
        return nHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public String getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setnHabitacion(int nHabitacion) {
        this.nHabitacion = nHabitacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setServiciosAdicionales(String serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    
    
}
