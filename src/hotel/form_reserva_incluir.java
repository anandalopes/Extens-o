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

public class form_reserva_incluir extends JFrame{

    public form_reserva_incluir(final vetores dados){
        //JFormattedTextField entrada1;
        //MaskFormatter maskentrada;
        Container tela = getContentPane();
        setLayout(null);
        setSize( 490 , 350 );
        setLocationRelativeTo( null );
        JLabel Label = new JLabel( "Inserir Reserva" );
        JLabel cod = new JLabel( "Codigo" );
        JLabel cod_cliente = new JLabel( "Codigo do Cliente" );
        JLabel tipo = new JLabel( "Tipo Quarto" );
        JLabel entrada = new JLabel( "Entrada" );
        JLabel Saida = new JLabel( "Saida" );
        
        JTextField cod1 = new JTextField(""+dados.qtdd_reserva()); 
        JTextField cod_cliente1 = new JTextField(); 
        JTextField tipo1 = new JTextField(); 
        JTextField entrada1 = new JTextField(); 
        
      //   try {
      //      maskentrada = new MaskFormatter("##/##/####");
      //      maskentrada.setPlaceholderCharacter('_');
      //  }
      //  catch(ParseException excp){
      //      entrada1 = new JFormattedTextField(maskentrada);
            
       // }
        JTextField Saida1 = new JTextField();
        JButton Lista_cliente = new JButton( "Lista cliente" );
        JButton lista_quarto = new JButton( "quarto" );
        JButton Confirmar = new JButton( "Confirma" );
          
 
        cod1.setEditable(false);
        Confirmar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if((cod_cliente1.getText().equals("")) || (tipo1.getText().equals("")) || (entrada1.getText().equals("") )||(Saida1.getText().equals(""))){
                     JOptionPane.showMessageDialog(null,"Preencha os dados corretamente");}
                    else{
                    int cod_cli = Integer.parseInt(cod_cliente1.getText());
                    int num = Integer.parseInt(tipo1.getText());
                    int inicio = Integer.parseInt(entrada1.getText());
                    int fim = Integer.parseInt(Saida1.getText());
                    int posicao_cliente= 0;
                    int posicao_quarto= 0;
                    int verificacao_cliente=0;
                    int verificacao_quarto=0;
                    int a=0;
                    int b=0;
                    for(int w=0; w< dados.qtdd_Cliente();w++ ){
                        if(cod_cli==dados.dados_cliente.get(w).cod){
                            posicao_cliente = w;
                            verificacao_cliente=1;
                        }
                    }
                    for(int q=0; q< dados.qtdd_quarto();q++ ){
                        if(num == dados.dados_quarto.get(q).getNumero()){
                            if(dados.dados_quarto.get(q).getOcupado() == 0){
                                posicao_quarto= q;
                                verificacao_quarto=1;
                            }
                        }
                    }
                    if(verificacao_cliente==1 && verificacao_quarto==1){
                        
                        dados.dados_quarto.get(posicao_quarto).setOcupado(1);
                        dados.dados_quarto.get(posicao_quarto).setCliente(cod_cli);
                        dados.dados_cliente.get(posicao_cliente).debito= (fim - inicio)*dados.dados_quarto.get(posicao_quarto).getValor() + dados.dados_cliente.get(posicao_cliente).debito;
                        Reserva reser = new Reserva(Integer.parseInt(cod1.getText()), cod_cli, num, inicio, fim, "");
                        dados.Reserva(reser);
                        JOptionPane.showMessageDialog(null, "pronto reservar concluida para: \n cliente:"
                                     + " "+dados.dados_cliente.get(posicao_cliente).Nome+"\nTipo Quarto: "+dados.dados_quarto.get(posicao_quarto).getTipo()+"\n Valor a pagar pela diarias:"+ dados.dados_cliente.get(posicao_cliente).debito);
                                     
                    }else{
                        JOptionPane.showMessageDialog(null,"O Cliente não está cadastrado ou Quarto indisponivel ");
                    }
                   verificacao_cliente=0;
                   verificacao_quarto=0;
                   cod1.setText(String.valueOf(dados.qtdd_reserva()));
                   cod1.setEditable(false);
                   cod_cliente1.setText("");
                   tipo1.setText("");
                   entrada1.setText("");
                   Saida1.setText("");
                                          
                    }
                }
            }
        );
        Lista_cliente.addActionListener(
                
                new ActionListener(){
                    String b="";
                    public void actionPerformed(ActionEvent e){
                        
                        for(int i=0;i< dados.qtdd_Cliente();i++){

                            b= b+ "\n Codigo:"+ i+ "\nNome:"+ dados.dados_cliente.get(i).Nome +"\n\n";
           
                       }
                    if(!(dados.qtdd_Cliente()>0)){
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
                            if(dados.dados_quarto.get(i).getOcupado() == 0){
                                b= b+"\nNumero:"+ dados.dados_quarto.get(i).getNumero()+"\n\n" ;
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

