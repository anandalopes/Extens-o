/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ananda
 */
public class form_reserva_incluir extends JFrame{
    public form_reserva_incluir(final vetores dados){
        
        Container tela = getContentPane();
        setLayout(null);
        setSize( 490 , 350 );
        setLocationRelativeTo( null );
        JLabel Label = new JLabel( "Inserir Reserva" );
        JLabel cod = new JLabel( "Codigo" );
        int a = dados.qtdd_reserva();
        JTextField cod1 = new JTextField(""+a); 
        JLabel cod_cliente = new JLabel( "Codigo do Cliente" );
        JTextField cod_cliente1 = new JTextField(); 
        JButton Lista_cliente = new JButton( "Lista cliente" );
        JLabel tipo = new JLabel( "Tipo Quarto" );
        JTextField tipo1 = new JTextField(); 
        JLabel entrada = new JLabel( "Entrada" );
        JTextField entrada1 = new JTextField(); 
        JLabel Saida = new JLabel( "Saida" );
        JTextField Saida1 = new JTextField(); 
        JButton lista_quarto = new JButton( "quarto" );
         JButton Confirmar = new JButton( "Confirma" );
         cod1.setEditable(false);
        
        Confirmar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int cod_cli = Integer.parseInt(cod_cliente1.getText());
                        int num = Integer.parseInt(tipo1.getText());
                        int inicio = Integer.parseInt(entrada1.getText());
                        int fim = Integer.parseInt(Saida1.getText());
                        int achou= 0;
                        int achou1= 0;
                        int w;
                        int a=0;
                        int b=0;
                        JOptionPane.showMessageDialog(null, dados.qtdd_quarto());
                            for(w=0; w< dados.qtt_Cliente();w++ ){
                                if(cod_cli==dados.dados_cliente.get(w).cod){
                                    achou = w;
                                    a=1;
                                }
                            }
                            for(int q=0; q< dados.qtdd_quarto();q++ ){
                                if(num == dados.dados_quarto.get(q).Numero){
                                    if(dados.dados_quarto.get(q).ocupado == 0){
                                        achou1= q;
                                        b=1;
                                        System.out.println("a");
                                    
                                        }
                                    
                                }
                            }
                            if(a==1 && b==1){
                                
                                     dados.dados_quarto.get(achou1).ocupado = 1;
                                     dados.dados_cliente.get(achou).debito= (fim - inicio)*dados.dados_quarto.get(achou1).valor + dados.dados_cliente.get(achou).debito;
                                     a=0;
                                     b=0;
                                     JOptionPane.showMessageDialog(null, "pronto reservar concluida para: \n cliente:"
                                     + " "+dados.dados_cliente.get(achou).Nome+"\n   Tipo Quarto: "+dados.dados_quarto.get(achou1).tipo+"\n Valor a pagar pela diarias:"+ dados.dados_cliente.get(achou).debito);
                                     
                            }
                                                           
                         
//                                
                    }
                }
        );
        Lista_cliente.addActionListener(
                
                new ActionListener(){
                    String b;
                    public void actionPerformed(ActionEvent e){
                        
                        for(int i=0;i< dados.qtt_Cliente();i++){
                            if(dados.qtt_Cliente() > 0){
                                b= "\n Codigo:"+ i+ "\nNome:"+ dados.dados_cliente.get(i).Nome + b+"\n\n";
           
                            }
                        }
                    if(!(dados.qtt_Cliente()>0)){
                        JOptionPane.showMessageDialog(null,"Não Cliente cadastrado" );
                        b="";
                    }
                    else{
                        JOptionPane.showMessageDialog(null, b );
                        b="";
                         }
                }
            }
                
        );
        lista_quarto.addActionListener(
                
                new ActionListener(){
                    String b="";
                    int contar= 0;
                    public void actionPerformed(ActionEvent e){
                        
                        for(int i=0;i< dados.qtdd_quarto();i++){
                            if(dados.dados_quarto.get(i).ocupado == 0){
                                b= "\nNumero:"+ dados.dados_quarto.get(i).Numero+ b+"\n\n" ;
                            }
                            else{
                                contar = contar +1;
                            }
                        }
                    if((dados.qtdd_quarto()==contar)){
                        JOptionPane.showMessageDialog(null,"Não tem quarto disponivel" );
                        b="";
                        contar =0;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Quartos disponiveis: \n\n"+ b );
                        b="";
                        contar =0;
                         }
                }
            }
                
        );
        JButton Voltar = new JButton( "Voltar" );
        Voltar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        new form_reserva(dados).setVisible(true);
                         dispose();
                    }
                }
                
        );
       Label.setBounds(  140 ,  10 ,  250 ,  25 ) ;
       cod.setBounds( 10 ,  40 , 50 ,  25);
       cod1.setBounds( 110 ,  40 , 50 ,  25);
       cod_cliente.setBounds( 10 ,  70 , 100 ,  25);
       cod_cliente1.setBounds( 110 ,  70 , 50 ,  25);
       Lista_cliente.setBounds( 280 ,  70 , 150 ,  25);
       tipo.setBounds( 10 ,  100 , 100 ,  25);
       tipo1.setBounds( 110 ,  100 , 150 ,  25);
       lista_quarto.setBounds( 280 ,  100 , 150 ,  25);
       entrada.setBounds(10 ,  130 ,  100 ,  25 );
       entrada1.setBounds( 110 ,  130 , 50 ,  25);
       Saida.setBounds( 10 ,  160 , 50 ,  25);
       Saida1.setBounds( 110 ,  160 , 50 ,  25);
       Voltar.setBounds(120 ,  280 , 100 ,  25);
       Confirmar.setBounds(10 ,  280 , 100 ,  25);
       tela.add(cod);
       tela.add(cod1);
       tela.add(cod_cliente);
       tela.add(cod_cliente1);
       tela.add(Lista_cliente);
       tela.add(tipo);
       tela.add(tipo1);
       tela.add(entrada1);
       tela.add(entrada);
       tela.add(Saida1);
       tela.add(Saida);
       tela.add(Voltar);
       tela.add(lista_quarto);
        tela.add(Confirmar);
       setVisible( true );}
     
    } 

