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
public class Quarto {
    
    private int Numero;
    private String tipo;
    private double valor;
    private int ocupado;

  public Quarto(int num,String ti,double vlr,int ocupado){
    this.Numero = num;
    this.tipo= ti;
    this.valor = vlr;
    this.ocupado = ocupado;
}
  
    
}
