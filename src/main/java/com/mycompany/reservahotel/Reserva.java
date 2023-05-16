package com.mycompany.reservahotel;

import java.time.LocalDate;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:29:28
 */
public class Reserva {
    private int idReserva;
    private LocalDate fechaInicio;
    private int duracion;
    private LocalDate fechaFin;
    private Descuento descuento;
    private Habitacion habitacion;

    public int getIdReserva() {
        return idReserva;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaInicio, int duracion) {
        this.fechaFin = fechaInicio.plusDays((long)duracion);
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Reserva(int idReserva, LocalDate fechaInicio, int duracion, Descuento descuento) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.descuento = descuento;
    }

    public Reserva(int idReserva, LocalDate fechaInicio, int duracion) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Nº habitacion: " + getHabitacion().getnHabitacion();
    }
    
    
}
