
package SalesManGUI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegisterGUI extends javax.swing.JFrame {

   
    public RegisterGUI() {
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
        RegisterButton1 = new javax.swing.JButton();
        LastNameField = new javax.swing.JTextField();
        UsernameLabel2 = new javax.swing.JLabel();
        UsernameLabel3 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 720));

        LoginColoredpanel.setBackground(new java.awt.Color(99, 135, 242));

        LoginContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        UserNameField.setBackground(new java.awt.Color(255, 255, 254));
        UserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFieldActionPerformed(evt);
            }
        });

        PasswordField.setBackground(new java.awt.Color(255, 255, 254));
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

        RegisterButton1.setBackground(new java.awt.Color(255, 255, 254));
        RegisterButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        RegisterButton1.setForeground(new java.awt.Color(102, 153, 255));
        RegisterButton1.setText("Register");
        RegisterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButton1ActionPerformed(evt);
            }
        });

        LastNameField.setBackground(new java.awt.Color(255, 255, 254));
        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });

        UsernameLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        UsernameLabel2.setText("Last Name");

        UsernameLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        UsernameLabel3.setText("First Name");

        FirstNameField.setBackground(new java.awt.Color(255, 255, 254));
        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginContainerPanelLayout = new javax.swing.GroupLayout(LoginContainerPanel);
        LoginContainerPanel.setLayout(LoginContainerPanelLayout);
        LoginContainerPanelLayout.setHorizontalGroup(
            LoginContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginContainerPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(LoginContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UsernameLabel3)
                    .addComponent(UsernameLabel2)
                    .addComponent(RegisterButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(UsernameLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(UserNameField)
                    .addComponent(PasswordLabel)
                    .addComponent(LastNameField)
                    .addComponent(GreetingsLabel)
                    .addComponent(FirstNameField))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        LoginContainerPanelLayout.setVerticalGroup(
            LoginContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginContainerPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(GreetingsLabel)
                .addGap(18, 18, 18)
                .addComponent(UsernameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsernameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(RegisterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("journey with us.");

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Start your");

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Create an account and Join our Community");

        javax.swing.GroupLayout LoginColoredpanelLayout = new javax.swing.GroupLayout(LoginColoredpanel);
        LoginColoredpanel.setLayout(LoginColoredpanelLayout);
        LoginColoredpanelLayout.setHorizontalGroup(
            LoginColoredpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginColoredpanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(LoginColoredpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(LoginContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LoginColoredpanelLayout.setVerticalGroup(
            LoginColoredpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginColoredpanelLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
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

    private void UserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameFieldActionPerformed

    private void RegisterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButton1ActionPerformed
    String firstName = FirstNameField.getText();
    String lastName = LastNameField.getText();
    String username = UserNameField.getText();
    String password = new String(PasswordField.getPassword());
    
      if (isAccountRegistered(username)) {
        JOptionPane.showMessageDialog(null, "Account already registered");
        return;
    }
    try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("registration.txt", true))) {
                writer.write(firstName);
                writer.newLine();
                writer.write(lastName);
                writer.newLine();
                writer.write(username);
                writer.newLine();
                writer.write(password);
                writer.newLine();
            }
        JOptionPane.showMessageDialog(null,"Registration information saved to file");
        setVisible(false);
        LoginGUI logingui = new LoginGUI(); // Create an instance of the RegisterGUI class
        logingui.setVisible(true); // Set the RegisterGUI frame visible
        dispose(); 
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error saving registration information to file: " + e.getMessage());
    }
    }//GEN-LAST:event_RegisterButton1ActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

      
    private boolean isAccountRegistered(String username) {
    Path filePath = Paths.get("registration.txt");
    try {
        // Read the contents of the file
        String fileContents = new String(Files.readAllBytes(filePath));
        
        // Check if the username exists in the file
        return fileContents.contains("Username: " + username);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error reading registration file: " + e.getMessage());
        return false;
    }
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel GreetingsLabel;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JPanel LoginColoredpanel;
    private javax.swing.JPanel LoginContainerPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton1;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernameLabel2;
    private javax.swing.JLabel UsernameLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}