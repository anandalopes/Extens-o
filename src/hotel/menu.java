package hotel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class menu extends JFrame{
    public menu(final vetores dados){
 
        super ("MENU PRINCIPAL");
        Container tela = getContentPane();
        setLayout(null);
        setSize( 490 , 350 );
        setLocationRelativeTo( null );
        JLabel Label = new JLabel( "Menu Principal" );

        
        JButton Reserva = new JButton( "Reserva" );
        JButton Cliente = new JButton( "Cliente" );
        JButton Refeição = new JButton( "Refeição" );
        JButton forma_pagamento = new JButton( "Pagamento" );
        JButton Sair = new JButton( "Sair" );
        Reserva.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        new form_reserva(dados).setVisible(true);
                        dispose();
                    }
                }
        );
        Cliente.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        new form_cadastro(dados).setVisible(true);
                        dispose();
                    }
                }
        );
        Refeição.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                      new Form_refeicao(dados).setVisible(true);
                      dispose();
                    }
                }
                
        );
        forma_pagamento.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    new form_pagamento(dados).setVisible(true);
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
        Reserva.setBounds(50 ,  100 ,  100 ,  50 );
        tela.add(Reserva);
        Cliente.setBounds(170 ,  100 , 100 ,  50 );
        tela.add(Cliente);
        Refeição.setBounds(290 ,  100 ,  100 ,  50 );
        forma_pagamento.setBounds(170 ,  160 ,  100 ,  50 );
        tela.add(Refeição);
        tela.add(forma_pagamento);
        Sair.setBounds( 350 ,  250 , 100 ,  25 );
        tela.add(Sair);
        }
    
}
