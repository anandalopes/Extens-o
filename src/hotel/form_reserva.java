/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ananda
 */
public class form_reserva extends JFrame{
    public form_reserva(final vetores dados){
        
        super ("Reserva");
        Container tela = getContentPane();
        setLayout(null);
        setSize( 490 , 350 );
        setLocationRelativeTo( null );
        JLabel Label = new JLabel( "Reserva" );

        
        JButton Incluir = new JButton( "Incluir Reserca" );
        JButton Apagar  = new JButton( "Apagar Reserva" );

        JButton Volta = new JButton( "Volta" );
        JButton Sair = new JButton( "Sair" );
        Incluir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        new form_reserva_incluir(dados).setVisible(true);
                        dispose();
                    }
                }
        );
        Apagar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                 //       new form_reserva_apagardados).setVisible(true);
                        dispose();
                    }
                }
        );
        Volta.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    new menu(dados).setVisible(true);
                        dispose();
                    }
                }
                
        );
        Sair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    System.exit(0);
                    }
                }      
        );
        Label.setBounds(180 ,  30 ,  250 ,  25);
        tela.add(Label);
        Incluir.setBounds(50 ,  100 ,  150 ,  50 );
        tela.add(Incluir);
        Apagar.setBounds(270 ,  100 , 150 ,  50 );
        tela.add(Apagar);
        Volta.setBounds(170 ,  160 ,  100 ,  50 );
        tela.add(Volta);
        Sair.setBounds( 350 ,  250 , 100 ,  25 );
        tela.add(Sair);
        }

    
}
