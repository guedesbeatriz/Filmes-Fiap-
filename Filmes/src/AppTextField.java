import java.awt.Dimension;
import javax.swing.JTextField;

public class AppTextField extends JTextField {

	private static final long serialVersionUID = 1L;

		public AppTextField() {
	        super();
	        init();
	    }
	 
	    private void init() {
	        this.setPreferredSize(new Dimension(200,30));
	 
	    }
	 
	}
