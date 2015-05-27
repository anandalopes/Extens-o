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
    
    private int cod;
    private int cod_cliente;
    private int tipo_quarto;
    private int entrada;
    private int saida;
    private String forma_pg;
    
    public Reserva(int cd,int cod_cl,int tipo,int entrada,int saida, String forma){
    this.cod = cd;
    this.cod_cliente= cod_cl;
    this.tipo_quarto = tipo;
    this.entrada = entrada;
    this.saida= saida;
    this.forma_pg= forma;
    
    }
    public void setCod (int cd){
        this.cod=cd;
    }
     public void setCod_Cliente (int cd){
        this.cod_cliente=cd;
    }
      public void setTipoQuarto (int cd){
        this.tipo_quarto=cd;
    }
     public void setEntrada (int cd){
        this.entrada=cd;
    } 
     public void setSaida (int cd){
        this.saida=cd;
    }
      public void setForma_pg (String cd){
        this.forma_pg=cd;
    }
     
       public int getCod (){
        return cod;
    }
       public int getCod_Cliente (){
        return cod_cliente;
    }
      public int getTipoQuarto (){
        return tipo_quarto;
    }
      public int getEntrada (){
        return entrada;
    }
      public int getSaida (){
        return saida;
    }
      
      
      
      
    
    
}
