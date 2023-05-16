package com.mycompany.reservahotel;

/* @author Manuel 
 * @date 12/05/2023
 * @time 14:22:59
 */
public class Doble extends Habitacion{
    private static final int nCamas = 2;
    private String tamañoCama;

    public static int getnCamas() {
        return nCamas;
    }

    public String getTamañoCama() {
        return tamañoCama;
    }

    public void setTamañoCama(String tamañoCama) {
        this.tamañoCama = tamañoCama;
    }

    public Doble(String tamañoCama, int nHabitacion, String estado, double precio, String serviciosAdicionales) {
        super(nHabitacion, estado, precio, serviciosAdicionales);
        this.tamañoCama = tamañoCama;
    }
    
    
}
