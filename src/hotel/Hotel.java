/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Ananda
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vetores dados = new vetores();
        Quarto q1 = new Quarto(10,"a",20.0,0);
        Reserva r1 = new Reserva(0, 1, "a", 01, 03, "cheque");
        Quarto q2 = new Quarto(20,"a",20.0,0);
        Cliente c1 = new Cliente(0, "ananda", 000, "f", 10, 0);
        Cliente c2 = new Cliente(1, "Savio", 9098, "m", 18, 0);
        dados.Cliente(c1);
        dados.Cliente(c2);
        dados.Quarto(q1);
        dados.Reserva(r1);
        dados.Quarto(q2);
       
        new menu(dados).setVisible(true);
    }
    
}
