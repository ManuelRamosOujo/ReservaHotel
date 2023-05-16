package com.mycompany.reservahotel;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:22:50
 */
public class Individual extends Habitacion{
    private String tamañoCama;

    public Individual(String tamañoCama, int nHabitacion, String estado, double precio, String serviciosAdicionales) {
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
