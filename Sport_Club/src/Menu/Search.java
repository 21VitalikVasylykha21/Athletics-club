package Menu;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Vitalik
 */
public class Search extends javax.swing.JInternalFrame {

    mySQL SQL = null;
    javax.swing.JDesktopPane Fon;

    public Search(javax.swing.JDesktopPane fon) {
        initComponents();
        Fon = fon;
        start();
        if (MainMenu.jMenuItem2.getText().equals("Вийти")) {
            Admin();
        }
    }

    private void Admin() {
        AddClub.setEnabled(true);
        EditClub.setEnabled(true);
        RemoveClub.setEnabled(true);
        AddAthlete.setEnabled(true);
        EditAthlete.setEnabled(true);
        RemoveAthlete.setEnabled(true);
        AddCoach.setEnabled(true);
        EditCoach.setEnabled(true);
        RemoveCoach.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_Club = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        Table_Club = new javax.swing.JTable() {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        Table_Club.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Btn_Search_Club = new javax.swing.JButton();
        ComboBoxDistanse = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumberGames = new javax.swing.JTextField();
        NameGames = new javax.swing.JTextField();
        VenueGames = new javax.swing.JTextField();
        UpdateClub = new javax.swing.JButton();
        AddClub = new javax.swing.JButton();
        EditClub = new javax.swing.JButton();
        RemoveClub = new javax.swing.JButton();
        Panel_Coach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Coach = new javax.swing.JTable() {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        Table_Coach.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Btn_Search_Coach = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NumberCoach = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboBoxRanks = new javax.swing.JComboBox<>();
        ComboBoxWork = new javax.swing.JComboBox<>();
        NameCoach = new javax.swing.JTextField();
        ResidenceCoach = new javax.swing.JTextField();
        TelephoneCoach = new javax.swing.JTextField();
        WorkExperienceCoach = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboBoxBirth = new javax.swing.JComboBox<>();
        DateChooserBirth = new com.toedter.calendar.JDateChooser();
        UpdateCoach = new javax.swing.JButton();
        AddCoach = new javax.swing.JButton();
        EditCoach = new javax.swing.JButton();
        RemoveCoach = new javax.swing.JButton();
        Panel_Athlete = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Athlete = new javax.swing.JTable() {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        Table_Athlete.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Btn_Search_Athlete = new javax.swing.JButton();
        NumberAthlete = new javax.swing.JTextField();
        NameAthlete = new javax.swing.JTextField();
        ResidenceAthlete = new javax.swing.JTextField();
        TelephoneAthlete = new javax.swing.JTextField();
        ComboBoxBirthAthlete = new javax.swing.JComboBox<>();
        DateChooserBirthAthlete = new com.toedter.calendar.JDateChooser();
        ComboBoxCategory = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        UpdateAthlete = new javax.swing.JButton();
        RemoveAthlete = new javax.swing.JButton();
        EditAthlete = new javax.swing.JButton();
        AddAthlete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Пошук");

        Table_Club.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane.setViewportView(Table_Club);

        Btn_Search_Club.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Search_Club.setText("Знайти");
        Btn_Search_Club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Search_ClubActionPerformed(evt);
            }
        });

        ComboBoxDistanse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Дистанція:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Номер змагань");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Назва змагань");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Місце змагань");

        UpdateClub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateClub.setText("Обновити таблицю");
        UpdateClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateClubMouseClicked(evt);
            }
        });

        AddClub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddClub.setText("Додати");
        AddClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClubActionPerformed(evt);
            }
        });

        EditClub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditClub.setText("Редагувати");
        EditClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditClubActionPerformed(evt);
            }
        });

        RemoveClub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RemoveClub.setText("Видалити");
        RemoveClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveClubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ClubLayout = new javax.swing.GroupLayout(Panel_Club);
        Panel_Club.setLayout(Panel_ClubLayout);
        Panel_ClubLayout.setHorizontalGroup(
            Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ClubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ClubLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ClubLayout.createSequentialGroup()
                        .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_ClubLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AddClub)
                                .addGap(18, 18, 18)
                                .addComponent(EditClub)
                                .addGap(18, 18, 18)
                                .addComponent(RemoveClub)
                                .addGap(26, 26, 26)
                                .addComponent(UpdateClub)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Search_Club, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_ClubLayout.createSequentialGroup()
                                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameGames)
                                    .addComponent(NumberGames)
                                    .addComponent(VenueGames)
                                    .addComponent(ComboBoxDistanse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(24, 24, 24))))
        );
        Panel_ClubLayout.setVerticalGroup(
            Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ClubLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NumberGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VenueGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxDistanse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_ClubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_Search_Club, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateClub, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddClub, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Клуб", Panel_Club);

        Table_Coach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(Table_Coach);

        Btn_Search_Coach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Search_Coach.setText("Знайти");
        Btn_Search_Coach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Search_CoachActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Номер тренера");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ПІБ тренера");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Місце проживання");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Телефон");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Стаж роботи");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Звання:");
        jLabel10.setMaximumSize(new java.awt.Dimension(86, 17));
        jLabel10.setMinimumSize(new java.awt.Dimension(86, 17));
        jLabel10.setPreferredSize(new java.awt.Dimension(86, 17));

        ComboBoxRanks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ComboBoxWork.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxWork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Неважливо", "=", ">", "<", ">=", "<=" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("День народження");

        ComboBoxBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Неважливо", "=", ">", "<", ">=", "<=" }));

        UpdateCoach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateCoach.setText("Обновити таблицю");
        UpdateCoach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateCoachMouseClicked(evt);
            }
        });

        AddCoach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddCoach.setText("Додати");
        AddCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCoachActionPerformed(evt);
            }
        });

        EditCoach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditCoach.setText("Редагувати");
        EditCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCoachActionPerformed(evt);
            }
        });

        RemoveCoach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RemoveCoach.setText("Видалити");
        RemoveCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCoachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_CoachLayout = new javax.swing.GroupLayout(Panel_Coach);
        Panel_Coach.setLayout(Panel_CoachLayout);
        Panel_CoachLayout.setHorizontalGroup(
            Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(Panel_CoachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CoachLayout.createSequentialGroup()
                        .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_CoachLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WorkExperienceCoach))
                            .addGroup(Panel_CoachLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameCoach)
                                    .addComponent(NumberCoach)))
                            .addGroup(Panel_CoachLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResidenceCoach)
                                    .addComponent(TelephoneCoach)))))
                    .addGroup(Panel_CoachLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBoxRanks, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CoachLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddCoach)
                        .addGap(18, 18, 18)
                        .addComponent(EditCoach)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveCoach)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateCoach)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Search_Coach, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_CoachLayout.createSequentialGroup()
                        .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(Panel_CoachLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(DateChooserBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_CoachLayout.setVerticalGroup(
            Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CoachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NumberCoach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NameCoach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ResidenceCoach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TelephoneCoach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboBoxWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WorkExperienceCoach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(ComboBoxBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateChooserBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxRanks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EditCoach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveCoach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_CoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpdateCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Search_Coach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddCoach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Тренера", Panel_Coach);

        Table_Athlete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(Table_Athlete);

        Btn_Search_Athlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Search_Athlete.setText("Знайти");
        Btn_Search_Athlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Search_AthleteActionPerformed(evt);
            }
        });

        ComboBoxBirthAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxBirthAthlete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Неважливо", "=", ">", "<", ">=", "<=" }));

        ComboBoxCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Розряд");
        jLabel12.setMaximumSize(new java.awt.Dimension(86, 17));
        jLabel12.setMinimumSize(new java.awt.Dimension(86, 17));
        jLabel12.setPreferredSize(new java.awt.Dimension(86, 17));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("День народження");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Телефон");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Місце проживання");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ПІБ атлета");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Номер атлета");

        UpdateAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateAthlete.setText("Обновити таблицю");
        UpdateAthlete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateAthleteMouseClicked(evt);
            }
        });

        RemoveAthlete.setEnabled(false);
        RemoveAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RemoveAthlete.setText("Видалити");
        RemoveAthlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAthleteActionPerformed(evt);
            }
        });

        EditAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditAthlete.setText("Редагувати");
        EditAthlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAthleteActionPerformed(evt);
            }
        });

        AddAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddAthlete.setText("Додати");
        AddAthlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAthleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_AthleteLayout = new javax.swing.GroupLayout(Panel_Athlete);
        Panel_Athlete.setLayout(Panel_AthleteLayout);
        Panel_AthleteLayout.setHorizontalGroup(
            Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addGroup(Panel_AthleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AthleteLayout.createSequentialGroup()
                        .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_AthleteLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameAthlete)
                                    .addComponent(NumberAthlete)))
                            .addGroup(Panel_AthleteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResidenceAthlete)
                                    .addComponent(TelephoneAthlete)))))
                    .addGroup(Panel_AthleteLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxBirthAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DateChooserBirthAthlete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_AthleteLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(ComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AthleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddAthlete)
                .addGap(18, 18, 18)
                .addComponent(EditAthlete)
                .addGap(18, 18, 18)
                .addComponent(RemoveAthlete)
                .addGap(18, 18, 18)
                .addComponent(UpdateAthlete)
                .addGap(18, 18, 18)
                .addComponent(Btn_Search_Athlete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        Panel_AthleteLayout.setVerticalGroup(
            Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AthleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(NumberAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(NameAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ResidenceAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TelephoneAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(ComboBoxBirthAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateChooserBirthAthlete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EditAthlete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_AthleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpdateAthlete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Search_Athlete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RemoveAthlete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddAthlete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Атлети", Panel_Athlete);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Search_Table");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Search_ClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Search_ClubActionPerformed
        String Number = NumberGames.getText();
        String Name = NameGames.getText();
        String Venue = VenueGames.getText();

        String search = "";
        ArrayList<String> d = new ArrayList<String>();

        if (!Number.equals("")) {
            d.add("`id_club` = " + Number);
        }
        if (!Name.equals("")) {
            d.add("`competition` LIKE '%" + Name + "%'");
        }
        if (!Venue.equals("")) {
            d.add("`venue_competition` LIKE '%" + Venue + "%'");
        }

        if (!ComboBoxDistanse.getSelectedItem().toString().equals("Неважливо")) {
            int dist = Integer.parseInt(ComboBoxDistanse.getSelectedItem().toString());
            switch (dist) {
                case 60:
                    d.add("`id_distance_tbl_club` = 1");
                    break;
                case 100:
                    d.add("`id_distance_tbl_club` = 2");
                    break;
                case 200:
                    d.add("`id_distance_tbl_club` = 3");
                    break;
                case 400:
                    d.add("`id_distance_tbl_club` = 4");
                    break;
                case 800:
                    d.add("`id_distance_tbl_club` = 5");
                    break;
                case 1000:
                    d.add("`id_distance_tbl_club` = 6");
                    break;
                case 1500:
                    d.add("`id_distance_tbl_club` = 7");
                    break;
                case 3000:
                    d.add("`id_distance_tbl_club` = 8");
                    break;
                case 5000:
                    d.add("`id_distance_tbl_club` = 9");
                    break;
                case 10000:
                    d.add("`id_distance_tbl_club` = 10");
                    break;
                case 42195:
                    d.add("`id_distance_tbl_club` = 11");
                    break;
            }
        }

        for (int i = 0; i < d.size(); i++) {
            search += "" + d.get(i);
            if (i != d.size() - 1) {
                search += " AND ";
            }
        }

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
            ResultSet s = SQL.GetDataSearch(search);
            try {
                ResultSetMetaData colonki = s.getMetaData();
                i = colonki.getColumnCount();//к-ть колонок

                javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel();

                String nazvaKolonki[] = new String[i];
                nazvaKolonki[0] = "Номер змагань";
                nazvaKolonki[1] = "Назва змагань";
                nazvaKolonki[2] = "День проведення";
                nazvaKolonki[3] = "Місце проведення";
                nazvaKolonki[4] = "Дистанція(метри)";
                nazvaKolonki[5] = "Учасники";
                nazvaKolonki[6] = "Судді";
                nazvaKolonki[7] = "Результати";

                dtm.setColumnIdentifiers(nazvaKolonki);

                dtm.setRowCount(0);//
                while (s.next()) {
                    dtm.setRowCount(dtm.getRowCount() + 1);
                    for (int j = 1; j <= i; j++) {
                        String g = s.getString(j);
                        dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                    }
                    ii++;
                }
                Table_Club.setModel(dtm);
            } catch (SQLException ex) {
                System.out.print(ex);
            }
        }
    }//GEN-LAST:event_Btn_Search_ClubActionPerformed

    private void Btn_Search_AthleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Search_AthleteActionPerformed
        String Number = NumberAthlete.getText();
        String Name = NameAthlete.getText();
        String Residence = ResidenceAthlete.getText();

        String search = "";
        ArrayList<String> d = new ArrayList<String>();

        if (!Number.equals("")) {
            d.add("`id_athlete` = " + Number);
        }
        if (!Name.equals("")) {
            d.add("`name_athlete` LIKE '%" + Name + "%'");
        }
        if (!Residence.equals("")) {
            d.add("`residence_athlete` LIKE '%" + Residence + "%'");
        }
        if (!TelephoneAthlete.getText().equals("")) {
            try {
                int Telephone = Integer.parseInt(TelephoneAthlete.getText());
                d.add("`telephone_athlete` =" + Telephone);
            } catch (NumberFormatException ex) {
                TelephoneAthlete.setText("Невірно введений номер, пошук буде проведений без нього");
            }
        }

        if (!ComboBoxBirthAthlete.getSelectedItem().toString().equals("Неважливо")) {
            SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
            d.add("`birth_athlete` " + ComboBoxBirthAthlete.getSelectedItem().toString() + " '" + sdt.format(DateChooserBirthAthlete.getDate()) + "'");
        }

        if (!ComboBoxCategory.getSelectedItem().toString().equals("Неважливо")) {
            String rank = ComboBoxCategory.getSelectedItem().toString();
            switch (rank) {
                case "I юнацький":
                    d.add("`id_category_tbl_athlete` = 1");
                    break;
                case "II юнацький":
                    d.add("`id_category_tbl_athlete` = 2");
                    break;
                case "III юнацький":
                    d.add("`id_category_tbl_athlete` = 3");
                    break;
                case "I розряд":
                    d.add("`id_category_tbl_athlete` = 4");
                    break;
                case "II розряд":
                    d.add("`id_category_tbl_athlete` = 5");
                    break;
                case "III розряд":
                    d.add("`id_category_tbl_athlete` = 6");
                    break;
                case "Кандинат майстеру спорту (КМС)":
                    d.add("`id_category_tbl_athlete` = 7");
                    break;
                case "Майстер спорту (МС)":
                    d.add("`id_category_tbl_athlete` = 8");
                    break;
                case "Майстер спорту міжнародного класу (МСМК)":
                    d.add("`id_category_tbl_athlete` = 9");
                    break;
            }
        }

        for (int i = 0; i < d.size(); i++) {
            search += "" + d.get(i);
            if (i != d.size() - 1) {
                search += " AND ";
            }
        }

        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_athlete"
        );

        String rez = SQL.Conect();
        int i = 0, ii = 1;
        if (rez.equals("Ok")) {
            ResultSet s = SQL.GetDataSearch(search);
            try {
                ResultSetMetaData colonki = s.getMetaData();
                i = colonki.getColumnCount();//к-ть колонок

                javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel();

                String nazvaKolonki[] = new String[i];
                nazvaKolonki[0] = "Номер тренер";
                nazvaKolonki[1] = "ПІБ";
                nazvaKolonki[2] = "День народження";
                nazvaKolonki[3] = "Розряд";
                nazvaKolonki[4] = "Тренер";
                nazvaKolonki[5] = "Місце проживання";
                nazvaKolonki[6] = "Телефон";
                nazvaKolonki[7] = "Фото";

                dtm.setColumnIdentifiers(nazvaKolonki);

                dtm.setRowCount(0);//
                while (s.next()) {
                    dtm.setRowCount(dtm.getRowCount() + 1);
                    for (int j = 1; j <= i; j++) {
                        String g = s.getString(j);
                        if (j == 4) {
                            SQL = new mySQL("127.0.0.1", "3306", "athlethic_base_club_data", "root", "", "tbl_category");
                            rez = SQL.Conect();
                            if (rez.equals("Ok")) {
                                dtm.setValueAt(SQL.GetSearch("name_categorys", "`id_categorys` = " + g), ii - 1, j - 1);
                            }
                            continue;
                        }
                        if (j == 5) {
                            SQL = new mySQL("127.0.0.1", "3306", "athlethic_base_club_data", "root", "", "tbl_coach");
                            rez = SQL.Conect();
                            if (rez.equals("Ok")) {
                                dtm.setValueAt(SQL.GetSearch("name_coach", "`id_coach` = " + g), ii - 1, j - 1);
                            }
                            continue;
                        }
                        dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                    }
                    ii++;
                }
                Table_Athlete.setModel(dtm);
                Table_Athlete.setRowHeight(100);
                Table_Athlete.getColumn("Фото").setCellRenderer(new CellRenderer());
            } catch (Exception ex) {
                System.out.print(ex);
            }
        }
    }//GEN-LAST:event_Btn_Search_AthleteActionPerformed

    private void Btn_Search_CoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Search_CoachActionPerformed
        String Number = NumberCoach.getText();
        String Name = NameCoach.getText();
        String Residence = ResidenceCoach.getText();

        String search = "";
        ArrayList<String> d = new ArrayList<String>();

        if (!Number.equals("")) {
            d.add("`id_coach` = " + Number);
        }
        if (!Name.equals("")) {
            d.add("`name_coach` LIKE '%" + Name + "%'");
        }
        if (!Residence.equals("")) {
            d.add("`residence_coach` LIKE '%" + Residence + "%'");
        }
        if (!TelephoneCoach.getText().equals("")) {
            try {
                int Telephone = Integer.parseInt(TelephoneCoach.getText());
                d.add("`telephone_coach` =" + Telephone);
            } catch (NumberFormatException ex) {
                TelephoneCoach.setText("Невірно введений номер, пошук буде проведений без нього");
            }
        }

        if (!ComboBoxWork.getSelectedItem().toString().equals("Неважливо")) {
            try {
                int WorkExperience = Integer.parseInt(WorkExperienceCoach.getText());
                d.add("`work_experience_coach`" + ComboBoxWork.getSelectedItem().toString() + WorkExperience);
            } catch (NumberFormatException ex) {
                WorkExperienceCoach.setText("Невірно введений рік, пошук буде проведений без нього");
            }
        }

        if (!ComboBoxBirth.getSelectedItem().toString().equals("Неважливо")) {
            SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
            d.add("`birth_coach` " + ComboBoxBirth.getSelectedItem().toString() + " '" + sdt.format(DateChooserBirth.getDate()) + "'");
        }

        if (!ComboBoxRanks.getSelectedItem().toString().equals("Неважливо")) {
            String rank = ComboBoxRanks.getSelectedItem().toString();
            switch (rank) {
                case "Гросмейстер України (ГУ)":
                    d.add("`id_rank_tbl_coach` = 4");
                    break;
                case "Заслужений майстер спорту України (ЗМСУ)":
                    d.add("`id_rank_tbl_coach` = 2");
                    break;
                case "Заслужений тренер України (ЗТУ)":
                    d.add("`id_rank_tbl_coach` = 1");
                    break;
                case "Майстер спорту України (МСУ)":
                    d.add("`id_rank_tbl_coach` = 5");
                    break;
                case "Майстер спорту України міжнародного класу (МСУМК)":
                    d.add("`id_rank_tbl_coach` = 3");
                    break;
            }
        }

        for (int i = 0; i < d.size(); i++) {
            search += "" + d.get(i);
            if (i != d.size() - 1) {
                search += " AND ";
            }
        }

        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                "tbl_coach"
        );

        String rez = SQL.Conect();
        int i = 0, ii = 1;
        if (rez.equals("Ok")) {
            ResultSet s = SQL.GetDataSearch(search);
            try {
                ResultSetMetaData colonki = s.getMetaData();
                i = colonki.getColumnCount();//к-ть колонок

                javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel();

                String nazvaKolonki[] = new String[i];
                nazvaKolonki[0] = "Номер тренер";
                nazvaKolonki[1] = "ПІБ";
                nazvaKolonki[2] = "День народження";
                nazvaKolonki[3] = "Звання";
                nazvaKolonki[4] = "Стаж робот (роки)";
                nazvaKolonki[5] = "Місце проживання";
                nazvaKolonki[6] = "Телефон";
                nazvaKolonki[7] = "Фото";

                dtm.setColumnIdentifiers(nazvaKolonki);

                dtm.setRowCount(0);//
                while (s.next()) {
                    dtm.setRowCount(dtm.getRowCount() + 1);
                    for (int j = 1; j <= i; j++) {
                        String g = s.getString(j);
                        if (j == 4) {
                            SQL = new mySQL("127.0.0.1", "3306", "athlethic_base_club_data", "root", "", "tbl_rank");
                            rez = SQL.Conect();
                            if (rez.equals("Ok")) {
                                dtm.setValueAt(SQL.GetSearch("name_ranks", "`id_ranks` = " + g), ii - 1, j - 1);
                            }
                            continue;
                        }
                        dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                    }
                    ii++;
                }
                Table_Coach.setModel(dtm);
                Table_Coach.setRowHeight(100);
                Table_Coach.getColumn("Фото").setCellRenderer(new CellRenderer());
            } catch (Exception ex) {
                System.out.print(ex);
            }
        }
    }//GEN-LAST:event_Btn_Search_CoachActionPerformed

    private void UpdateClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateClubMouseClicked
        Load("tbl_club", Table_Club, "Номер змагань", "Назва змагань", "День проведення", "Місце проведення", "Дистанція(метри)", "Учасники", "Судді", "Результати");
    }//GEN-LAST:event_UpdateClubMouseClicked

    private void UpdateCoachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateCoachMouseClicked
        Load("tbl_coach", Table_Coach, "Номер тренер", "ПІБ", "День народження", "Звання", "Стаж робот (роки)", "Місце проживання", "Телефон", "Фото");
    }//GEN-LAST:event_UpdateCoachMouseClicked

    private void UpdateAthleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateAthleteMouseClicked
        Load("tbl_athlete", Table_Athlete, "Номер атлета", "ПІБ", "День народження", "Категорія", "Тренер", "Місце проживання", "Телефон", "Фото");
    }//GEN-LAST:event_UpdateAthleteMouseClicked

    private void AddAthleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAthleteActionPerformed
        AddAthlete d = new AddAthlete(Fon);
        d.setVisible(true);
        Fon.add(d);
    }//GEN-LAST:event_AddAthleteActionPerformed

    private void EditAthleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAthleteActionPerformed
        int X = Table_Athlete.getSelectedRow();
        AddAthlete d = new AddAthlete(Fon);
        try {
            d.Edit((int) Integer.valueOf((String) Table_Athlete.getValueAt(X, 0)), (String) Table_Athlete.getValueAt(X, 1),
                    (String) Table_Athlete.getValueAt(X, 2), (String) Table_Athlete.getValueAt(X, 3),
                    (String) Table_Athlete.getValueAt(X, 4), (String) Table_Athlete.getValueAt(X, 5),
                    (String) Table_Athlete.getValueAt(X, 6), (String) Table_Athlete.getValueAt(X, 7));
        } catch (ParseException ex) {

        }
        d.setVisible(true);
        Fon.add(d);
    }//GEN-LAST:event_EditAthleteActionPerformed

    private void RemoveAthleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAthleteActionPerformed
        remov("tbl_athlete", "id_athlete", Table_Athlete);
    }//GEN-LAST:event_RemoveAthleteActionPerformed

    private void RemoveCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCoachActionPerformed
        remov("tbl_coach", "id_coach", Table_Coach);
    }//GEN-LAST:event_RemoveCoachActionPerformed

    private void RemoveClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveClubActionPerformed
        remov("tbl_club", "id_club", Table_Club);
    }//GEN-LAST:event_RemoveClubActionPerformed

    private void AddClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClubActionPerformed
        AddClub d = new AddClub(Fon);
        d.setVisible(true);
        Fon.add(d);
    }//GEN-LAST:event_AddClubActionPerformed

    private void AddCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCoachActionPerformed
        AddCoach d = new AddCoach(Fon);
        d.setVisible(true);
        Fon.add(d);
    }//GEN-LAST:event_AddCoachActionPerformed

    private void EditCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCoachActionPerformed
        int X = Table_Athlete.getSelectedRow();
        AddCoach d = new AddCoach(Fon);
        try {
            d.Edit((int) Integer.valueOf((String) Table_Athlete.getValueAt(X, 0)), (String) Table_Athlete.getValueAt(X, 1),
                    (String) Table_Athlete.getValueAt(X, 2), (String) Table_Athlete.getValueAt(X, 3),
                    (String) Table_Athlete.getValueAt(X, 4), (String) Table_Athlete.getValueAt(X, 5),
                    (String) Table_Athlete.getValueAt(X, 6), (String) Table_Athlete.getValueAt(X, 7));
        } catch (ParseException ex) {

        }
        d.setVisible(true);
        Fon.add(d);
    }//GEN-LAST:event_EditCoachActionPerformed

    private void EditClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditClubActionPerformed
        int X = Table_Athlete.getSelectedRow();
        AddClub d = new AddClub(Fon);
        try {
            d.Edit((int) Integer.valueOf((String) Table_Athlete.getValueAt(X, 0)), (String) Table_Athlete.getValueAt(X, 1),
                    (String) Table_Athlete.getValueAt(X, 2), (String) Table_Athlete.getValueAt(X, 3),
                    (String) Table_Athlete.getValueAt(X, 4), (String) Table_Athlete.getValueAt(X, 5),
                    (String) Table_Athlete.getValueAt(X, 6), (String) Table_Athlete.getValueAt(X, 7));
        } catch (ParseException ex) {

        }
        d.setVisible(true);
        Fon.add(d);
    }//GEN-LAST:event_EditClubActionPerformed

    private void start() {
        DateChooserBirth.getJCalendar().setPreferredSize(new Dimension(350, 200));
        DateChooserBirthAthlete.getJCalendar().setPreferredSize(new Dimension(350, 200));

        Load("tbl_club", Table_Club, "Номер змагань", "Назва змагань", "День проведення", "Місце проведення", "Дистанція(метри)", "Учасники", "Судді", "Результати");
        Load("tbl_coach", Table_Coach, "Номер тренер", "ПІБ", "День народження", "Звання", "Стаж робот (роки)", "Місце проживання", "Телефон", "Фото");
        Load("tbl_athlete", Table_Athlete, "Номер атлета", "ПІБ", "День народження", "Розряд", "Тренер", "Місце проживання", "Телефон", "Фото");

        AddInComboBox("tbl_distances", "distances", ComboBoxDistanse);
        AddInComboBox("tbl_rank", "name_ranks", ComboBoxRanks);
        AddInComboBox("tbl_category", "name_categorys", ComboBoxCategory);

        EditAthlete.setEnabled(false);
        EditClub.setEnabled(false);
        EditCoach.setEnabled(false);

        RemoveAthlete.setEnabled(false);
        RemoveClub.setEnabled(false);
        RemoveCoach.setEnabled(false);

        AddAthlete.setEnabled(false);
        AddClub.setEnabled(false);
        AddCoach.setEnabled(false);
    }

    private void remov(String tbl, String name_id, javax.swing.JTable tabel) {
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
            int X;
            X = tabel.getSelectedRow();
            if (X < 0) {
                return;
            }

            X = (int) Integer.valueOf((String) tabel.getValueAt(X, 0));
            SQL.del(X, name_id);
        }
    }

    private void Load(String tbl, javax.swing.JTable Table_Rezult, String Title1, String Title2, String Title3, String Title4, String Title5, String Title6, String Title7, String Title8) {
        SQL = new mySQL(
                "127.0.0.1",
                "3306",
                "athlethic_base_club_data",
                "root",
                "",
                tbl
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
                nazvaKolonki[0] = Title1;
                nazvaKolonki[1] = Title2;
                nazvaKolonki[2] = Title3;
                nazvaKolonki[3] = Title4;
                nazvaKolonki[4] = Title5;
                nazvaKolonki[5] = Title6;
                nazvaKolonki[6] = Title7;
                nazvaKolonki[7] = Title8;

                dtm.setColumnIdentifiers(nazvaKolonki);
                dtm.setRowCount(0);//
                while (X.next()) {
                    dtm.setRowCount(dtm.getRowCount() + 1);
                    if (tbl.equals("tbl_coach")) {
                        for (int j = 1; j <= i; j++) {
                            String g = X.getString(j);
                            if (j == 4) {
                                SQL = new mySQL("127.0.0.1", "3306", "athlethic_base_club_data", "root", "", "tbl_rank");
                                rez = SQL.Conect();
                                if (rez.equals("Ok")) {
                                    dtm.setValueAt(SQL.GetSearch("name_ranks", "`id_ranks` = " + g), ii - 1, j - 1);
                                }
                                continue;
                            }
                            dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                        }
                        ii++;
                    } else if (tbl.equals("tbl_athlete")) {
                        for (int j = 1; j <= i; j++) {
                            String g = X.getString(j);
                            if (j == 4) {
                                SQL = new mySQL("127.0.0.1", "3306", "athlethic_base_club_data", "root", "", "tbl_category");
                                rez = SQL.Conect();
                                if (rez.equals("Ok")) {
                                    dtm.setValueAt(SQL.GetSearch("name_categorys", "`id_categorys` = " + g), ii - 1, j - 1);
                                }
                                continue;
                            }
                            if (j == 5) {
                                SQL = new mySQL("127.0.0.1", "3306", "athlethic_base_club_data", "root", "", "tbl_coach");
                                rez = SQL.Conect();
                                if (rez.equals("Ok")) {
                                    dtm.setValueAt(SQL.GetSearch("name_coach", "`id_coach` = " + g), ii - 1, j - 1);
                                }
                                continue;
                            }
                            dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                        }
                        ii++;
                    } else {
                        for (int j = 1; j <= i; j++) {
                            String g = X.getString(j);
                            dtm.setValueAt(g, ii - 1, j - 1);//виводимо дані у модел
                        }
                        ii++;
                    }
                }
                Table_Rezult.setModel(dtm);
                Table_Rezult.setRowHeight(100);
                Table_Rezult.getColumn("Фото").setCellRenderer(new CellRenderer());
            } catch (Exception ex) {
                //error
            }
        }
    }

    private void AddInComboBox(String tbl, String NameColumn, javax.swing.JComboBox<String> ComboBox) {
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
            ComboBox.addItem("Неважливо");
            SQL.GetInfoInComboBox(NameColumn, ComboBox);
        } else {
            ComboBox.removeAll();
            ComboBox.addItem(rez);
        }
    }

    public void AdminRight() {
        EditAthlete.setEnabled(true);
        EditClub.setEnabled(true);
        EditCoach.setEnabled(true);

        RemoveAthlete.setEnabled(true);
        RemoveClub.setEnabled(true);
        RemoveCoach.setEnabled(true);

        AddAthlete.setEnabled(true);
        AddClub.setEnabled(true);
        AddCoach.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAthlete;
    private javax.swing.JButton AddClub;
    private javax.swing.JButton AddCoach;
    private javax.swing.JButton Btn_Search_Athlete;
    private javax.swing.JButton Btn_Search_Club;
    private javax.swing.JButton Btn_Search_Coach;
    private javax.swing.JComboBox<String> ComboBoxBirth;
    private javax.swing.JComboBox<String> ComboBoxBirthAthlete;
    private javax.swing.JComboBox<String> ComboBoxCategory;
    private javax.swing.JComboBox<String> ComboBoxDistanse;
    private javax.swing.JComboBox<String> ComboBoxRanks;
    private javax.swing.JComboBox<String> ComboBoxWork;
    private com.toedter.calendar.JDateChooser DateChooserBirth;
    private com.toedter.calendar.JDateChooser DateChooserBirthAthlete;
    private javax.swing.JButton EditAthlete;
    private javax.swing.JButton EditClub;
    private javax.swing.JButton EditCoach;
    private javax.swing.JTextField NameAthlete;
    private javax.swing.JTextField NameCoach;
    private javax.swing.JTextField NameGames;
    private javax.swing.JTextField NumberAthlete;
    private javax.swing.JTextField NumberCoach;
    private javax.swing.JTextField NumberGames;
    private javax.swing.JPanel Panel_Athlete;
    private javax.swing.JPanel Panel_Club;
    private javax.swing.JPanel Panel_Coach;
    private javax.swing.JButton RemoveAthlete;
    private javax.swing.JButton RemoveClub;
    private javax.swing.JButton RemoveCoach;
    private javax.swing.JTextField ResidenceAthlete;
    private javax.swing.JTextField ResidenceCoach;
    private javax.swing.JTable Table_Athlete;
    private javax.swing.JTable Table_Club;
    private javax.swing.JTable Table_Coach;
    private javax.swing.JTextField TelephoneAthlete;
    private javax.swing.JTextField TelephoneCoach;
    private javax.swing.JButton UpdateAthlete;
    private javax.swing.JButton UpdateClub;
    private javax.swing.JButton UpdateCoach;
    private javax.swing.JTextField VenueGames;
    private javax.swing.JTextField WorkExperienceCoach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
