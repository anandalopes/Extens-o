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

public class Form_refeicao extends JFrame {
    public Form_refeicao(vetores dados){
        
        Container tela = getContentPane();
        setLayout(null);
        setSize( 490 , 350 );
        setLocationRelativeTo( null );
        JLabel Label = new JLabel( "Refeição" );
        JLabel cod = new JLabel( "Codigo do Cliente" );
        JLabel valor_ref = new JLabel( "Valor da Refeição" );
        
        JTextField cod1 = new JTextField(); 
        JTextField valor_ref1 = new JTextField(); 
        JButton Debitar = new JButton( "Debitar" );
        JButton Voltar = new JButton( "Voltar" );
        
        
       Label.setBounds(  140 ,  10 ,  250 ,  25 ) ;
       cod.setBounds( 10 ,  40 , 100 ,  25);
       cod1.setBounds( 150 ,  40 , 100 ,  25);
       valor_ref.setBounds( 10 ,  70 , 100 ,  25);
       valor_ref1.setBounds( 150 ,  70 , 200 ,  25);
       Debitar.setBounds(120 , 240 , 100 , 25);
       Voltar.setBounds(230 , 240 , 100 , 25);
       tela.add(Label);
       tela.add(cod);
       tela.add(cod1);
       tela.add(valor_ref);
       tela.add(valor_ref1);
       tela.add(Debitar);
       tela.add(Voltar);
       
       cod1.setEditable(true);
        Voltar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    new menu(dados).setVisible(true);
                    dispose();
                }
       
    }
        );
        
        Debitar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int verificacao_cliente1=0;
                    int verificacao_cliente=0;
                    int cod_cliente = Integer.parseInt(cod1.getText());
                    double valor_ref2 = Double.parseDouble(valor_ref1.getText());
                    for(int i = 0; i<dados.qtdd_Cliente();i++){
                        if(dados.dados_cliente.get(i).getCod()== cod_cliente){
                             verificacao_cliente1=1+verificacao_cliente1;
                             System.out.println("teste1");
                        }
                        else{
                             verificacao_cliente=verificacao_cliente+1;
                             System.out.println("teste2");
                        }
                        
                    }
                    if( verificacao_cliente<dados.qtdd_Cliente()&&verificacao_cliente1==1){
                        dados.dados_cliente.get(cod_cliente).setDebito(dados.dados_cliente.get(cod_cliente).getDebito() + valor_ref2);
                        System.out.println("valor:"+dados.dados_cliente.get(cod_cliente).getDebito());
                         JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
                    }
                    
                   
                    
                    
                    
                }
       
    }
        );
       
       
        
        
        
    }

    

}
    