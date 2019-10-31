
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yareli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String cantante, disco;
        CantanteLista listacantate = new CantanteLista();
        Entrada entrada = new Entrada();

        Famoso cantante1 = new Famoso("bandaMs", "Marco Flores"); 
        Famoso cantante2 = new Famoso("Marco Flores ", "BandaMs");
        listacantate.AgregarFamoso(cantante1);
        listacantate.AgregarFamoso(cantante2);

        System.out.println("La lista: ");
        listacantate.listarCantante();
        String continuar = new String();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarFamoso(new Famoso(cantante, disco));
            System.out.println("La lista contiene los siguientes datos: ");
            
            System.out.println("Nueva Lista" + listacantate);
            ArrayList<Famoso> list = new ArrayList<>();
            list.add(cantante1);
            list.add(cantante2);
            System.out.println("Para Agregar Otro Cantante y su Disco Selecciona S \n Para Salir seleciona"
                    + " N  \n (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("BYE");

    }
    }


