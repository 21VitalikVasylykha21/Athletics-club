package Menu;

import javax.swing.ImageIcon;


/**
 *
 * @author Vitalik
 */
public class MainMenu extends javax.swing.JFrame {

    mySQL SQL = null;
    
    public MainMenu() {
        initComponents();
        ImageIcon img = new ImageIcon("Зовнішні файли\\Icon\\Logo.png");
        this.setIconImage(img.getImage());
        this.setTitle("Легкоатлетичний клуб");
        this.setLocationRelativeTo(null);
        StartConectChech();
    }

    private void StartConectChech(){
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_category"
        );

        String rez = SQL.Conect();
        if (rez.equals("Ok")) {
            javax.swing.JOptionPane.showMessageDialog(null,"Програма готова до використання, вдалої роботи","Увага!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Не вдалося підключитися до бази даних перевірте підключення","Помилка",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuOperacion = new javax.swing.JMenu();
        jMenuItemLookClub = new javax.swing.JMenuItem();
        jMenuItemLookCoach = new javax.swing.JMenuItem();
        jMenuItemLookAthlete = new javax.swing.JMenuItem();
        jMenuItemSearch = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuDictionary = new javax.swing.JMenu();
        jMenuItemCategory = new javax.swing.JMenuItem();
        jMenuItemRank = new javax.swing.JMenuItem();
        jMenuItemDistances = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("Athletics club");
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuFile.setText("Адміністрація");

        jMenuItem2.setText("Увійти як адмін");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItem2);

        jMenuBar1.add(jMenuFile);

        jMenuOperacion.setText("Дії");

        jMenuItemLookClub.setText("Клуб");
        jMenuItemLookClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLookClubActionPerformed(evt);
            }
        });
        jMenuOperacion.add(jMenuItemLookClub);

        jMenuItemLookCoach.setText("Тренери");
        jMenuItemLookCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLookCoachActionPerformed(evt);
            }
        });
        jMenuOperacion.add(jMenuItemLookCoach);

        jMenuItemLookAthlete.setText("Спорстмени");
        jMenuItemLookAthlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLookAthleteActionPerformed(evt);
            }
        });
        jMenuOperacion.add(jMenuItemLookAthlete);

        jMenuItemSearch.setText("Пошук");
        jMenuItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSearchActionPerformed(evt);
            }
        });
        jMenuOperacion.add(jMenuItemSearch);

        jMenuItemExit.setText("Вийти з програми");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuOperacion.add(jMenuItemExit);

        jMenuBar1.add(jMenuOperacion);

        jMenuDictionary.setText("Довідка");

        jMenuItemCategory.setText("Розряди");
        jMenuItemCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoryActionPerformed(evt);
            }
        });
        jMenuDictionary.add(jMenuItemCategory);

        jMenuItemRank.setText("Звання");
        jMenuItemRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRankActionPerformed(evt);
            }
        });
        jMenuDictionary.add(jMenuItemRank);

        jMenuItemDistances.setText("Дистанції");
        jMenuItemDistances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDistancesActionPerformed(evt);
            }
        });
        jMenuDictionary.add(jMenuItemDistances);

        jMenuBar1.add(jMenuDictionary);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoryActionPerformed
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_category"
        );

        String rez = SQL.Conect();
        Dovidka d = null;
        if (rez.equals("Ok")) {
            d = new Dovidka(SQL.GetInfo("name_categorys"), "Довідка: розряди");
            d.setVisible(true);
            jDesktopPane1.add(d);
        } else {
            d = new Dovidka(rez, "Довідка: розряди");
            d.setVisible(true);
            jDesktopPane1.add(d);
        }
    }//GEN-LAST:event_jMenuItemCategoryActionPerformed

    private void jMenuItemRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRankActionPerformed
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_rank"
        );

        String rez = SQL.Conect();
        Dovidka d = null;
        if (rez.equals("Ok")) {
            d = new Dovidka(SQL.GetInfo("name_ranks"), "Довідка: звання");
            d.setVisible(true);
            jDesktopPane1.add(d);
        } else {
            d = new Dovidka(rez, "Довідка: звання");
            d.setVisible(true);
            jDesktopPane1.add(d);
        }
    }//GEN-LAST:event_jMenuItemRankActionPerformed

    private void jMenuItemDistancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDistancesActionPerformed
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_distances"
        );

        String rez = SQL.Conect();
        Dovidka d = null;
        if (rez.equals("Ok")) {
            d = new Dovidka(SQL.GetInfo("distances"), "Довідка: дистанії");
            d.setVisible(true);
            jDesktopPane1.add(d);
        } else {
            d = new Dovidka(rez, "Довідка: дистанії");
            d.setVisible(true);
            jDesktopPane1.add(d);
        }
    }//GEN-LAST:event_jMenuItemDistancesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(jMenuItem2.getText().equals("Вийти")){
            jMenuItem2.setText("Увійти як адміністратор");
        }else{
           Authorization d = new Authorization(jDesktopPane1);
           d.setVisible(true);
           jDesktopPane1.add(d); 
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemLookCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLookCoachActionPerformed
        Look d = new Look(jDesktopPane1, "Тренета","tbl_coach", "Номер тренер","ПІБ","День народження","Звання","Стаж робот (роки)","Місце проживання","Телефон","Фото");
        d.setVisible(true);
        jDesktopPane1.add(d);
    }//GEN-LAST:event_jMenuItemLookCoachActionPerformed

    private void jMenuItemLookAthleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLookAthleteActionPerformed
        Look d = new Look( jDesktopPane1,"Спортсмени","tbl_athlete", "Номер атлета","ПІБ","День народження","Категорія","Тренер","Місце проживання","Телефон","Фото");
        d.setVisible(true);
        jDesktopPane1.add(d);
    }//GEN-LAST:event_jMenuItemLookAthleteActionPerformed

    private void jMenuItemLookClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLookClubActionPerformed
        LookClub d = new LookClub(jDesktopPane1);
        d.setVisible(true);
        jDesktopPane1.add(d);
    }//GEN-LAST:event_jMenuItemLookClubActionPerformed

    private void jMenuItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSearchActionPerformed
        Search search = new Search(jDesktopPane1);
        search.setVisible(true);
        jDesktopPane1.add(search);
    }//GEN-LAST:event_jMenuItemSearchActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDictionary;
    private javax.swing.JMenu jMenuFile;
    public static javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCategory;
    private javax.swing.JMenuItem jMenuItemDistances;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemLookAthlete;
    private javax.swing.JMenuItem jMenuItemLookClub;
    private javax.swing.JMenuItem jMenuItemLookCoach;
    private javax.swing.JMenuItem jMenuItemRank;
    private javax.swing.JMenuItem jMenuItemSearch;
    private javax.swing.JMenu jMenuOperacion;
    // End of variables declaration//GEN-END:variables
}
