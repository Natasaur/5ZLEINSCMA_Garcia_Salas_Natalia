import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Interfaz {
    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }

    /**
     * MenuPrincipal()
     */
    public class MenuPrincipal() {
        setTitle("CRUD");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JButton mostrarButton = new JButton("Mostrar todas las personas");
        JButton mostrarButton = new JButton("Registrar nueva persona");
        JButton mostrarButton = new JButton("Registrar nueva persona");
        JButton mostrarButton = new JButton("ELiminar nueva persona");

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //TitanInfoFrame fundadorInfo = new TitanInfoFrame("Titan Fundador", "Se trata del titán más poderoso de todos ya que puede crear titanes puros y controlar todas sus acciones.\n", "fundador.jpg");
                //fundadorInfo.setVisible(true);
            }  
        });

        JPanel panel = new JPanel();
        panel.add(mostrarButton);

        add(panel);
    }
}
