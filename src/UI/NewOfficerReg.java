package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Objects;

import DB.PoliceDB_Functions;

public class NewOfficerReg {

	private JFrame frmNewOfficerRegistrstion;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewOfficerReg window = new NewOfficerReg();
					window.frmNewOfficerRegistrstion.setVisible(true);
					window.frmNewOfficerRegistrstion.setSize(1650,1080);
					window.frmNewOfficerRegistrstion.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NewOfficerReg() throws ClassNotFoundException, SQLException {
		initialize();
	}

	private void initialize() throws ClassNotFoundException, SQLException {
		
		PoliceDB_Functions db = new PoliceDB_Functions();
		
		frmNewOfficerRegistrstion = new JFrame();
		frmNewOfficerRegistrstion.getContentPane().setBackground(Color.WHITE);
		frmNewOfficerRegistrstion.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, -105, 300, 1080);
		frmNewOfficerRegistrstion.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCrimeInvestigationSystem = new JLabel(" POLICE ");
		lblCrimeInvestigationSystem.setBounds(36, 147, 252, 31);
		lblCrimeInvestigationSystem.setForeground(new Color(255, 255, 255));
		panel.add(lblCrimeInvestigationSystem);
		lblCrimeInvestigationSystem.setFont(new Font("Chandas", Font.BOLD, 16));
		
		JLabel label = new JLabel("________________________________________________");
		label.setBounds(36, 166, 276, 31);
		label.setFont(new Font("Dialog", Font.BOLD, 10));
		label.setForeground(new Color(255, 255, 255));
		panel.add(label);
		
		JLabel lblOfficerLogin = new JLabel("* Officer Login");
		lblOfficerLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Officerlogin.main(null);
				frmNewOfficerRegistrstion.setVisible(false);
			}
		});
		lblOfficerLogin.setToolTipText("Click to login ");
		lblOfficerLogin.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblOfficerLogin.setForeground(new Color(255, 255, 255));
		lblOfficerLogin.setBounds(36, 233, 169, 31);
		panel.add(lblOfficerLogin);
		
		JLabel lblAdminContact = new JLabel("* Admin contact");
		lblAdminContact.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactAdmin.main(null);
				frmNewOfficerRegistrstion.setVisible(false);
			}
		});
		lblAdminContact.setToolTipText("Contact for Technical Help!");
		lblAdminContact.setForeground(new Color(255, 255, 255));
		lblAdminContact.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblAdminContact.setBounds(36, 312, 139, 39);
		panel.add(lblAdminContact);
		
		JLabel lblAboutUs = new JLabel("* About Us");
		lblAboutUs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			AboutUS.main(null);
			frmNewOfficerRegistrstion.setVisible(false);
			}
		});
		lblAboutUs.setForeground(new Color(255, 255, 255));
		lblAboutUs.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblAboutUs.setBounds(36, 363, 139, 23);
		panel.add(lblAboutUs);
		
		JLabel lblNewOfficer = new JLabel("* New officer Registration");
		lblNewOfficer.setForeground(Color.WHITE);
		lblNewOfficer.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblNewOfficer.setBounds(36, 276, 209, 28);
		panel.add(lblNewOfficer);
		
		JButton lblLogOut = new JButton("Log out");
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StationLogin.main(null);
				JOptionPane.showMessageDialog(frmNewOfficerRegistrstion, "Succesfully Logout.");
				frmNewOfficerRegistrstion.setVisible(false);
			}
		});

		lblLogOut.setToolTipText("Bck to Police login?");
		lblLogOut.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblLogOut.setBounds(1266, 12, 70, 15);
		frmNewOfficerRegistrstion.getContentPane().add(lblLogOut);
		
		JLabel lblNewLabel = new JLabel("welcomelable");
		Image im = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/resources/welcome.jpg"))).getImage();
		lblNewLabel.setIcon(new ImageIcon(im));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(558, 12, 416, 115);
        assert frmNewOfficerRegistrstion != null;
        frmNewOfficerRegistrstion.getContentPane().add(lblNewLabel);
		
		JLabel lblCreateNewRegistration = new JLabel("New Registration ");
		lblCreateNewRegistration.setForeground(Color.BLACK);
		lblCreateNewRegistration.setFont(new Font("Chilanka", Font.BOLD, 17));
		lblCreateNewRegistration.setBounds(653, 139, 245, 43);
		frmNewOfficerRegistrstion.getContentPane().add(lblCreateNewRegistration);
		
		JLabel lblPoliceStationId = new JLabel("* Enter Police Station Id   : ");
		lblPoliceStationId.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblPoliceStationId.setBounds(504, 205, 196, 21);
		frmNewOfficerRegistrstion.getContentPane().add(lblPoliceStationId);
		
		JLabel lblNewLabel_1 = new JLabel("* Enter Your name           :");
		lblNewLabel_1.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblNewLabel_1.setBounds(504, 238, 196, 15);
		frmNewOfficerRegistrstion.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("* Enter Your Designation  :");
		lblNewLabel_2.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblNewLabel_2.setBounds(504, 275, 196, 15);
		frmNewOfficerRegistrstion.getContentPane().add(lblNewLabel_2);
		
		JLabel lblEnterMobile = new JLabel("* Enter Mobile no.           :");
		lblEnterMobile.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblEnterMobile.setBounds(504, 308, 196, 15);
		frmNewOfficerRegistrstion.getContentPane().add(lblEnterMobile);
		
		JLabel lblenterCurrentAddress = new JLabel("* Enter Current Address   :");
		lblenterCurrentAddress.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblenterCurrentAddress.setBounds(504, 335, 196, 15);
		frmNewOfficerRegistrstion.getContentPane().add(lblenterCurrentAddress);
		
		JLabel lblSelectUsername = new JLabel("* Select Username           :");
		lblSelectUsername.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblSelectUsername.setBounds(504, 362, 210, 15);
		frmNewOfficerRegistrstion.getContentPane().add(lblSelectUsername);
		
		JLabel lblSelectPassword = new JLabel("* Select Password          :");
		lblSelectPassword.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblSelectPassword.setBounds(504, 389, 196, 15);
		frmNewOfficerRegistrstion.getContentPane().add(lblSelectPassword);
		
		textField = new JTextField();
		textField.setBounds(732, 204, 231, 19);
		frmNewOfficerRegistrstion.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(732, 238, 231, 19);
		frmNewOfficerRegistrstion.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(732, 271, 231, 19);
		frmNewOfficerRegistrstion.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(732, 302, 231, 19);
		frmNewOfficerRegistrstion.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(732, 331, 231, 19);
		frmNewOfficerRegistrstion.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(732, 358, 231, 19);
		frmNewOfficerRegistrstion.getContentPane().add(textField_5);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String stationId = textField.getText().trim();
				String name = textField_1.getText().trim();
				String post = textField_2.getText().trim();
				String mobile = textField_3.getText().trim();
				String address = textField_4.getText().trim();
				String username = textField_5.getText().trim();
				char[] pass = passwordField.getPassword();
				String password = new String(pass);
				
				try {
					String msg = db.police_officer_register(stationId, name, post, mobile, address, username, password);
					JOptionPane.showMessageDialog(frmNewOfficerRegistrstion.getContentPane(), msg);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(frmNewOfficerRegistrstion.getContentPane(), "Please enter valid station id");
					e1.printStackTrace();
				}
			}
		});
		btnSignUp.setFont(new Font("Chilanka", Font.BOLD, 13));
		btnSignUp.setBackground(new Color(255, 255, 255));
		btnSignUp.setBackground(Color.BLACK);
		btnSignUp.setBounds(648, 416, 117, 25);
		frmNewOfficerRegistrstion.getContentPane().add(btnSignUp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(732, 385, 231, 19);
		frmNewOfficerRegistrstion.getContentPane().add(passwordField);
		
		frmNewOfficerRegistrstion.setTitle("New Officer Registrstion ");
		frmNewOfficerRegistrstion.setBounds(100, 100, 1366, 495);
		frmNewOfficerRegistrstion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
