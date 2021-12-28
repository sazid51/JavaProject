import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("CLassical Snake Game");
		
		Gameplay gameplay = new Gameplay();
		frame.setBounds(10,10,905,700);
		frame.setBackground(Color.darkGray);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gameplay);
	}

}
