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
public class Reserva {
    
    int cod;
    int cod_cliente;
    int tipo_quarto;
    int entrada;
    int saida;
    String forma_pg;
    
    public Reserva(int cd,int cod_cl,int tipo,int entrada,int saida, String forma){
    this.cod = cd;
    this.cod_cliente= cod_cl;
    this.tipo_quarto = tipo;
    this.entrada = entrada;
    this.saida= saida;
    this.forma_pg= forma;
    
    }
    
    
    
}
