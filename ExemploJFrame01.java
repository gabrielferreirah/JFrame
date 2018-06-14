import java.awt.Color;

import javax.swing.JFrame;
public class ExemploJFrame01 {

	public static void main(String[] args) {
		// cria uma tela
		JFrame tela = new JFrame();

		// define o tamanho da tela
		// width ↨, heigth ↔
		tela.setSize(500,500);

		// diz que o layout é nulo
		tela.setLayout(null);

		// passando nle ele centraliza a janela
		tela.setLocationRelativeTo(null);

		// diz que quando o usuário fechar a aplicação irá encerrar a aplicação
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// define o titulo da janela
		tela.setTitle("Hello World");

		// import java.awt.Color;
		tela.getContentPane().setBackground(Color.DARK_GRAY);
		// tela.getContentPane().setBackground(Color.decode("#b3fc2a"));

		// apresentar a janela
		tela.setVisible(true);
	}
}