package Menu;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitalik
 */
public class mySQL {

    
    private String user = "root";//КОРИСТУВАЧ
    private String password = "";//ПАРОЛЬ
    private String Host = "127.0.0.1";
    private String Port = "3306";
    private String DB = "jdbc_test";
    private final String CP = "utf8";

    private Connection conn = null; //обєкт що представляє зєднання з БД
    private String tbl = "test";//ТАБЛИЦЯ З ЯКОЮ БУДЕМО ПРАЦЮВАТИ
    private Statement s = null;

    /**
     *
     * @param SERVER
     * @param PORT
     * @param DB
     * @param USR
     * @param PAS
     * @param TBL
     */
    public mySQL(String SERVER, String PORT, String DB, String USR, String PAS, String TBL) {
        this.user = USR;
        this.password = PAS;
        this.Host = SERVER;
        this.Port = PORT;
        this.DB = DB;
        if (TBL != null) {
            tbl = TBL;
        }
    }

    /**
     *
     * @return
     */
    public String Conect() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setServerName(this.Host);
        dataSource.setDatabaseName(this.DB);
        dataSource.setPort(Integer.parseInt(this.Port));

        try {
            dataSource.setServerTimezone("UTC");
        } catch (SQLException ex) {
            System.out.println("Err on setting Timezone :\n" + ex.toString());
        }
        try {
            dataSource.setCharacterEncoding(CP);
        } catch (SQLException ex) {
            System.out.println("Err on setting CP :\n" + ex.toString());
        }
        try {
            conn = dataSource.getConnection();
            return "Ok";
        } catch (SQLException ex) {
            System.out.println("Err on getting connection :\n" + ex.toString());
        }
        return "not Ok";
    }

    /**
     *
     * @param info
     * @return
     */
    public String GetInfo(String info) {
        String rez = "Помилка!!!";
        try {
            if (s == null) {
                s = conn.createStatement();
            }
            ResultSet r;
            r = s.executeQuery(
                    "SELECT " + info
                    + " FROM  " + tbl);

            rez = "";
            while (r.next()) {
                rez += r.getString(1) + "\n";
            }

        } catch (SQLException e) {
            return rez;
        }
        return rez;
    }

    public String GetInfoInComboBox(String info, javax.swing.JComboBox<String> d) {
        String rez = "Помилка!!!";
        d.removeAll();
        try {
            if (s == null) {
                s = conn.createStatement();
            }
            ResultSet r;

            r = s.executeQuery(
                    "SELECT " + info + " FROM  " + tbl);
            rez = "";
            while (r.next()) {
                d.addItem(r.getString(1));
            }

        } catch (SQLException e) {
            return rez;
        }
        return rez;
    }

    public String GetSearch(String info, String Search) {
        String rez = "Помилка!!!";

        try {
            if (s == null) {
                s = conn.createStatement();
            }
            ResultSet r;

            r = s.executeQuery(
                    "SELECT " + info + " FROM  " + tbl + " WHERE " + Search + " LIMIT 1");
            rez = "";
            if (r.next()) {
                return r.getString(1);
            }
        } catch (SQLException e) {
            return rez;
        }
        return rez;
    }

    public String GetData() {// метод повертає всі записи з таблиці 
        String rez = "Помилка!!!";
        int i;//кількість колонок
        try {
            if (s == null) {
                s = conn.createStatement();
            }
            // запит до БД
            ResultSet r;
            //r=s.executeQuery("SET NAMES utf8");

            r = s.executeQuery(
                    "SELECT * "
                    + "FROM  " + tbl + " WHERE 1"
            );
            ResultSetMetaData colonki = r.getMetaData();
            i = colonki.getColumnCount();//к-ть колонок

            rez = "";
            //імена стовпців з таблиці
            for (int j = 1; j <= i; j++) {
                rez += colonki.getColumnLabel(j) + " || ";
            }
            //вміст таблиці
            while (r.next()) {
                rez += "\n";
                for (int j = 1; j <= i; j++) {
                    rez += r.getString(j) + " || ";
                }
            }
        } catch (SQLException e) {
            return rez;
        }
        return rez;
    }

    public ResultSet GetDataSearch(String search) {
        ResultSet Srez = null;
        try {
            if (s == null) {
                s = (Statement) conn.createStatement();
            }
            Srez = s.executeQuery("SELECT * " + "FROM  " + tbl + " WHERE " + search);
            return Srez;
        } catch (SQLException ex) {
            Logger.getLogger(mySQL.class.getName()).log(Level.SEVERE, null, ex);
            return Srez;
        }
    }

    public ResultSet GetDataSet() { // метод поверне об’єкт НАБІР ЗАПИСІВ
        // який потiм буде використано для виведення
        //в таблицю на формі
        ResultSet Xrez = null;
        try {
            if (s == null) {
                s = (Statement) conn.createStatement();
            }
            Xrez = s.executeQuery("SELECT * " + "FROM  " + tbl);
            return Xrez;
        } catch (SQLException ex) {
            Logger.getLogger(mySQL.class.getName()).log(Level.SEVERE, null, ex);
            return Xrez;
        }
    }

    public void AddAdmin(String Name, String Pasword) {
        String mySQLquery = "INSERT INTO `tbl_admin` (`id_admin`, `name_admin`, `password_admin`) VALUES (NULL, ?, ?)";
        PreparedStatement X;
        try {
            X = (PreparedStatement) conn.prepareStatement(mySQLquery);
            X.setString(1, Name);
            X.setString(2, Pasword);
            X.execute();
        } catch (SQLException ex) {
            System.out.println(ex.fillInStackTrace());
        }
    }

    public void Add(String Column1, String Column2, String Column3, String Column4, String Column5, String Column6, String Column7) {
        try {
            String mySQLquery = "INSERT INTO `" + tbl + "` ";
            if (tbl.equals("tbl_club")) {
                mySQLquery += "(`id_club`, `competition`, `day_competition`, `venue_competition`, `distance_tbl_club`, `participants`, `judges`, `number_club`) "
                        + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";
            } else if (tbl.equals("tbl_coach")) {
                mySQLquery += "(`id_coach`, `name_coach`, `birth_coach`, `id_rank_tbl_coach`, `work_experience_coach`, `residence_coach`, `telephone_coach`, `photo_coach`) "
                        + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";
            }else if(tbl.equals("tbl_rezults")){
                mySQLquery += "(`id_rezults`, `id_club_rezults`, `id_athlete_rezults`, `id_coach_rezults`, `id_ditance_rezults`, `position_rezults`, `time_rezults`, `photo_athlete`) "
                         + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";
            }else {
                mySQLquery += "(`id_athlete`, `name_athlete`, `birth_athlete`, `id_category_tbl_athlete`, `id_coach_tbl_athlete`, `residence_athlete`, `telephone_athlete`, `photo_athlete`) "
                        + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";
            }
            PreparedStatement X = (PreparedStatement) conn.prepareStatement(mySQLquery);

            X.setString(1, Column1);
            X.setString(2, Column2);
            X.setString(3, Column3);
            X.setString(4, Column4);
            X.setString(5, Column5);
            X.setString(6, Column6);
            X.setString(7, Column7);
            X.execute();
        } catch (SQLException e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public void Edit(int id, String Column1, String Column2, String Column3, String Column4, String Column5, String Column6, String Column7) {
        try {
            String mySQLquery = "UPDATE `" + tbl + "` SET ";
            if (tbl.equals("tbl_club")) {
                mySQLquery += "`competition` =?, `day_competition` =?, `venue_competition` =?, `distance_tbl_club` =?, `participants` =?, `judges` =?, `number_club` =?"
                        + " WHERE `" + tbl + "`.`id_club` =?;";
            } else if (tbl.equals("tbl_coach")) {
                mySQLquery += "`name_coach` =?, `birth_coach` =?, `id_rank_tbl_coach` =?, `work_experience_coach` =?, `residence_coach` =?, `telephone_coach` =?, `photo_coach` =?"
                        + " WHERE `" + tbl + "`.`id_coach` =?;";
            }else if(tbl.equals("tbl_rezults")){
                mySQLquery +="`id_club_rezults` =?, `id_athlete_rezults` =?, `id_coach_rezults` =?, `id_ditance_rezults` =?, `position_rezults` =?, `time_rezults` =?, `photo_athlete` =?"
                        + " WHERE `" + tbl + "`.`id_rezults ` =?;";
            } else {
                mySQLquery += "`name_athlete` =?, `birth_athlete` =?, `id_category_tbl_athlete` =?, `id_coach_tbl_athlete` =?, `residence_athlete` =?, `telephone_athlete` =?, `photo_athlete` =?"
                        + " WHERE `" + tbl + "`.`id_athlete` =?;";
            }
            PreparedStatement X = (PreparedStatement) conn.prepareStatement(mySQLquery);

            X.setString(1, Column1);
            X.setString(2, Column2);
            X.setString(3, Column3);
            X.setString(4, Column4);
            X.setString(5, Column5);
            X.setString(6, Column6);
            X.setString(7, Column7);
            X.setInt(8, id);
            X.execute();
        } catch (SQLException e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public void del(int id, String tbla) {
        try {
            String mySQLquery = "DELETE FROM `" + tbl + "` " + "WHERE `" + tbla + "`= " + id + ";";
            conn.prepareStatement(mySQLquery);
            PreparedStatement X = (PreparedStatement) conn.prepareStatement(mySQLquery);
            X.execute();
        } catch (SQLException ex) {
            Logger.getLogger(mySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getCon() {
        return conn;
    }
}
