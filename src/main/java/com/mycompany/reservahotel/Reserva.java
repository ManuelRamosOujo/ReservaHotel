package com.mycompany.reservahotel;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:29:28
 */
public class Reserva {
    private int idReserva;
    private int fechaInicio;
    private int fechaFin;
    private Descuento descuento;

    public int getIdReserva() {
        return idReserva;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Reserva(int idReserva, int fechaInicio, int fechaFin, Descuento descuento) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descuento = descuento;
    }

    public Reserva(int idReserva, int fechaInicio, int fechaFin) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
