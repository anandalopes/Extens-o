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
    private int cod_cliente;

  public Quarto(int num,String ti,double vlr,int ocupado, int cliente){
    this.Numero = num;
    this.tipo= ti;
    this.valor = vlr;
    this.ocupado = ocupado;
    this.cod_cliente = cliente;
}

  public int getNumero(){
      return Numero;
  }
  public String getTipo(){
      return tipo;
  }
  public double getValor(){
      return valor;
  }
  public int getOcupado(){
      return ocupado;
  }
  public void setOcupado( int c){
      this.ocupado = c;
  }
  public void setCliente( int c){
      this.cod_cliente = c;
  }
  public int getCliente(){
      return cod_cliente;
  }
  

}
