import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class AppLabel extends JLabel{

	private static final long serialVersionUID = 1L;

	public AppLabel(String texto) {
		super(texto);
		init();
	}

	private void init() {
	this.setHorizontalAlignment(JLabel.CENTER);
	this.setForeground(new Color(0, 0, 0));
	this.setFont(new Font(null, Font.BOLD, 16));
	}


}

