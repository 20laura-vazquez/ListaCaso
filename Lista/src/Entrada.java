
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
public class Entrada {
   private String entrada;
    Scanner sc = new Scanner(System.in);

    public Entrada() {
        entrada = "";
    }

    public String AgregarCantante() {
        entrada= sc.nextLine();
        return entrada;
    }
    public String getEntrada() {
        return entrada;
    }
    
}
