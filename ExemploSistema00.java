import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
    
public class ExemploSistema00{

    public static void main(String[] args) {

        JFrame tela = new JFrame();
        tela.setSize(500, 500);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNome = new JLabel("Nome");
        JLabel labelItens = new JLabel("Itens");

        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoEditar = new JButton("Editar");
        JButton botaoApagar = new JButton("Apagar");
        
        JTextField campoNome = new JTextField();
        JComboBox caixaSelecaoItens = new JComboBox<>();

        labelNome.setSize(50, 20);
        labelItens.setSize(50, 20);
        botaoCadastrar.setSize(150, 30);
        botaoEditar.setSize(150, 30);
        botaoApagar.setSize(150, 30);
        campoNome.setSize(405, 20);
        caixaSelecaoItens.setSize(405, 20);

        labelNome.seLocation(10, 10);
        campoNome.seLocation(65, 10);
        botaoCadastrar.seLocation(10, 35);
        botaoEditar.seLocation(165, 35);
        botaoApagar.seLocation(320, 35);
        labelItens.seLocation(10, 70);
        caixaSelecaoItens.seLocation(65, 70);

        botaoCadastrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            cadastrar();
            }
        });

        botaoEditar.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent e){
            editar();
            }
        });

        tela.add(labelNome);
        tela.add(labelItens);
        tela.add(botaoCadastrar);
        tela.add(botaoEditar);
        tela.add(botaoApagar);
        tela.add(campoNome);
        tela.add(caixaSelecaoItens);

        tela.setVisible(true);
    }
    private static void cadastrar(){
        String nome = campoNome.getText().trim();
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe um nome!");
                return;
            }
            if (nome.length() < 3) {
                JOptionPane.showMessageDialog(null, "informe no mínimo 3 carateres!");
                return;
            }
            caixaSelecaoItens.addItem(nome);
            campoNome.setText("");
            JOptionPane.showMessageDialog(null, nome + " cadastrado com sucesso!");
    }

    private static void editar(){

    }
}