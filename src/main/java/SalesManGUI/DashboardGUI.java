package SalesManGUI;


public class DashboardGUI extends javax.swing.JFrame {

  
    public DashboardGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ButtonContainerSlide = new javax.swing.JPanel();
        DeleteProductButton = new javax.swing.JButton();
        AddButton22 = new javax.swing.JButton();
        ProductListButton = new javax.swing.JButton();
        UpdateListButton = new javax.swing.JButton();
        AddButton23 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        UpperPanel = new javax.swing.JPanel();
        ProfilePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelDisplay1 = new javax.swing.JPanel();
        PanelDisplay1Num = new javax.swing.JLabel();
        PanelDisplay2 = new javax.swing.JPanel();
        PanelDisplay2Num = new javax.swing.JLabel();
        PanelDisplay3 = new javax.swing.JPanel();
        PanelDisplay3Num = new javax.swing.JLabel();
        PanelDisplayBottom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 247, 251));
        setMaximumSize(new java.awt.Dimension(1100, 720));
        setMinimumSize(new java.awt.Dimension(1100, 720));

        ButtonContainerSlide.setBackground(new java.awt.Color(99, 135, 242));

        DeleteProductButton.setBackground(new java.awt.Color(99, 135, 242));
        DeleteProductButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        DeleteProductButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteProductButton.setBorder(null);
        DeleteProductButton.setLabel("Delete Product");

        AddButton22.setBackground(new java.awt.Color(99, 135, 242));
        AddButton22.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        AddButton22.setForeground(new java.awt.Color(255, 255, 255));
        AddButton22.setBorder(null);
        AddButton22.setLabel("Add Product");
        AddButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        ProductListButton.setBackground(new java.awt.Color(99, 135, 242));
        ProductListButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ProductListButton.setForeground(new java.awt.Color(255, 255, 255));
        ProductListButton.setBorder(null);
        ProductListButton.setLabel("Product List");

        UpdateListButton.setBackground(new java.awt.Color(99, 135, 242));
        UpdateListButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        UpdateListButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateListButton.setBorder(null);
        UpdateListButton.setLabel("Update Product");

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

        jPanel2.setBackground(new java.awt.Color(245, 247, 251));

        UpperPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setText("Admin");

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpperPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGroup(UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpperPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UpperPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        PanelDisplay1.setBackground(new java.awt.Color(255, 255, 255));

        PanelDisplay1Num.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        PanelDisplay1Num.setText("10");

        javax.swing.GroupLayout PanelDisplay1Layout = new javax.swing.GroupLayout(PanelDisplay1);
        PanelDisplay1.setLayout(PanelDisplay1Layout);
        PanelDisplay1Layout.setHorizontalGroup(
            PanelDisplay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDisplay1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(PanelDisplay1Num)
                .addGap(102, 102, 102))
        );
        PanelDisplay1Layout.setVerticalGroup(
            PanelDisplay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDisplay1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDisplay1Num)
                .addGap(42, 42, 42))
        );

        PanelDisplay2.setBackground(new java.awt.Color(255, 255, 255));

        PanelDisplay2Num.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        PanelDisplay2Num.setText("10");

        javax.swing.GroupLayout PanelDisplay2Layout = new javax.swing.GroupLayout(PanelDisplay2);
        PanelDisplay2.setLayout(PanelDisplay2Layout);
        PanelDisplay2Layout.setHorizontalGroup(
            PanelDisplay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDisplay2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(PanelDisplay2Num)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        PanelDisplay2Layout.setVerticalGroup(
            PanelDisplay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDisplay2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(PanelDisplay2Num)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDisplay3.setBackground(new java.awt.Color(255, 255, 255));

        PanelDisplay3Num.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        PanelDisplay3Num.setText("10");

        javax.swing.GroupLayout PanelDisplay3Layout = new javax.swing.GroupLayout(PanelDisplay3);
        PanelDisplay3.setLayout(PanelDisplay3Layout);
        PanelDisplay3Layout.setHorizontalGroup(
            PanelDisplay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDisplay3Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(PanelDisplay3Num)
                .addGap(93, 93, 93))
        );
        PanelDisplay3Layout.setVerticalGroup(
            PanelDisplay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDisplay3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(PanelDisplay3Num)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        PanelDisplayBottom.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDisplayBottomLayout = new javax.swing.GroupLayout(PanelDisplayBottom);
        PanelDisplayBottom.setLayout(PanelDisplayBottomLayout);
        PanelDisplayBottomLayout.setHorizontalGroup(
            PanelDisplayBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        PanelDisplayBottomLayout.setVerticalGroup(
            PanelDisplayBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jLabel1.setText("Overview");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PanelDisplayBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PanelDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(PanelDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(PanelDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelDisplay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDisplay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(PanelDisplayBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ButtonContainerSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonContainerSlide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        AddProductGUI addproductGUI = new AddProductGUI();
        addproductGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_AddButton2ActionPerformed

    private void AddButton23AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton23AddButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButton23AddButton2ActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton22;
    private javax.swing.JButton AddButton23;
    private javax.swing.JPanel ButtonContainerSlide;
    private javax.swing.JButton DeleteProductButton;
    private javax.swing.JPanel PanelDisplay1;
    private javax.swing.JLabel PanelDisplay1Num;
    private javax.swing.JPanel PanelDisplay2;
    private javax.swing.JLabel PanelDisplay2Num;
    private javax.swing.JPanel PanelDisplay3;
    private javax.swing.JLabel PanelDisplay3Num;
    private javax.swing.JPanel PanelDisplayBottom;
    private javax.swing.JButton ProductListButton;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JButton UpdateListButton;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
