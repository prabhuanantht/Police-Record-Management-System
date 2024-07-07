package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.Border;

import DB.PoliceDB_Functions;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class OfficerFir {

	private JFrame frmOfficerHome;
	private JTextField policeStationName;
	private JTextField title;
	private JTextField name;
	private JTextField mobile;
	private JTextField email;
	private JTextField firId;
	private JTextField textField_7;
	private JTextField city;
	private JTextField dateAdded;
	public static ResultSet rs;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfficerFir window = new OfficerFir();
					window.frmOfficerHome.setVisible(true);
					window.frmOfficerHome.setSize(1650,1080);
					window.frmOfficerHome.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OfficerFir() throws ClassNotFoundException, SQLException {
		initialize();
	}

	private void initialize() throws ClassNotFoundException, SQLException {
		PoliceDB_Functions db = new PoliceDB_Functions();
		frmOfficerHome = new JFrame();
		
		frmOfficerHome.getContentPane().setBackground(Color.WHITE);
		frmOfficerHome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, -118, 300, 1080);
		frmOfficerHome.getContentPane().add(panel);
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
		
		JLabel lblFir = new JLabel("* FIR");
		lblFir.setFont(new Font("Chilanka", Font.BOLD, 14));
		lblFir.setForeground(new Color(255, 255, 255));
		lblFir.setBackground(new Color(255, 255, 255));
		lblFir.setBounds(36, 249, 99, 15);
		panel.add(lblFir);
		
		JLabel lblCriminals = new JLabel("* Criminals");
		lblCriminals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			OfficerCriminal.main(null);
			frmOfficerHome.setVisible(false);
			}
		});
		lblCriminals.setFont(new Font("Chilanka", Font.BOLD, 14));
		lblCriminals.setForeground(new Color(255, 255, 255));
		lblCriminals.setBounds(36, 285, 139, 15);
		panel.add(lblCriminals);
		
		JLabel lblCases = new JLabel("* Cases");
		lblCases.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OfficerCase.main(null);
				frmOfficerHome.setVisible(false);
			}
		});

		lblCases.setFont(new Font("Chilanka", Font.BOLD, 14));
		lblCases.setForeground(new Color(255, 255, 255));
		lblCases.setBounds(36, 325, 70, 15);
		panel.add(lblCases);
		
		JLabel userProfile = new JLabel("");
		userProfile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userProfile.setForeground(Color.WHITE);
		userProfile.setText(Officerlogin.userProfile);
		userProfile.setBounds(36, 758, 214, 31);
		panel.add(userProfile);
		
		
		
		JButton lblLogOut = new JButton("Log out");
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Officerlogin.main(null);
				JOptionPane.showMessageDialog(frmOfficerHome, "Succesfully Logout.");
				frmOfficerHome.setVisible(false);
			}
		});

		lblLogOut.setToolTipText("Bck to Officer login login?");
		lblLogOut.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblLogOut.setBounds(1266, 12, 70, 15);
		frmOfficerHome.getContentPane().add(lblLogOut);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(UIManager.getColor("Menu.acceleratorForeground"));
		tabbedPane.setBounds(353, 12, 895, 600);
		frmOfficerHome.getContentPane().add(tabbedPane);
		Image im = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/resources/fir.jpg"))).getImage();
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("Create FIR", null, desktopPane, null);
		
		JLabel lblPoliceStationName = new JLabel("* Police Station Name ");
		lblPoliceStationName.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblPoliceStationName.setBounds(52, 54, 174, 21);
		desktopPane.add(lblPoliceStationName);
		
		JLabel lblSubject = new JLabel("* Subject");
		lblSubject.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblSubject.setBounds(52, 87, 80, 15);
		desktopPane.add(lblSubject);
		
		JLabel lblComplaintUder = new JLabel("* Complaint under ACT");
		lblComplaintUder.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblComplaintUder.setBounds(52, 114, 174, 15);
		desktopPane.add(lblComplaintUder);
		
		JLabel lblName = new JLabel("* Name ");
		lblName.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblName.setBounds(52, 141, 70, 15);
		desktopPane.add(lblName);
		
		JLabel lblAddress = new JLabel("* Address");
		lblAddress.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblAddress.setBounds(52, 179, 154, 15);
		desktopPane.add(lblAddress);
		
		JLabel lblCity = new JLabel("* CityArea");
		lblCity.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblCity.setBounds(52, 247, 126, 15);
		desktopPane.add(lblCity);
		
		JLabel lblPhone = new JLabel("* Phone");
		lblPhone.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblPhone.setBounds(52, 313, 70, 15);
		desktopPane.add(lblPhone);
		
		JLabel lblEmail = new JLabel("* Email ");
		lblEmail.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblEmail.setBounds(52, 340, 70, 15);
		desktopPane.add(lblEmail);
		
		policeStationName = new JTextField();
		policeStationName.setBounds(244, 53, 413, 19);
		desktopPane.add(policeStationName);
		policeStationName.setColumns(10);
		
		title = new JTextField();
		title.setBounds(244, 83, 271, 19);
		desktopPane.add(title);
		title.setColumns(10);
		
		name = new JTextField();
		name.setBounds(243, 137, 272, 19);
		desktopPane.add(name);
		name.setColumns(10);
		
		mobile = new JTextField();
		mobile.setBounds(244, 309, 271, 19);
		desktopPane.add(mobile);
		mobile.setColumns(10);
		
		email = new JTextField();
		email.setBounds(244, 336, 271, 19);
		desktopPane.add(email);
		email.setColumns(10);

		JComboBox<Integer> act = new JComboBox<>();
		act.setBounds(244, 107, 261, 24);
		desktopPane.add(act);
		act.addItem(null);
		act.addItem(301);
		act.addItem(302);
		act.addItem(303);
		act.addItem(304);
		act.setSelectedItem(null);
				
		JLabel lblNewLabel = new JLabel("FIR label");
		lblNewLabel.setBounds(675, 35, 203, 169);
		desktopPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(im));

		JLabel lblDetails = new JLabel("* Details");
		lblDetails.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblDetails.setBounds(52, 378, 70, 15);
		desktopPane.add(lblDetails);

		JTextArea details = new JTextArea();
		details.setToolTipText("Enter Here");
		Border coloredBorder1 = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);
		details.setBorder(coloredBorder1);
//				details.setBackground(Color.WHITE);
		details.setBounds(244, 376, 413, 76);
		desktopPane.add(details);

		JTextArea address = new JTextArea();
		address.setToolTipText("Enter here");
		Border coloredBorder2 = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);
		address.setBorder(coloredBorder2);
//				address.setBackground(Color.WHITE);
		address.setBounds(244, 168, 413, 51);
		desktopPane.add(address);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//create the fir
				String firIdString = firId.getText();
				String policeSN = policeStationName.getText();
				String titles = title.getText();
				String acts = Objects.requireNonNull(act.getSelectedItem()).toString();
				String caseName = name.getText();
				String Address = address.getText();
				String dateAdd = dateAdded.getText();
				String city1 = city.getText();
				String phone = mobile.getText();
				String Email = email.getText();
				String detail = details.getText();

				try {
					if(db.create_fir(firIdString, policeSN, titles, acts, caseName, Address, dateAdd, city1, phone, Email, detail)) {
						JOptionPane.showMessageDialog(frmOfficerHome, "FIR created successfully!");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(frmOfficerHome, "FIR id already exists!");
					e1.printStackTrace();
				}
			}
		});
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setForeground(Color.BLUE);
		btnSubmit.setFont(new Font("Chilanka", Font.BOLD, 14));
		btnSubmit.setBounds(244, 458, 117, 25);
		desktopPane.add(btnSubmit);

		JLabel lblFirId = new JLabel("* FIR ID");
		lblFirId.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblFirId.setBounds(52, 22, 70, 15);
		desktopPane.add(lblFirId);

		firId = new JTextField();
		firId.setBounds(244, 22, 114, 19);
		desktopPane.add(firId);
		firId.setColumns(10);

		city = new JTextField();
		city.setBounds(244, 245, 195, 21);
		desktopPane.add(city);
		city.setColumns(10);

		dateAdded = new JTextField();
		dateAdded.setColumns(10);
		dateAdded.setBounds(244, 277, 114, 19);
		desktopPane.add(dateAdded);

		JLabel label_1 = new JLabel("DD/MM/YYYY");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_1.setBounds(373, 279, 99, 15);
		desktopPane.add(label_1);

		JLabel lblDate = new JLabel("* Date");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 13));
		lblDate.setBounds(52, 280, 126, 15);
		desktopPane.add(lblDate);


		JDesktopPane desktopPane_1 = new JDesktopPane();
		tabbedPane.addTab("Search FIR", null, desktopPane_1, null);

		JLabel lblHelloUser = new JLabel("* Hello user You can search FIR stored among the Database .");
		lblHelloUser.setForeground(Color.WHITE);
		lblHelloUser.setBackground(Color.WHITE);
		lblHelloUser.setFont(new Font("Chilanka", Font.BOLD, 14));
		lblHelloUser.setBounds(48, 80, 517, 15);
		desktopPane_1.add(lblHelloUser);

		JLabel lblEnterFirId = new JLabel("Enter FIR ID ");
		lblEnterFirId.setFont(new Font("Chilanka", Font.BOLD, 13));
		lblEnterFirId.setBounds(58, 129, 115, 15);
		desktopPane_1.add(lblEnterFirId);

		textField_7 = new JTextField();
		textField_7.setBounds(172, 125, 205, 19);
		desktopPane_1.add(textField_7);
		textField_7.setColumns(10);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String firId = textField_7.getText();
				try {
					rs = db.search_fir(firId);
					if(rs == null) {
						JOptionPane.showMessageDialog(frmOfficerHome, "FIR not found");
					}else {
						frmOfficerHome.setVisible(false);
						DisplayFIR.main(null);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(frmOfficerHome, "Server not responding");
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(416, 122, 117, 25);
		desktopPane_1.add(btnNewButton);

		JLabel lblOr = new JLabel("OR");
		lblOr.setForeground(Color.WHITE);
		lblOr.setFont(new Font("FreeSerif", Font.BOLD, 17));
		lblOr.setBounds(230, 201, 70, 15);
		desktopPane_1.add(lblOr);

		JLabel lblSelectAct = new JLabel("Select ACT");
		lblSelectAct.setBounds(58, 304, 98, 15);
		desktopPane_1.add(lblSelectAct);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(172, 299, 205, 24);
		desktopPane_1.add(comboBox_2);

		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(416, 299, 117, 25);
		desktopPane_1.add(btnSearch);


        assert frmOfficerHome != null;
        frmOfficerHome.setTitle("Officer home ");
		frmOfficerHome.setBounds(100, 100, 1366, 732);
		frmOfficerHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//not used
//	private static void addPopup(Component component, final JPopupMenu popup) {
//		component.addMouseListener(new MouseAdapter() {
//			public void mousePressed(MouseEvent e) {
//				if (e.isPopupTrigger()) {
//					showMenu(e);
//				}
//			}
//			public void mouseReleased(MouseEvent e) {
//				if (e.isPopupTrigger()) {
//					showMenu(e);
//				}
//			}
//			private void showMenu(MouseEvent e) {
//				popup.show(e.getComponent(), e.getX(), e.getY());
//			}
//		});
//	}
}
