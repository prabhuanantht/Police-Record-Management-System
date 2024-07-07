package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class AboutUS {

	private JFrame frmAboutUs;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUS window = new AboutUS();
					window.frmAboutUs.setVisible(true);
					window.frmAboutUs.setSize(1650,1080);
					window.frmAboutUs.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AboutUS() {
		initialize();
	}

	private void initialize() {
		frmAboutUs = new JFrame();
		
		frmAboutUs.getContentPane().setBackground(Color.WHITE);
		frmAboutUs.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, -105, 300, 1080);
		frmAboutUs.getContentPane().add(panel);
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
				frmAboutUs.setVisible(false);
				
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
				frmAboutUs.setVisible(false);

			}
		});
		lblAdminContact.setToolTipText("Contact for Technical Help!");
		lblAdminContact.setForeground(new Color(255, 255, 255));
		lblAdminContact.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblAdminContact.setBounds(36, 312, 139, 39);
		panel.add(lblAdminContact);
		
		JLabel lblAboutUs = new JLabel("* About Us");
		lblAboutUs.setForeground(new Color(255, 255, 255));
		lblAboutUs.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblAboutUs.setBounds(36, 363, 139, 23);
		panel.add(lblAboutUs);
		
		JLabel lblNewOfficer = new JLabel("* New officer Registration");
		lblNewOfficer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewOfficerReg.main(null);
				frmAboutUs.setVisible(false);

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
				JOptionPane.showMessageDialog(frmAboutUs, "Succesfully Logout.");

				frmAboutUs.setVisible(false);

			}
		});
		lblLogOut.setToolTipText("Bck to Police login?");
		lblLogOut.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblLogOut.setBounds(1266, 12, 70, 15);
		frmAboutUs.getContentPane().add(lblLogOut);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(406, 131, 70, 15);
		frmAboutUs.getContentPane().add(label_1);
		
		JLabel lblAboutimage = new JLabel("aboutimage");
		Image im = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/resources/about.jpg"))).getImage();
		lblAboutimage.setIcon(new ImageIcon(im));
		lblAboutimage.setForeground(new Color(255, 255, 240));
		lblAboutimage.setBounds(691, 0, 279, 280);
		frmAboutUs.getContentPane().add(lblAboutimage);

		JTextArea aboutText = new JTextArea(
				"Welcome to our Police Record Management System, designed to streamline the management and organization of law enforcement data with efficiency and accuracy.\n\n"
						+ "Key Features:\n"
						+ "- Secure Data Management: Ensure confidentiality and integrity of sensitive law enforcement records.\n"
						+ "- User-Friendly Interface: Intuitive design for ease of use by officers and administrators alike.\n"
						+ "- Search and Reporting Tools: Powerful tools to quickly retrieve and analyze data for investigative purposes.\n"
						+ "- Audit Trail: Maintain a comprehensive audit trail to track all system activities.\n\n"
						+ "Mission Statement:\n"
						+ "Our mission is to provide law enforcement agencies with a robust and reliable system that enhances operational efficiency, supports informed decision-making, and contributes to public safety.\n\n"
						+ "Contact Us: poilce@kar.gov.in\n\n"
						+ "Privacy and Security:\n"
						+ "We are committed to protecting the privacy and security of all law enforcement data stored within our system. Our practices adhere to industry standards and regulations to ensure the highest level of data protection.\n\n"
		);
		aboutText.setEditable(false);
		aboutText.setLineWrap(true);
		aboutText.setWrapStyleWord(true);
		frmAboutUs.getContentPane().add(aboutText);
		aboutText.setBounds(500, 280, 700, 460);

		frmAboutUs.setTitle("About Us");
		frmAboutUs.setBounds(100, 100, 1196, 559);
		frmAboutUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
