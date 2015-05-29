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
 * @author Alberto
 */
public class form_cadastro extends JFrame{
    public form_cadastro(vetores dados){
        Container tela = getContentPane();
        setLayout(null);
        setSize( 490 , 350 );
        setLocationRelativeTo( null );
        JLabel Label = new JLabel( "Cadastro de Clientes" );
        JLabel cod = new JLabel( "Codigo do Cliente" );
        JLabel nome_cliente = new JLabel( "Nome do Cliente" );
        JLabel CPF = new JLabel( "CPF do cliente" );
        JLabel sexo = new JLabel( "Sexo" );
        JLabel data = new JLabel( "Data de nascimento" );
        
        JTextField cod1 = new JTextField(""+dados.qtdd_Cliente()); 
        JTextField nome_cliente1 = new JTextField(); 
        JTextField cpf1 = new JTextField(); 
        JTextField sexo1 = new JTextField(); 
        JTextField data1 = new JTextField();
        JButton Cadastrar = new JButton( "Cadastrar" );
        JButton Voltar = new JButton( "Voltar" );
        
        
       Label.setBounds(  140 ,  10 ,  250 ,  25 ) ;
       cod.setBounds( 10 ,  40 , 50 ,  25);
       cod1.setBounds( 150 ,  40 , 100 ,  25);
       nome_cliente.setBounds( 10 ,  70 , 100 ,  25);
       nome_cliente1.setBounds( 150 ,  70 , 200 ,  25);
       CPF.setBounds(10 , 100 , 100 , 25);
       cpf1.setBounds(150 , 100 , 100 , 25);
       sexo.setBounds(10 , 130 , 100 , 25);
       sexo1.setBounds(150 , 130 , 100 , 25);
       data.setBounds(10 , 160 , 140 , 25);
       data1.setBounds(150 , 160 , 100 , 25);
       Cadastrar.setBounds(120 , 240 , 100 , 25);
       Voltar.setBounds(230 , 240 , 100 , 25);
       tela.add(cod);
       tela.add(cod1);
       tela.add(nome_cliente);
       tela.add(nome_cliente1);
       tela.add(CPF);
       tela.add(cpf1);
       tela.add(sexo);
       tela.add(sexo1);
       tela.add(data);
       tela.add(data1);
       tela.add(Cadastrar);
       tela.add(Voltar);
       
       cod1.setEditable(false);
        Voltar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    new menu(dados).setVisible(true);
                    dispose();
                }
       
    }
        );
        
        Cadastrar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if((nome_cliente1.getText().equals("")) || (cpf1.getText().equals("")) || (sexo1.getText().equals("") )||(data1.getText().equals(""))){
                     JOptionPane.showMessageDialog(null,"Preencha os dados corretamente");}
                    else{
                    int cod_cliente = Integer.parseInt(cod1.getText());
                    int cpf2 = Integer.parseInt(cpf1.getText());
                    int data2 = Integer.parseInt(data1.getText());
                    Cliente cl = new Cliente(cod_cliente ,nome_cliente1.getText(),cpf2,sexo1.getText(),data2,0.0);
                    JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
                        System.out.println("Cadastro realizado com sucesso");
                    dados.Cliente(cl);
                    cod1.setText(""+dados.qtdd_Cliente());
                    }
                    
                    
                }
       
    }
        );
    
}
}
