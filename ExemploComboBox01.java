import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ExemploComboBox01{
    
    public static void main(String[] args) {
        
        JFrame tela = new JFrame();
        tela.setSize(500, 500);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelJogo = new JLabel("Jogo");
        labelJogo.setSize(70, 20);
        labelJogo.setLocation(10, 10);
        tela.add(labelJogo);

        JComboBox caixaDeSelecao = new JComboBox();
        caixaDeSelecao.setSize(200, 20);
        caixaDeSelecao.setLocation(85, 10);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
        	new Object[]{
        		"Bom de Guerra", "Fortinaite", "Mainicréfiti", "Poquemón", "FárCraie 5"
        	}

        	);
        caixaDeSelecao.setModel(modelo);
        caixaDeSelecao.setSelectedIndex(-1);
        tela.add(caixaDeSelecao);

        JButton botao = new JButton("Obter");
        botao.setSize(150, 20);
        botao.setLocation(45, 35);
        botao.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
            	if (caixaDeSelecao.getSelectedIndex() == -1) {
            		JOptionPane.showMessageDialog(null, "Selecine algum jogo bom");
            		return;
            	}
        		String jogoSelecionado = caixaDeSelecao.getSelectedItem().toString();
        		JOptionPane.showMessageDialog(null, "Jogo selecionado: " + jogoSelecionado);
        	}
        });
        tela.add(botao);

        tela.setVisible(true);
    }
}