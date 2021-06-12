/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Vitalik
 */
public class AddAthlete extends javax.swing.JInternalFrame {

    mySQL SQL = null;
    javax.swing.JDesktopPane Fon;
    int ID;

    /**
     * Creates new form AddAthlete
     * @param fon
     */
    public AddAthlete(javax.swing.JDesktopPane fon) {
        initComponents();
        AddInComboBox("tbl_category", "name_categorys", ComboBoxCategory);
        AddInComboBox("tbl_coach", "name_coach", ComboBoxCoach);
        Fon = fon;
        DateChooserBirth.getJCalendar().setPreferredSize(new Dimension(350, 200)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        DateChooserBirth = new com.toedter.calendar.JDateChooser();
        ComboBoxCategory = new javax.swing.JComboBox<>();
        txtResidence = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtImage = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        ComboBoxCoach = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Фото");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Телефон");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Місце проживання");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Розряд");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("День народження");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ім'я ");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ComboBoxCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtResidence.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelephone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BtnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAdd.setText("Додати");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCancel.setText("Відминити");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        ComboBoxCoach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Тренер");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Вибрати фото");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(DateChooserBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelephone)
                            .addComponent(txtResidence, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(82, 82, 82)
                        .addComponent(ComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(82, 82, 82)
                        .addComponent(ComboBoxCoach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateChooserBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxCoach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancel)
                    .addComponent(BtnAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        if (txtName.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (txtResidence.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (txtTelephone.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        }else if (txtImage.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
            try {
                sdt.format(DateChooserBirth.getDate());
            } catch (Exception ex) {
               javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
            }

            String Name = txtName.getText();
            String Residence = txtResidence.getText();
            String Telephone = txtTelephone.getText();
            String Image = txtImage.getText();
            String id_category = "1";
            String id_coach =  ComboBoxCoach.getSelectedItem().toString();
            
            SQL = new mySQL(
                    "127.0.0.1",
                    "3306",
                    "athlethic_base_club_data",
                    "root",
                    "",
                    "tbl_coach"
            );
            String rez = SQL.Conect();
            if (rez.equals("Ok")) {
                id_coach = SQL.GetSearch("id_coach", "`name_coach` LIKE '" +  ComboBoxCoach.getSelectedItem().toString() + "'");
            }
            
            
            SQL = new mySQL(
                    "127.0.0.1",
                    "3306",
                    "athlethic_base_club_data",
                    "root",
                    "",
                    "tbl_category"
            );
            rez = SQL.Conect();
            if (rez.equals("Ok")) {
                id_category = SQL.GetSearch("id_categorys", "`name_categorys` LIKE '" +  ComboBoxCategory.getSelectedItem().toString() + "'");
            }

            SQL = new mySQL(
                    "127.0.0.1",
                    "3306",
                    "athlethic_base_club_data",
                    "root",
                    "",
                    "tbl_athlete"
            );
            rez = SQL.Conect();
            if (rez.equals("Ok")) {
                if (BtnAdd.getText().equals("Додати")) {
                    SQL.Add(Name, sdt.format(DateChooserBirth.getDate()), id_category, id_coach, Residence, Telephone, Image);
                }else{
                    SQL.Edit(ID, Name, sdt.format(DateChooserBirth.getDate()), id_category, id_coach, Residence, Telephone, Image);
                }
            }
            this.dispose();
            Look d = new Look(Fon,"Атлети","tbl_athlete", "Номер атлета","ПІБ","День народження","Розряд","Тренер","Місце проживання","Телефон","Фото");
            d.setVisible(true);
            Fon.add(d);
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Вибір фотографії");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(fnef);
        fileChooser.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
        fileChooser.setBounds(0, 0, 100, 100);
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            txtImage.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    final void AddInComboBox(String tbl, String NameColumn, javax.swing.JComboBox<String> ComboBox) {
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                tbl
        );
        String rez = SQL.Conect();
        if (rez.equals("Ok")) {
            SQL.GetInfoInComboBox(NameColumn, ComboBox);
        } else {
            ComboBox.removeAll();
            ComboBox.addItem(rez);
        }
    }
    
    public void Edit(int id, String name, String day, String id_category, String id_coach, String residence, String telephone, String photo) throws ParseException{
        BtnAdd.setText("Редагувати");
        txtName.setText(name);
        txtResidence.setText(residence);
        txtTelephone.setText(telephone);
        txtImage.setText(photo);
        ComboBoxCategory.setSelectedItem(id_category);
        ComboBoxCoach.setSelectedItem(id_coach);
        java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(day);
        DateChooserBirth.setDate(date);
        ID = id;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JComboBox<String> ComboBoxCategory;
    private javax.swing.JComboBox<String> ComboBoxCoach;
    private com.toedter.calendar.JDateChooser DateChooserBirth;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtResidence;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}