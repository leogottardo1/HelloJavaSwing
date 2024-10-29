import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField txtNome;
    private JLabel lnlNome;
    private JButton btnValidar;
    private JLabel txtResultado;
    private JPanel mainPanel;

    public MainForm() {
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obter nome do input
                String nomeDigitado = txtNome.getText();

                txtResultado.setText(nomeDigitado);
            }
        });
    }

    public static void main(String[] args) {

        //cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela");

        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha tv do tamanho do meu painel
        frame.pack();
        //frame.setSize(500, 500);
        //Ligar TV
        frame.setVisible(true);


    }
}
