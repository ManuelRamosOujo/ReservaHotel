package com.mycompany.reservahotel;

import java.time.LocalDate;
import java.util.ArrayList;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:22:18
 */
public class Trabajador {
    private int idRecep;
    private String nome;
    private int telefono;
    private double horasTrabajadas;
    private String DNI;
    private ArrayList<Reserva> reservas;

    public int getIdRecep() {
        return idRecep;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefono() {
        return telefono;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String getDNI() {
        return DNI;
    }

    public void setIdRecep(int idRecep) {
        this.idRecep = idRecep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Trabajador(int idRecep, String nome, int telefono,
            double horasTrabajadas, String DNI) {
        this.idRecep = idRecep;
        this.nome = nome;
        this.telefono = telefono;
        this.horasTrabajadas = horasTrabajadas;
        this.DNI = DNI;
    }

    public Trabajador(int idRecep, String nome, int telefono, String DNI) {
        this.idRecep = idRecep;
        this.nome = nome;
        this.telefono = telefono;
        this.DNI = DNI;
    }

    public void addReserva(int idReserva, LocalDate fechaInicio, int duracion){
        Reserva reserva = new Reserva(idReserva,fechaInicio,duracion);
        reserva.setFechaFin(reserva.getFechaInicio(),duracion);
        reservas.add(reserva);
        System.out.println(reservas.get(idReserva));
    }
    
    public void deleteReserva(int idReserva){
        reservas.remove(idReserva);
    }
}
