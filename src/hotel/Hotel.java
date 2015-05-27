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
        Quarto q1 = new Quarto(01,"simples",20.0,0);
        Quarto q2 = new Quarto(02,"simples",20.0,0);
        Quarto q3 = new Quarto(03,"simples",20.0,0);
        Quarto q4 = new Quarto(04,"simples",20.0,0);
        Quarto q5 = new Quarto(05,"simples",20.0,0);
        Quarto q6 = new Quarto(06,"simples",20.0,0);
        Quarto q7 = new Quarto(07,"simples",20.0,0);
        Quarto q8 = new Quarto(12,"suite",120.0,0);
        Quarto q9 = new Quarto(16,"suite",120.0,0);
        Quarto q10 = new Quarto(13,"suite",20.0,0);
        Cliente c1 = new Cliente(0, "ananda", 000, "f", 10, 0);
        Cliente c2 = new Cliente(1, "Savio", 9098, "m", 17, 0);
        Cliente c3 = new Cliente(2, "alberto", 2342, "m", 13, 0);
        Cliente c4 = new Cliente(3, "everson", 8090, "m", 10, 0);
        Cliente c5 = new Cliente(4, "romulo", 6787, "m", 19, 0);
        
        dados.Quarto(q1);
        dados.Quarto(q2);
        dados.Quarto(q3);
        dados.Quarto(q4);
        dados.Quarto(q5);
        dados.Quarto(q6);
        dados.Quarto(q7);
        dados.Quarto(q8);
        dados.Quarto(q9);
        dados.Quarto(q10);        
        dados.Cliente(c1);
        dados.Cliente(c2);
        dados.Cliente(c3);
        dados.Cliente(c4);
        dados.Cliente(c5);
 
        
       
        new menu(dados).setVisible(true);
    }
    
}
