package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

import static UI.StationLogin.frame;
import static jdk.xml.internal.SecuritySupport.getClassLoader;

public class AdminContact {

	private JFrame frmAdminContact;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminContact window = new AdminContact();
					window.frmAdminContact.setVisible(true);
					window.frmAdminContact.setSize(1650,1080);
					window.frmAdminContact.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AdminContact() {
		initialize();
	}

	private void initialize() {
		frmAdminContact = new JFrame();
		
		frmAdminContact.getContentPane().setBackground(Color.WHITE);
		frmAdminContact.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, -105, 300, 1080);
		frmAdminContact.getContentPane().add(panel);
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
				frmAdminContact.setVisible(false);
			}
		});
		lblOfficerLogin.setToolTipText("Click to login ");
		lblOfficerLogin.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblOfficerLogin.setForeground(new Color(255, 255, 255));
		lblOfficerLogin.setBounds(36, 233, 169, 31);
		panel.add(lblOfficerLogin);
		
		JLabel lblAdminContact = new JLabel("* Admin contact");
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
				frmAdminContact.setVisible(false);
				
			}
		});
		lblAboutUs.setForeground(new Color(255, 255, 255));
		lblAboutUs.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblAboutUs.setBounds(36, 363, 139, 23);
		panel.add(lblAboutUs);
		
		JLabel lblNewOfficer = new JLabel("* New officer Registration");
		lblNewOfficer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewOfficerRegistration.main(null);
				frmAdminContact.setVisible(false);
			}
		});
		lblNewOfficer.setForeground(Color.WHITE);
		lblNewOfficer.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblNewOfficer.setBounds(36, 276, 209, 28);
		panel.add(lblNewOfficer);
		
		JButton lblLogOut = new JButton("Log out");
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StationLogin.main(null);
				JOptionPane.showMessageDialog(frmAdminContact, "Succesfully Logged Out.");
				frmAdminContact.setVisible(false);
			}
		});
		lblLogOut.setToolTipText("Bck to Police login?");
		lblLogOut.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblLogOut.setBounds(1266, 12, 70, 15);
		frmAdminContact.getContentPane().add(lblLogOut);
		
		JLabel lblNewLabel = new JLabel("contact image");
		Image im = new ImageIcon(Objects.requireNonNull(this.getClass().getClassLoader().getResource("resources/contact-us.jpg"))).getImage();
		lblNewLabel.setIcon(new ImageIcon(im));
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(516, 12, 479, 212);
        assert frmAdminContact != null;
        frmAdminContact.getContentPane().add(lblNewLabel);
		
		JLabel lblHeyUser = new JLabel("Hey User, We are happy to receive any kind of suggestions from you...");
		lblHeyUser.setForeground(new Color(25, 25, 112));
		lblHeyUser.setFont(new Font("Chilanka", Font.BOLD, 14));
		lblHeyUser.setBounds(350, 277, 515, 24);
		frmAdminContact.getContentPane().add(lblHeyUser);
		
		JLabel lblNewLabel_1 = new JLabel("* NOTE :- Provide the problem what you have faced or any suggestions for improvement .");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Chilanka", Font.BOLD, 14));
		lblNewLabel_1.setBounds(350, 313, 887, 15);
		frmAdminContact.getContentPane().add(lblNewLabel_1);
		
		JLabel lblEnterYourMessage = new JLabel("Enter Your message : -");
		lblEnterYourMessage.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblEnterYourMessage.setBounds(350, 340, 186, 31);
		frmAdminContact.getContentPane().add(lblEnterYourMessage);
		
		JTextArea textArea = new JTextArea();
		Border coloredBorder = BorderFactory.createLineBorder(Color.BLUE, 1);
		textArea.setBorder(coloredBorder);
		textArea.setBounds(528, 349, 386, 155);
		frmAdminContact.getContentPane().add(textArea);

		JButton btnSend = new JButton("Send ");
		btnSend.setBackground(new Color(255, 255, 255));
		btnSend.setForeground(new Color(0, 0, 128));
		btnSend.setBounds(521, 516, 117, 25);
		frmAdminContact.getContentPane().add(btnSend);
		
		frmAdminContact.setTitle("Admin Contact");
		frmAdminContact.setBounds(100, 100, 926, 674);
		frmAdminContact.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
