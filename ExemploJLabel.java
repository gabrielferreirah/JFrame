import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ExemploJLabel{

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Exemplo JLabel");
		jFrame.setSize(500, 300);
		jFrame.setLayout(null);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel labelNome = new JLabel();
		labelNome.setText("Nome");
		labelNome.setSize(100, 25);
		labelNome.setLocation(50, 80);

		JButton botao = new JButton();
	}
}