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
    
    int cod;
    String Nome;
    int cpf;
    String sexo;
    int dt_nasc;
    double debito;
    
    public Cliente(int cd ,String nome,int cpf1,String sx,int data,double dpt){
    this.cod = cd;
    this.Nome= nome;
    this.cpf = cpf1;
    this.sexo = sx;
    this.dt_nasc = data;
    this.debito = dpt;
    
    
}
    
}
