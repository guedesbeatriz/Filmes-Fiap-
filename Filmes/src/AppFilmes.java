import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AppFilmes {
	
	public static void main(String[] args) {
	
	// Frame //
	JFrame frame = new JFrame("FIAP Filmes");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600,600);
	
	// Panel //
	JPanel panel = new JPanel(new BorderLayout(20, 0));
	
	JPanel imagem = new JPanel();
	
	JPanel informacoes = new JPanel(new GridLayout(0, 1));
	
	JPanel elementos = new JPanel(new GridLayout(0, 1));
		elementos.setPreferredSize(new Dimension(130, 400));
	
	JPanel botoes = new JPanel();

	panel.add(imagem, BorderLayout.WEST);
	panel.add(informacoes, BorderLayout.CENTER);
	panel.add(elementos, BorderLayout.EAST);
	panel.add(botoes, BorderLayout.SOUTH);
	
	
	// TabbedPane //
	JTabbedPane abas = new JTabbedPane();
	abas.add("Cadastro", panel);
	abas.add("Lista", new Panel());
	
	frame.add(abas);
	

	// Imagem //
	imagem.add(new AppImage(new ImageIcon("Imagens/Detona_Ralph.png")));
	
	// Label Titulo // 
	informacoes.add(new AppLabel("Título"));
	
	// TextField Titulo //
	informacoes.add(new AppTextField());
	
	// Label Sinopse //
	informacoes.add(new AppLabel("Sinopse"));
	
	// TextField Sinopse //
	informacoes.add(new AppTextField());
	
	// Label Genero //
	informacoes.add(new AppLabel("Gênero"));
	
	// Combo Box Genero //
	String[] genero = {"", "Ação", "Aventura", "Comédia", "Documentário", "Drama", "Fantasia", "Ficção Científica", "Guerra", "Musical", "Romance", "Suspense", "Terror"};
	informacoes.add(new JComboBox<String>(genero));
	
	// JButton Salvar e Cancelar //
	JButton salvar = new JButton("Salvar");
	JButton cancelar = new JButton("Cancelar");
	botoes.add(salvar);
	botoes.add(cancelar);
	
	// Label Onde assistir //
	elementos.add(new AppLabel("Onde assistir"));
	
	// RadioGroup //
	List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Disney+");
	AppRadioGroup group = new AppRadioGroup(listaDeOpcoes );
	elementos.add(group);
	
	// CheckBox Assistido //
	elementos.add(new AppCheckBox("assistido"));
	
	// Label Avaliacao // 
	elementos.add(new AppLabel("Avaliação"));
	elementos.add(new StarRater(5,3.5f));

	
	// Lista //
	JPanel panel2 = new JPanel();
	panel.setLayout(new FlowLayout());
	
	
	frame.setVisible(true);
	
	
	}
	
}
