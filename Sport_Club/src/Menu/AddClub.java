package Menu;

import java.awt.Dimension;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 * @author Vitalik
 */
public class AddClub extends javax.swing.JInternalFrame {

    mySQL SQL = null;
    javax.swing.JDesktopPane Fon;
    int ID;
    DefaultListModel DistanceList;
    DefaultListModel AthleteList;
    String Distance = "";
    String Participants = "";

    /**
     * Creates new form AddClub
     *
     * @param fon
     */
    public AddClub(javax.swing.JDesktopPane fon) {
        initComponents();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        txtResults.setText("");
        time.setValue(cal.getTime());

        Fon = fon;
        DateChooser.getJCalendar().setPreferredSize(new Dimension(350, 200));
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_athlete"
        );
        String rez = SQL.Conect();
        AthleteList = new DefaultListModel();
        if (rez.equals("Ok")) {
            String[] rezult = SQL.GetInfo("name_athlete").split("\n");
            for (String name : rezult) {
                AthleteList.addElement(name);
            }
        } else {
            AthleteList.addElement("Помилка");
        }
        ListParticipants.setModel(AthleteList);

        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_distances"
        );
        rez = SQL.Conect();
        DistanceList = new DefaultListModel();
        if (rez.equals("Ok")) {
            String[] rezult = SQL.GetInfo("distances").split("\n");
            for (String name : rezult) {
                DistanceList.addElement(name);
            }
        } else {
            DistanceList.addElement("Помилка");
        }
        ListDistance.setModel(DistanceList);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtVenue = new javax.swing.JTextField();
        txtJudges = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListParticipants = new javax.swing.JList<>();
        BtnAddParticipants = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListDistance = new javax.swing.JList<>();
        BtnAddDistance = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ComboBoxLParticipants = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ComboBoxDistance = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtResults = new javax.swing.JTextField();
        time = new javax.swing.JSpinner(new SpinnerDateModel());
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AddAthleteInRezult = new javax.swing.JButton();
        txtNameCoachAthlete = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Назва змагань:");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Назва змагань:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("День проведення:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Місце проведення:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Дистанція:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Учасники:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Судді:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtVenue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtJudges.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BtnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAdd.setText("Додати Змагання");
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

        ListParticipants.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ListParticipants.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListParticipants);

        BtnAddParticipants.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAddParticipants.setText("Додати спорстменів");
        BtnAddParticipants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddParticipantsActionPerformed(evt);
            }
        });

        ListDistance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ListDistance.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ListDistance);

        BtnAddDistance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAddDistance.setText("Додати дистанцію");
        BtnAddDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddDistanceActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Результати спортсменів", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Спортсмен");

        ComboBoxLParticipants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxLParticipantsActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ПІБ тренер атлета ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Дистанція яку біг спорстмен");

        txtResults.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(time, "HH:mm:ss");
        time.setEditor(timeEditor);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Час, за який пробіг дистанцію");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Результат спортсмена");

        AddAthleteInRezult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddAthleteInRezult.setText("Додати результат спорстмену");
        AddAthleteInRezult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAthleteInRezultActionPerformed(evt);
            }
        });

        txtNameCoachAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel17))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResults)
                            .addComponent(txtNameCoachAthlete)
                            .addComponent(ComboBoxDistance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxLParticipants, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 169, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddAthleteInRezult)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboBoxLParticipants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNameCoachAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(10, 10, 10)
                .addComponent(AddAthleteInRezult))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Номер змагань:");

        txtNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                                    .addComponent(txtName)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnAddParticipants))
                                    .addComponent(txtJudges, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnAddDistance))
                                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAddDistance))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAddParticipants)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtJudges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        if (txtName.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (txtVenue.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (txtJudges.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (txtResults.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
            try {
                sdt.format(DateChooser.getDate());
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Заповніть пусті міста", "Помилка", javax.swing.JOptionPane.ERROR_MESSAGE);
            }

            String Name = txtName.getText();
            String Venue = txtVenue.getText();
            String Judges = txtJudges.getText();
            String Results = txtResults.getText();

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
                if (BtnAdd.getText().equals("Додати Змагання")) {
                    SQL.Add(Name, sdt.format(DateChooser.getDate()), Venue, Distance, Participants, Judges, txtNumber.getText());
                } else {
                    SQL.Edit(ID, Name, sdt.format(DateChooser.getDate()), Venue, Distance, Participants, Judges, txtNumber.getText());
                }
            }
            this.dispose();
            LookClub d = new LookClub(Fon);
            d.setVisible(true);
            Fon.add(d);
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnAddParticipantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddParticipantsActionPerformed
        ComboBoxLParticipants.addItem(ListParticipants.getSelectedValue());
        Participants += ListParticipants.getSelectedValue() + ";";
        ComboBoxLParticipants.setSelectedItem(ListParticipants.getSelectedValue());
        AthleteList.remove(ListParticipants.getSelectedIndex());
        ListParticipants.setModel(AthleteList);
        String id = "1";
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_athlete"
        );
        String rez = SQL.Conect();
        if (rez.equals("Ok")) {
            id = SQL.GetSearch("id_coach_tbl_athlete", "`name_athlete` LIKE '" + (String) ComboBoxLParticipants.getSelectedItem() + "'");
        }

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
            txtNameCoachAthlete.setText(SQL.GetSearch("name_coach", "`id_coach` = " + id));
        }

    }//GEN-LAST:event_BtnAddParticipantsActionPerformed

    private void BtnAddDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddDistanceActionPerformed
        Distance += ListDistance.getSelectedValue() + ";";
        ComboBoxDistance.addItem(ListDistance.getSelectedValue());
        ComboBoxDistance.setSelectedItem(ListDistance.getSelectedValue());
        DistanceList.remove(ListDistance.getSelectedIndex());
        ListDistance.setModel(DistanceList);
    }//GEN-LAST:event_BtnAddDistanceActionPerformed

    private void AddAthleteInRezultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAthleteInRezultActionPerformed
        String Name = (String) ComboBoxLParticipants.getSelectedItem();
        String Distanse = (String) ComboBoxDistance.getSelectedItem();
        String Coach = txtNameCoachAthlete.getText();
        String Photo = "";

        String Rezults = txtResults.getText();
        DateFormat Tformat = new SimpleDateFormat("HH:mm:ss");
        String Time = Tformat.format(time.getValue());
        String Number = txtNumber.getText();

        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_athlete"
        );
        String rez = SQL.Conect();
        if (rez.equals("Ok")) {
            Coach = SQL.GetSearch("id_coach_tbl_athlete", "`name_athlete` LIKE '" + Name + "'");
            Photo = SQL.GetSearch("photo_athlete", "`name_athlete` LIKE '" + Name + "'");
            Name = SQL.GetSearch("id_athlete", "`name_athlete` LIKE '" + Name + "'");
        }

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
            Distanse = SQL.GetSearch("id_distances", "`distances` = " + Distanse);
        }

        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_rezults"
        );
        rez = SQL.Conect();
        if (rez.equals("Ok")) {
            if(AddAthleteInRezult.getText().equals("Редагувати результат"))SQL.Edit(ID,Number, Name, Coach, Distanse, Rezults, Time, Photo);
            else SQL.Add(Number, Name, Coach, Distanse, Rezults, Time, Photo);
        }
    }//GEN-LAST:event_AddAthleteInRezultActionPerformed

    private void ComboBoxLParticipantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxLParticipantsActionPerformed
        String name = (String) ComboBoxLParticipants.getSelectedItem();
        String id = "1";
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_athlete"
        );
        String rez = SQL.Conect();
        if (rez.equals("Ok")) {
            id = SQL.GetSearch("id_coach_tbl_athlete", "`name_athlete` LIKE '" + name + "'");
        }

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
            txtNameCoachAthlete.setText(SQL.GetSearch("name_coach", "`id_coach` = " + id));
        }
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        txtResults.setText("");
        time.setValue(cal.getTime());

        if (AddAthleteInRezult.getText().equals("Редагувати результат")) {
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
                ComboBoxDistance.setSelectedItem(SQL.GetSearch("distances", "`id_distances` = "
                        + "(SELECT `id_ditance_rezults` FROM `tbl_rezults` WHERE `id_athlete_rezults` = "
                        + "(SELECT `id_athlete` FROM `tbl_athlete` WHERE `name_athlete` LIKE '" + name + "'))"));
            }
            SQL = new mySQL(
                    "127.0.0.1",
                    "3306",
                    "athlethic_base_club_data",
                    "root",
                    "",
                    "tbl_rezults"
            );
            rez = SQL.Conect();
            if (rez.equals("Ok")) {
                txtResults.setText(SQL.GetSearch("position_rezults", "`id_athlete_rezults` = "
                        + "(SELECT `id_athlete` FROM `tbl_athlete` WHERE `name_athlete` LIKE '" + name + "')"));

                try {
                    java.util.Date temp = new SimpleDateFormat("HH:mm:ss").parse(SQL.GetSearch("time_rezults", "`id_athlete_rezults` = "
                            + "(SELECT `id_athlete` FROM `tbl_athlete` WHERE `name_athlete` LIKE '" + name + "') "
                            + "AND `id_club_rezults` = " + txtNumber.getText()));

                    time.setValue(temp);
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }
        }

    }//GEN-LAST:event_ComboBoxLParticipantsActionPerformed

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

    public void Edit(int id, String name, String day, String venue, String distance, String participants, String judges, String results) throws ParseException {
        BtnAdd.setText("Редагувати");
        AddAthleteInRezult.setText("Редагувати результат");
        txtName.setText(name);
        txtVenue.setText(venue);
        txtJudges.setText(judges);
        txtNumber.setText(results);
        Participants = participants;
        Distance = distance;
        java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(day);
        DateChooser.setDate(date);
        ID = id;
        for (String s : Participants.split(";")) {
            ComboBoxLParticipants.addItem(s);

        }
        for (String s : distance.split(";")) {
            ComboBoxDistance.addItem(s);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAthleteInRezult;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnAddDistance;
    private javax.swing.JButton BtnAddParticipants;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JComboBox<String> ComboBoxDistance;
    private javax.swing.JComboBox<String> ComboBoxLParticipants;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JList<String> ListDistance;
    private javax.swing.JList<String> ListParticipants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner time;
    private javax.swing.JTextField txtJudges;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameCoachAthlete;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtResults;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables
}
