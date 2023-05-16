package com.mycompany.reservahotel;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:23:11
 */
public class Matrimonio extends Habitacion{
    private String tamañoCama;

    public Matrimonio(String tamañoCama, int nHabitacion, boolean estado, double precio, String serviciosAdicionales) {
        super(nHabitacion, estado, precio, serviciosAdicionales);
        this.tamañoCama = tamañoCama;
    }

    public String getTamañoCama() {
        return tamañoCama;
    }

    public void setTamañoCama(String tamañoCama) {
        this.tamañoCama = tamañoCama;
    }
    
}
