/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yareli
 */
public class Famoso {
   private String nombre;
   private String disconMasVendido;

    public Famoso() {
        nombre = "";
        disconMasVendido = "";
    }

    public Famoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.disconMasVendido = discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisConMasVendido() {
        return disconMasVendido;
    }
    @Override
    public String toString() {
        return "Famoso{" + "nombre=" + nombre + "Disco: " + disconMasVendido +'}';
    }

    
    
}
