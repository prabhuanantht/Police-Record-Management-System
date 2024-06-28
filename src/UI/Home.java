
package UI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import javax.swing.*;

public class Home {

    private JFrame frmCrimeInvestigationhome;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Home window = new Home();
                window.frmCrimeInvestigationhome.setVisible(true);
                window.frmCrimeInvestigationhome.setSize(1650, 1080);
                window.frmCrimeInvestigationhome.setLocationRelativeTo(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Home() {
        initialize();
    }

    private void initialize() {
        frmCrimeInvestigationhome = new JFrame();
        frmCrimeInvestigationhome.getContentPane().setBackground(Color.LIGHT_GRAY);
        frmCrimeInvestigationhome.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(25, 25, 112));
        panel.setBounds(0, -105, 300, 1080);
        frmCrimeInvestigationhome.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblCrimeInvestigationSystem = new JLabel("POLICE");
        lblCrimeInvestigationSystem.setBounds(36, 147, 252, 31);
        lblCrimeInvestigationSystem.setForeground(Color.WHITE);
        lblCrimeInvestigationSystem.setFont(new Font("Chandas", Font.BOLD, 16));
        panel.add(lblCrimeInvestigationSystem);

        JLabel label = new JLabel("________________________________________________");
        label.setBounds(36, 166, 276, 31);
        label.setFont(new Font("Dialog", Font.BOLD, 10));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel lblOfficerLogin = new JLabel("* Officer Login");
        lblOfficerLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Officerlogin.main(null);
                frmCrimeInvestigationhome.setVisible(false);
            }
        });
        lblOfficerLogin.setToolTipText("Click to login");
        lblOfficerLogin.setFont(new Font("Chilanka", Font.BOLD, 13));
        lblOfficerLogin.setForeground(Color.WHITE);
        lblOfficerLogin.setBounds(36, 233, 169, 31);
        panel.add(lblOfficerLogin);

        JLabel lblAdminContact = new JLabel("* Admin contact");
        lblAdminContact.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AdminContact.main(null);
                frmCrimeInvestigationhome.setVisible(false);
            }
        });
        lblAdminContact.setToolTipText("Contact for Technical Help!");
        lblAdminContact.setFont(new Font("Chilanka", Font.BOLD, 13));
        lblAdminContact.setForeground(Color.WHITE);
        lblAdminContact.setBounds(36, 312, 139, 39);
        panel.add(lblAdminContact);

        JLabel lblAboutUs = new JLabel("* About Us");
        lblAboutUs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AboutUS.main(null);
                frmCrimeInvestigationhome.setVisible(false);
            }
        });
        lblAboutUs.setFont(new Font("Chilanka", Font.BOLD, 13));
        lblAboutUs.setForeground(Color.WHITE);
        lblAboutUs.setBounds(36, 363, 139, 23);
        panel.add(lblAboutUs);

        JLabel lblNewOfficer = new JLabel("* New officer Registration");
        lblNewOfficer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                NewOfficerRegistration.main(null);
                frmCrimeInvestigationhome.setVisible(false);
            }
        });
        lblNewOfficer.setFont(new Font("Chilanka", Font.BOLD, 13));
        lblNewOfficer.setForeground(Color.WHITE);
        lblNewOfficer.setBounds(36, 276, 209, 28);
        panel.add(lblNewOfficer);

        JButton lblLogOut = new JButton("Log out");
        lblLogOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StationLogin.main(null);
                JOptionPane.showMessageDialog(frmCrimeInvestigationhome, "Successfully Logged Out.");
                frmCrimeInvestigationhome.setVisible(false);
            }
        });
        lblLogOut.setToolTipText("Back to Police login?");
        lblLogOut.setFont(new Font("Chilanka", Font.BOLD, 13));
        lblLogOut.setForeground(Color.BLACK);
        lblLogOut.setBounds(1266, 12, 70, 15);
        frmCrimeInvestigationhome.getContentPane().add(lblLogOut);

        JLabel lblWelcomeUserCrime = new JLabel("Welcome! User to Police Record Management System.");
        lblWelcomeUserCrime.setBackground(new Color(60, 179, 113));
        lblWelcomeUserCrime.setFont(new Font("Chilanka", Font.BOLD, 14));
        lblWelcomeUserCrime.setForeground(Color.BLACK);
        lblWelcomeUserCrime.setBounds(371, 85, 500, 33);
        frmCrimeInvestigationhome.getContentPane().add(lblWelcomeUserCrime);

        frmCrimeInvestigationhome.setTitle("Home");
        frmCrimeInvestigationhome.setBounds(100, 100, 1348, 425);
        frmCrimeInvestigationhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel lblNewLabel_2 = new JLabel();
        Image im = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/resources/home.png"))).getImage();
        lblNewLabel_2.setIcon(new ImageIcon(im));
        lblNewLabel_2.setBounds(550, 200, 500, 500);
        assert frmCrimeInvestigationhome != null;
        frmCrimeInvestigationhome.getContentPane().add(lblNewLabel_2);

    }
}
