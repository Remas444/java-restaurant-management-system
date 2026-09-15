

import javax.swing.JOptionPane;


public class CreatingMenu extends javax.swing.JFrame {

    
    public CreatingMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        pizzaName = new javax.swing.JTextField();
        pizzaPrice = new javax.swing.JTextField();
        drinkName = new javax.swing.JTextField();
        drinkPrice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        drinkType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("Creating Menu");

        jLabel2.setText("Name:");

        jLabel3.setText("Price:");

        jLabel4.setText("Name:");

        jLabel5.setText("Price:");

        jLabel6.setText("Type:");

        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Pizza");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Drink");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        pizzaName.setEnabled(false);
        pizzaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaNameActionPerformed(evt);
            }
        });

        pizzaPrice.setEnabled(false);

        drinkName.setEnabled(false);

        drinkPrice.setEnabled(false);

        jButton2.setText("Finish add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        drinkType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "smoothie", "Soft drink", "Juice" }));
        drinkType.setEnabled(false);
        drinkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pizzaName)
                                            .addComponent(pizzaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(drinkType, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(drinkName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(drinkPrice))
                                        .addGap(471, 471, 471)))))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pizzaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pizzaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jRadioButton2)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(drinkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drinkType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Add item to menu

if(jRadioButton1.isSelected()==true)
        {
        String Pizzaname, Pizzaprice;
        Pizzaname=pizzaName.getText();
        Pizzaprice=pizzaPrice.getText();
        
        double price=0;
        try{
            
            price=Double.parseDouble(Pizzaprice);
        }catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(this,"Invalid format ,please try again!!");
            pizzaPrice.setText("");
           return; 
        }
        
        
           menuItem pizza = new Pizza(Pizzaname,price);
           
         if(  CreateRestaurant.restaurant.addItem(pizza)==true)
         {
             JOptionPane.showMessageDialog(this,"Pizza is added successfully!!");
             pizzaName.setText("");
             pizzaPrice.setText("");
         }
         else
         {
              JOptionPane.showMessageDialog(this,"Pizza cannot be added!!");
               pizzaName.setText("");
             pizzaPrice.setText("");
         }
         
         
         
        }




if(jRadioButton2.isSelected()==true)
        {
        String Drinkname="", Drinkprice="";
        
        
        
        Drinkname=drinkName.getText();
        Drinkprice=drinkPrice.getText();
        
        double price=0;
        try{
            
            price=Double.parseDouble(Drinkprice);
        }catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(this,"Invalid format ,please try again!!");
            drinkPrice.setText("");
           return; 
        }
        
        
        
         menuItem  drink = new Drink(Drinkname,price,drinkType.getSelectedItem().toString());
        
           
         if(  CreateRestaurant.restaurant.addItem(drink))
         {
             JOptionPane.showMessageDialog(this,"Drink is added successfully!!");
             drinkName.setText("");
             drinkPrice.setText("");
             
         }
         else
         {
            JOptionPane.showMessageDialog(this,"Drink cannot be added!!");
               drinkName.setText("");
             drinkPrice.setText(""); 
             
         }
         
         
           
           
           
          
        }

if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false)
{
  JOptionPane.showMessageDialog(this,"You must select pizza or drink button!!"); 
  return;
}





        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // pizza
        if(jRadioButton1.isSelected()==true)
        {
            pizzaName.setEnabled(true);
            pizzaPrice.setEnabled(true);
            drinkName.setEnabled(false);
            drinkPrice.setEnabled(false);
            drinkType.setEnabled(false); 
            drinkPrice.setText("");
            drinkName.setText("");
         
        }
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // Drink
        
        if(jRadioButton2.isSelected()==true)
        {
            
            drinkName.setEnabled(true);
            drinkPrice.setEnabled(true);
            
            drinkType.setEnabled(true);
            pizzaName.setEnabled(false);
            pizzaPrice.setEnabled(false);
            pizzaPrice.setText("");
            pizzaName.setText("");
        }
        
        
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void pizzaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaNameActionPerformed
        
    }//GEN-LAST:event_pizzaNameActionPerformed

    private void drinkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkTypeActionPerformed
      
        
    }//GEN-LAST:event_drinkTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Finish adding items
        
        if(CreateRestaurant.restaurant.getNumItems()!=0)
        {
        RestaurantOrderes orderFrame = new RestaurantOrderes();
        orderFrame.setVisible(true);
            
        }
        else
        
            JOptionPane.showMessageDialog(this,"You must add at least one item to the menu !! ");
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatingMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JTextField drinkName;
    public javax.swing.JTextField drinkPrice;
    private javax.swing.JComboBox<String> drinkType;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JTextField pizzaName;
    public javax.swing.JTextField pizzaPrice;
    // End of variables declaration//GEN-END:variables
}
