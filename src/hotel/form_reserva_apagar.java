package hotel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.Clock;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class form_reserva_apagar extends JFrame{

    public form_reserva_apagar(final vetores dados){
        //JFormattedTextField entrada1;
        //MaskFormatter maskentrada;
        Container tela = getContentPane();
        setLayout(null);
        setSize( 490 , 350 );
        setLocationRelativeTo( null );
        JLabel Label = new JLabel( "Inserir Reserva" );
        JLabel cod_cliente = new JLabel( "Codigo do Cliente" );
        JLabel tipo = new JLabel( "Nº do quarto" );

        JTextField cod_cliente1 = new JTextField(); 
        JTextField tipo1 = new JTextField(); 

        JButton lista_reserva = new JButton( "Reserva" );
        JButton Confirmar = new JButton( "Confirma" );
          
 
        Confirmar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if((cod_cliente1.getText().equals("")) || (tipo1.getText().equals(""))){
                     JOptionPane.showMessageDialog(null,"Preencha os dados corretamente");}
                    else{
                    int cod_cli = Integer.parseInt(cod_cliente1.getText());
                    int num = Integer.parseInt(tipo1.getText());

                    int posicao_cliente= 0;
                    int posicao_quarto= 0;
                    int verificacao_cliente=0;
                    int verificacao_quarto=0;
                    int a=0;
                    int b=0;
                    for(int w=0; w< dados.qtdd_Cliente();w++ ){
                        if(cod_cli==dados.dados_cliente.get(w).getCod()){
                            posicao_cliente = w;
                            verificacao_cliente=1;
                        }
                    }
                    for(int q=0; q< dados.qtdd_quarto();q++ ){
                        if(num == dados.dados_quarto.get(q).getNumero()){
                            if(dados.dados_quarto.get(q).getOcupado() == 1){
                                posicao_quarto= q;
                                verificacao_quarto=1;
                            }
                        }
                    }
                    if(verificacao_cliente==1 && verificacao_quarto==1){
                        
                        dados.dados_quarto.get(posicao_quarto).setOcupado(0);
                        
                        JOptionPane.showMessageDialog(null, "pronto reserva cancelada para: \n cliente:"
                                     + " "+dados.dados_cliente.get(posicao_cliente).getNome()+"\nTipo Quarto: "+dados.dados_quarto.get(posicao_quarto).getTipo()+"\n Valor a pagar pela diarias:"+ dados.dados_cliente.get(posicao_cliente).getDebito());
                        System.out.println("pronto reserva cancelada para: \n cliente:"
                                     + " "+dados.dados_cliente.get(posicao_cliente).getNome()+"\nTipo Quarto: "+dados.dados_quarto.get(posicao_quarto).getTipo()+"\n Valor a pagar pela diarias:"+ dados.dados_cliente.get(posicao_cliente).getDebito());             
                    }else{
                        JOptionPane.showMessageDialog(null,"O Cliente não está cadastrado ou Quarto indisponivel ");
                    }
                   verificacao_cliente=0;
                   verificacao_quarto=0;
                   cod_cliente1.setText("");
                   tipo1.setText("");
                    }
                }
            }
        );
        lista_reserva.addActionListener(
                
                new ActionListener(){
                    String b="";
                    int contar= 0;
                    public void actionPerformed(ActionEvent e){
                        
                        for(int i=0;i< dados.qtdd_quarto();i++){
                            if(dados.dados_quarto.get(i).getOcupado() == 1){
                                b= b+"\nNumero:"+ dados.dados_quarto.get(i).getNumero()+"\nCliente: "+ dados.dados_cliente.get(dados.dados_quarto.get(i).getCliente()).getNome() +"\n" ;
                            }
                            else{
                                contar = contar +1;
                            }
                        }
                    if((dados.qtdd_quarto()==contar)){
                        JOptionPane.showMessageDialog(null,"Não tem quarto reservado" );
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
       cod_cliente.setBounds( 10 ,  70 , 100 ,  25);
       lista_reserva.setBounds( 180 ,  70 , 100 ,  25);
       cod_cliente1.setBounds( 110 ,  70 , 50 ,  25);
       tipo.setBounds( 10 ,  100 , 100 ,  25);
       tipo1.setBounds( 110 ,  100 , 150 ,  25);
       Voltar.setBounds(120 ,  280 , 100 ,  25);
       Confirmar.setBounds(10 ,  280 , 100 ,  25);
       tela.add(cod_cliente);
       tela.add(cod_cliente1);
       tela.add(tipo);
       tela.add(tipo1);
       tela.add(Voltar);
        tela.add(Confirmar);
        tela.add(lista_reserva);
       setVisible( true );}
     
    } 

