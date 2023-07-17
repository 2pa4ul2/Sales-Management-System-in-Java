
package SalesManGUI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class AddProductGUI extends javax.swing.JFrame {

  
    public AddProductGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonContainerSlide = new javax.swing.JPanel();
        DeleteProductButton = new javax.swing.JButton();
        AddButton22 = new javax.swing.JButton();
        ProductListButton = new javax.swing.JButton();
        UpdateListButton = new javax.swing.JButton();
        AddButton23 = new javax.swing.JButton();
        UpperPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ProductNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BrandField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BrowseImage = new javax.swing.JButton();
        CategoryField = new javax.swing.JComboBox<>();
        ConfirmAddButton = new javax.swing.JButton();
        CancelAddButton = new javax.swing.JButton();
        QuantityField = new javax.swing.JTextField();
        SoldField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 720));
        setMinimumSize(new java.awt.Dimension(1100, 720));

        ButtonContainerSlide.setBackground(new java.awt.Color(99, 135, 242));

        DeleteProductButton.setBackground(new java.awt.Color(99, 135, 242));
        DeleteProductButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        DeleteProductButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteProductButton.setBorder(null);
        DeleteProductButton.setLabel("Delete Product");
        DeleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductButtonActionPerformed(evt);
            }
        });

        AddButton22.setBackground(new java.awt.Color(73, 115, 242));
        AddButton22.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        AddButton22.setForeground(new java.awt.Color(255, 255, 255));
        AddButton22.setBorder(null);
        AddButton22.setLabel("Add Product");
        AddButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton22AddButton2ActionPerformed(evt);
            }
        });

        ProductListButton.setBackground(new java.awt.Color(99, 135, 242));
        ProductListButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ProductListButton.setForeground(new java.awt.Color(255, 255, 255));
        ProductListButton.setBorder(null);
        ProductListButton.setLabel("Product List");
        ProductListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductListButtonActionPerformed(evt);
            }
        });

        UpdateListButton.setBackground(new java.awt.Color(99, 135, 242));
        UpdateListButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        UpdateListButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateListButton.setBorder(null);
        UpdateListButton.setLabel("Update Product");
        UpdateListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateListButtonActionPerformed(evt);
            }
        });

        AddButton23.setBackground(new java.awt.Color(99, 135, 242));
        AddButton23.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        AddButton23.setForeground(new java.awt.Color(255, 255, 255));
        AddButton23.setBorder(null);
        AddButton23.setLabel("Dashboard");
        AddButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton23AddButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonContainerSlideLayout = new javax.swing.GroupLayout(ButtonContainerSlide);
        ButtonContainerSlide.setLayout(ButtonContainerSlideLayout);
        ButtonContainerSlideLayout.setHorizontalGroup(
            ButtonContainerSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateListButton, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addComponent(ProductListButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DeleteProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addComponent(AddButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        ButtonContainerSlideLayout.setVerticalGroup(
            ButtonContainerSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainerSlideLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(AddButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(AddButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ProductListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(UpdateListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(DeleteProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UpperPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jLabel1.setText("Add Product");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ProductNameField.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ProductNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel2.setText("Product Name:");

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel3.setText("Price:");

        PriceField.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel4.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel5.setText("Category:");

        BrandField.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        BrandField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel6.setText("Brand:");

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel8.setText("Upload Image");

        BrowseImage.setBackground(new java.awt.Color(99, 135, 242));
        BrowseImage.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        BrowseImage.setForeground(new java.awt.Color(255, 255, 255));
        BrowseImage.setLabel("Browse Image");
        BrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseImageActionPerformed(evt);
            }
        });

        CategoryField.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        CategoryField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stringed", "Keyboard", "Electric", "Percussion" }));
        CategoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryFieldActionPerformed(evt);
            }
        });

        ConfirmAddButton.setBackground(new java.awt.Color(99, 135, 242));
        ConfirmAddButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ConfirmAddButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmAddButton.setLabel("Add");
        ConfirmAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmAddButtonActionPerformed(evt);
            }
        });

        CancelAddButton.setBackground(new java.awt.Color(255, 255, 254));
        CancelAddButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        CancelAddButton.setForeground(new java.awt.Color(242, 69, 67));
        CancelAddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 69, 67)));
        CancelAddButton.setLabel("Cancel");
        CancelAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAddButtonActionPerformed(evt);
            }
        });

        QuantityField.setBackground(new java.awt.Color(255, 255, 254));
        QuantityField.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        QuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityFieldActionPerformed(evt);
            }
        });

        SoldField.setBackground(new java.awt.Color(255, 255, 254));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel7.setText("Sold:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(BrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CancelAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(ConfirmAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(ProductNameField)
                            .addComponent(CategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(BrandField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(QuantityField)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoldField))
                        .addGap(128, 128, 128))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrandField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoldField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(BrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ButtonContainerSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(ButtonContainerSlide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButton22AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton22AddButton2ActionPerformed
         AddProductGUI addproductGUI = new AddProductGUI();
        addproductGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_AddButton22AddButton2ActionPerformed

    private void BrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
            String selectedImagePath = fileChooser.getSelectedFile().getAbsolutePath();
        }
    }//GEN-LAST:event_BrowseImageActionPerformed

    private void ProductNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameFieldActionPerformed
        
    }//GEN-LAST:event_ProductNameFieldActionPerformed

    private void CategoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryFieldActionPerformed
          
    }//GEN-LAST:event_CategoryFieldActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
         
    }//GEN-LAST:event_PriceFieldActionPerformed

    private void BrandFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandFieldActionPerformed
       
    }//GEN-LAST:event_BrandFieldActionPerformed

    private void ConfirmAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmAddButtonActionPerformed
        String productName = ProductNameField.getText();
        String brand = BrandField.getText();
        String price = PriceField.getText();
        String category = CategoryField.getSelectedItem().toString();
        String sold = SoldField.getText();
    try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Product.txt",true))) {
                writer.write(productName +", ");
                writer.write(brand+", ");
                writer.write(price+", ");
                writer.write(category+", ");
                writer.write(sold+", ");
                writer.newLine();
            }
    JOptionPane.showMessageDialog(null,"Product saved to file");
        setVisible(false);
        DashboardGUI dashboardgui = new DashboardGUI();
        dashboardgui.setVisible(true);
        dispose();
    }catch (IOException e) {
        System.err.println("Error saving product name to file: " + e.getMessage());
    }
    }//GEN-LAST:event_ConfirmAddButtonActionPerformed

    private void CancelAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAddButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelAddButtonActionPerformed

    private void ProductListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductListButtonActionPerformed

    private void UpdateListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateListButtonActionPerformed

    private void DeleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteProductButtonActionPerformed

    private void AddButton23AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton23AddButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButton23AddButton2ActionPerformed

    private void QuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityFieldActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton22;
    private javax.swing.JButton AddButton23;
    private javax.swing.JTextField BrandField;
    private javax.swing.JButton BrowseImage;
    private javax.swing.JPanel ButtonContainerSlide;
    private javax.swing.JButton CancelAddButton;
    private javax.swing.JComboBox<String> CategoryField;
    private javax.swing.JButton ConfirmAddButton;
    private javax.swing.JButton DeleteProductButton;
    private javax.swing.JTextField PriceField;
    private javax.swing.JButton ProductListButton;
    private javax.swing.JTextField ProductNameField;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JTextField SoldField;
    private javax.swing.JButton UpdateListButton;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
