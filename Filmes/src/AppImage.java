import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class AppImage extends JLabel {


private static final long serialVersionUID = 1L;


public AppImage(ImageIcon imageIcon) {
super(imageIcon);
init();
}


private void init() {
this.setHorizontalAlignment(JLabel.CENTER);
this.setPreferredSize(new Dimension(200, 297));

}

}