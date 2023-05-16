package com.mycompany.reservahotel;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:24:39
 */
public class Descuento {
    private boolean fechaEspecial;
    private boolean clienteFiel;

    public boolean isFechaEspecial() {
        return fechaEspecial;
    }

    public boolean isClienteFiel() {
        return clienteFiel;
    }

    public void setFechaEspecial(boolean fechaEspecial) {
        this.fechaEspecial = fechaEspecial;
    }

    public void setClienteFiel(boolean clienteFiel) {
        this.clienteFiel = clienteFiel;
    }

    public Descuento(boolean fechaEspecial, boolean clienteFiel) {
        this.fechaEspecial = fechaEspecial;
        this.clienteFiel = clienteFiel;
    }
}
