package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.User;
import model.UserType;
import controller.Authenticate;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private Authenticate auth = new Authenticate();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 10, 438, 256);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(114, 64, 61, 16);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(156, 59, 162, 26);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(114, 110, 61, 16);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(188, 16, 61, 16);
		panel.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null && !textField.getText().isEmpty() &&
				   passwordField.getText()!=null && !passwordField.getText().isEmpty()
						) {
					String email = textField.getText();
                    String password = new String(passwordField.getPassword());
                    User user = auth.authenticate(email, password);

                    if(user != null) {
                        if(user.getType() == UserType.MARCA) {
                            TelaMarca telaMarca = new TelaMarca();
                            telaMarca.setVisible(true);
                            dispose();
                        } else if(user.getType() == UserType.INFLUENCER) {
                            TelaInfluencer telaInfluencer = new TelaInfluencer();
                            telaInfluencer.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(btnNewButton,"Tipo de usuário desconhecido", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,"Credenciais inválidas", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"Verifique as informações", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(168, 153, 117, 29);
		panel.add(btnNewButton);

		passwordField = new JPasswordField();
		passwordField.setBounds(156, 105, 162, 26);
		panel.add(passwordField);
	}


}
