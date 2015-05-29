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
public class Cliente {
    
     private int cod;
     private String Nome;
     private int cpf;
     private String sexo;
     private int dt_nasc;
     private double debito;
    
    public Cliente(int cd ,String nome,int cpf1,String sx,int data,double dpt){
    this.cod = cd;
    this.Nome= nome;
    this.cpf = cpf1;
    this.sexo = sx;
    this.dt_nasc = data;
    this.debito = dpt;
    
    }
    public void setCod (int cd){
        this.cod = cd;
    }
    public int  getCod () {
        return cod;
    }
    public String  getNome () {
        return Nome;
    }
    public void setNome (String nome){
        this.Nome = nome;
    }
     public void setCpf (int cpf1){
        this.cpf = cpf1;
    } 
     public void setSexo (String sexo1){
        this.sexo = sexo1;
    }
      public void setDat_nasc (int dat_nasc1){
        this.dt_nasc = dat_nasc1;
    }
     public void setDebito ( double debito1){
        this.debito = debito1;
    }
     public double getDebito () {
        return debito;
    }
       
    
}
