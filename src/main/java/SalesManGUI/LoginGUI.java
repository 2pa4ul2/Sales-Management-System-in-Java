
package SalesManGUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginColoredpanel = new javax.swing.JPanel();
        LoginContainerPanel = new javax.swing.JPanel();
        UserNameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        GreetingsLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        LoginMessage2 = new javax.swing.JLabel();
        LoginMessage1 = new javax.swing.JLabel();
        LoginMessage3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 720));
        setMinimumSize(new java.awt.Dimension(1100, 720));
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 720));

        LoginColoredpanel.setBackground(new java.awt.Color(99, 135, 242));

        LoginContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        UserNameField.setName(""); // NOI18N
        UserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFieldActionPerformed(evt);
            }
        });

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        PasswordLabel.setText("Password");

        GreetingsLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        GreetingsLabel.setText("Welcome to Sellify!");

        LoginButton.setBackground(new java.awt.Color(99, 135, 242));
        LoginButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterButton.setBackground(new java.awt.Color(255, 255, 248));
        RegisterButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(102, 153, 255));
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginContainerPanelLayout = new javax.swing.GroupLayout(LoginContainerPanel);
        LoginContainerPanel.setLayout(LoginContainerPanelLayout);
        LoginContainerPanelLayout.setHorizontalGroup(
            LoginContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginContainerPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(LoginContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GreetingsLabel)
                    .addGroup(LoginContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UsernameLabel)
                        .addComponent(PasswordField)
                        .addComponent(UserNameField)
                        .addComponent(PasswordLabel)
                        .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        LoginContainerPanelLayout.setVerticalGroup(
            LoginContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginContainerPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(GreetingsLabel)
                .addGap(33, 33, 33)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        LoginMessage2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        LoginMessage2.setForeground(new java.awt.Color(255, 255, 255));
        LoginMessage2.setText("journey with us.");

        LoginMessage1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        LoginMessage1.setForeground(new java.awt.Color(255, 255, 255));
        LoginMessage1.setText("Start your");

        LoginMessage3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        LoginMessage3.setForeground(new java.awt.Color(255, 255, 255));
        LoginMessage3.setText("Create an account and Join our Community");

        javax.swing.GroupLayout LoginColoredpanelLayout = new javax.swing.GroupLayout(LoginColoredpanel);
        LoginColoredpanel.setLayout(LoginColoredpanelLayout);
        LoginColoredpanelLayout.setHorizontalGroup(
            LoginColoredpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginColoredpanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(LoginColoredpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginMessage2)
                    .addComponent(LoginMessage1)
                    .addComponent(LoginMessage3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(LoginContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LoginColoredpanelLayout.setVerticalGroup(
            LoginColoredpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginColoredpanelLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(LoginMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginMessage2)
                .addGap(18, 18, 18)
                .addComponent(LoginMessage3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginColoredpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginColoredpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
     RegisterGUI registerGUI = new RegisterGUI(); // Create an instance of the RegisterGUI class
        registerGUI.setVisible(true); // Set the RegisterGUI frame visible
        dispose(); 
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    String username = UserNameField.getText();
    String password = new String(PasswordField.getPassword());

    if (isLoginValid(username, password)) {
        // Redirect to the DashboardGUI class or perform any other actions
        DashboardGUI dashboard = new DashboardGUI();
        dashboard.setVisible(true);
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(null, "Invalid username or password");
    }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFieldActionPerformed
    
    }//GEN-LAST:event_UserNameFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
    
    }//GEN-LAST:event_PasswordFieldActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    private boolean isLoginValid(String username, String password) {
    // Read the registration file and check if the login credentials match
    try (BufferedReader reader = new BufferedReader(new FileReader("registration.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Username: " + username)) {
                line = reader.readLine();
                if (line.startsWith("Password: " + password)) {
                    return true;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error reading registration file: " + e.getMessage());
    }

    return false;
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GreetingsLabel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginColoredpanel;
    private javax.swing.JPanel LoginContainerPanel;
    private javax.swing.JLabel LoginMessage1;
    private javax.swing.JLabel LoginMessage2;
    private javax.swing.JLabel LoginMessage3;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel UsernameLabel;
    // End of variables declaration//GEN-END:variables

}