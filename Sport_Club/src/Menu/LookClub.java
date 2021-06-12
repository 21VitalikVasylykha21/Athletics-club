package Menu;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitalik
 */
public class LookClub extends javax.swing.JInternalFrame {

    mySQL SQL = null;
    javax.swing.JDesktopPane Fon;

    /**
     * Creates new form LookClub
     */
    public LookClub(javax.swing.JDesktopPane fon) {
        initComponents();
        Load();
        Fon = fon;
        if (MainMenu.jMenuItem2.getText().equals("Вийти")) {
            Admin();
        }
    }

    private void Admin() {
        BtnAdd.setEnabled(true);
        BtnEdit.setEnabled(true);
        BtnRemove.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTableRezult = new javax.swing.JTable() {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        jTableRezult.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClub = new javax.swing.JTable() {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        jTableRezult.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTableRezult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTableRezult);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Результати:");

        jTableClub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClubMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClub);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Операції", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        BtnAdd.setEnabled(false);
        BtnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAdd.setText("Додати");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnEdit.setEnabled(false);
        BtnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEdit.setText("Редагувати");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnRemove.setEnabled(false);
        BtnRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnRemove.setText("Видалити");
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(BtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnEdit)
                    .addComponent(BtnRemove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClubMouseClicked
        int X;
        X = jTableClub.getSelectedRow();
        if (X < 0) {
            return;
        }
        X = (int) Integer.valueOf((String) jTableClub.getValueAt(X, 7));
        LoadRezult(X);
    }//GEN-LAST:event_jTableClubMouseClicked

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        int X = jTableClub.getSelectedRow();
        AddClub d = new AddClub(Fon);
        d.setVisible(true);
        try {
            d.Edit((int) Integer.valueOf((String) jTableClub.getValueAt(X, 0)), (String) jTableClub.getValueAt(X, 1),
                    (String) jTableClub.getValueAt(X, 2), (String) jTableClub.getValueAt(X, 3),
                    (String) jTableClub.getValueAt(X, 4), (String) jTableClub.getValueAt(X, 5),
                    (String) jTableClub.getValueAt(X, 6), (String) jTableClub.getValueAt(X, 7));
        } catch (ParseException ex) {
            Logger.getLogger(LookClub.class.getName()).log(Level.SEVERE, null, ex);
        }
        Fon.add(d);
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        this.dispose();
        AddClub d = new AddClub(Fon);
        d.setVisible(true);
        Fon.add(d);
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
         this.dispose();
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_club"
        );
        String rez = SQL.Conect();
        if (rez.equals("Ok")) {
            int X = jTableClub.getSelectedRow();
            if (X < 0) {
                return;
            }

            X = (int) Integer.valueOf((String) jTableClub.getValueAt(X, 0));
            SQL.del(X, "id_club");
            LookClub d = new LookClub(Fon);
            d.setVisible(true);
            Fon.add(d);
        }
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void Load() {
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_club"
        );

        String rez = SQL.Conect();
        int i = 0, ii = 1;
        if (rez.equals("Ok")) {

            //заповнюємо таблицю
            ResultSet X = SQL.GetDataSet();
            try {
                ResultSetMetaData colonki = X.getMetaData();
                i = colonki.getColumnCount();//к-ть колонок
                javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel();
                //dtm.setColumnCount(i);//
                String nazvaKolonki[] = new String[i];
                nazvaKolonki[0] = "Номер в програмі";
                nazvaKolonki[1] = "Назва";
                nazvaKolonki[2] = "День";
                nazvaKolonki[3] = "Місце";
                nazvaKolonki[4] = "Дистанції";
                nazvaKolonki[5] = "Учасники";
                nazvaKolonki[6] = "Судді";
                nazvaKolonki[7] = "Номер результату";

                dtm.setColumnIdentifiers(nazvaKolonki);
                dtm.setRowCount(0);//
                while (X.next()) {
                    dtm.setRowCount(dtm.getRowCount() + 1);
                    for (int j = 1; j <= i; j++) {
                        String g = X.getString(j);
                        dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                    }
                    ii++;
                }
                jTableClub.setModel(dtm);
            } catch (Exception ex) {
                //error
            }
        }
    }

    private void LoadRezult(int id) {
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_rezults"
        );

        String rez = SQL.Conect();
        int i = 0, ii = 1;
        if (rez.equals("Ok")) {

            //заповнюємо таблицю
            ResultSet X = SQL.GetDataSearch("`id_club_rezults` = " + id);
            try {
                ResultSetMetaData colonki = X.getMetaData();
                i = colonki.getColumnCount();//к-ть колонок
                javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel();
                String nazvaKolonki[] = new String[i];
                nazvaKolonki[0] = "Номер в програмі";
                nazvaKolonki[1] = "Номер змагань";
                nazvaKolonki[2] = "ПІБ Спортсмена";
                nazvaKolonki[3] = "ПІБ тренера";
                nazvaKolonki[4] = "Дистанція";
                nazvaKolonki[5] = "Позиція яку зайняв";
                nazvaKolonki[6] = "Час";
                nazvaKolonki[7] = "Фото";

                dtm.setColumnIdentifiers(nazvaKolonki);
                dtm.setRowCount(0);//
                while (X.next()) {
                    dtm.setRowCount(dtm.getRowCount() + 1);
                    for (int j = 1; j <= i; j++) {
                        String g = X.getString(j);
                        if (j == 3) {
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
                                dtm.setValueAt(SQL.GetSearch("name_athlete", "`id_athlete` = " + g), ii - 1, j - 1);
                            }
                            continue;
                        }
                        if (j == 4) {
                            SQL = new mySQL(
                                    "127.0.0.1",
                                    "3306",
                                    "athlethic_base_club_data",
                                    "root",
                                    "",
                                    "tbl_coach"
                            );
                            rez = SQL.Conect();
                            if (rez.equals("Ok")) {
                                dtm.setValueAt(SQL.GetSearch("name_coach", "`id_coach` = " + g), ii - 1, j - 1);
                            }
                            continue;
                        }
                        if (j == 5) {
                            SQL = new mySQL(
                                    "127.0.0.1",
                                    "3306",
                                    "athlethic_base_club_data",
                                    "root",
                                    "",
                                    "tbl_distances"
                            );
                            rez = SQL.Conect();
                            if (rez.equals("Ok")) {
                                dtm.setValueAt(SQL.GetSearch("distances", "`id_distances` = " + g), ii - 1, j - 1);
                            }
                            continue;
                        }
                        dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                    }
                    ii++;
                }
                jTableRezult.setModel(dtm);
                jTableRezult.setRowHeight(100);
                jTableRezult.getColumn("Фото").setCellRenderer(new CellRenderer());

            } catch (Exception ex) {
                System.err.println(ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableClub;
    private javax.swing.JTable jTableRezult;
    // End of variables declaration//GEN-END:variables
}
