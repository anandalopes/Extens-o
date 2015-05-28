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
       cod.setBounds( 10 ,  40 , 50 ,  25);
       cod1.setBounds( 150 ,  40 , 100 ,  25);
       valor_ref.setBounds( 10 ,  70 , 100 ,  25);
       valor_ref1.setBounds( 150 ,  70 , 200 ,  25);
       Debitar.setBounds(120 , 240 , 100 , 25);
       Voltar.setBounds(230 , 240 , 100 , 25);
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
        
        /*Debitar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    int cod_cliente = Integer.parseInt(cod1.getText());
                    int valor_ref2 = Integer.parseInt(valor_ref1.getText());
                    Cliente cl = new Cliente(cod_cliente ,nome_cliente1.getText(),cpf2,sexo1.getText(),data2,0.0);
                    JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
                    dados.Cliente(cl);
                    cod1.setText(""+dados.qtdd_Cliente());
                    
                    
                    
                }
       
    }
        );
        */
       
       
        
        
        
    }

    

}
    