
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yareli
 */
public class CantanteLista {
    ArrayList<Famoso> cantantes;

    public CantanteLista() {
        cantantes = new <Famoso> ArrayList();
    }

    public void AgregarFamoso(Famoso Cantante) {
        cantantes.add(Cantante);

    }

    @Override
    public String toString() {
        return "Lista{" + "cantantes=" + cantantes + '}' ;
    }

    public void listarCantante() {
        Famoso cantante;
        Iterator<Famoso> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("        Discos con mas ventas: " + cantante.getDisConMasVendido());
        }
    }

}
