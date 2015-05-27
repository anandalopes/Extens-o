package hotel;

import java.util.ArrayList;

public class vetores {
    
    ArrayList<Reserva> dados_reserva = new ArrayList();
    ArrayList<Cliente> dados_cliente = new ArrayList();
    ArrayList<Quarto> dados_quarto = new ArrayList();
    
     public void Quarto(Quarto c){
        dados_quarto.add(c);
 }
    public int qtdd_quarto (){
       return dados_quarto.size();
    }
    
    public void Reserva(Reserva c){
        dados_reserva.add(c);
 }
    public int qtdd_reserva (){
       return dados_reserva.size();
    }
    public void Cliente(Cliente c){
        dados_cliente.add(c);
 }
    public int qtdd_Cliente(){
        return dados_cliente.size();
 } 
    
}
