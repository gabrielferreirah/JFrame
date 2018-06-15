import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploJButton02{

	public static void main(String[] args) {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton botao = new JButton("Não clique aqui!");
		botao.setSize(400, 300);
		botao.setLocation(40, 140);
		botao.setBackground(Color.decode("#353638"));
		// remove borda ao redor do texto
		botao.setFocusPainted(false);
		// remove a borda ao redor do botao
		botao.setBorderPainted(false);

		botao.addMouseListener(new MouseListener(){
		
			@Override
			public void mouseExited(MouseEvent e) {
				botao.setBackground(Color.decode("#353638"));
			}
		
			@Override
			public void mouseEntered(MouseEvent e) {
				botao.setBackground(Color.decode("#ffffff"));
			}
		});
	}
}