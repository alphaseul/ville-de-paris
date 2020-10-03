package com.paris;

import com.vaadin.flow.component.notification.Notification;

import java.io.*;
import java.sql.*;



public class connectData {

    private Connection con ;
    private Statement stmt ;


    public connectData(String dataBase) {
        String url = "jdbc:postgresql://localhost:5432/" + dataBase;
        String user = "postgres";
        String password = "alpha";
        stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            Notification.show("jdbc:odbc Drive Failed");
        }
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
        } catch (SQLException e) {
            Notification.show("Connection Failed ");
        }

    }
    public void executeData(String request){
        try{
            stmt.execute(request);
            stmt.close();
            Notification.show("Data save");
        }catch (SQLException e){
            Notification.show("Error");
        }
    }
    public void executeQueryData(String request){
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(request);
            while(rs.next()){
                String nom = rs.getString("nom");
                String code = rs.getString("code");
            }
            stmt.close();
        } catch (SQLException e) {
            Notification.show("Data access Failed");
        }
    }
    public void exportData( String csvFilePath, String request ){
        try{
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));
            ResultSet rs = stmt.executeQuery(request);
            fileWriter.write("Nom,Code");
            while(rs.next()){
                fileWriter.newLine();
                String nom = rs.getString("Nom");
                String code = rs.getString("code");
                String line = String.format("%s,%s",nom,code);
                fileWriter.write(line);
            }
            stmt.close();
            fileWriter.close();
            Notification.show("Data Export to "+csvFilePath);
        } catch (SQLException | IOException e) {
            Notification.show("Data save Failed");
        }
    }
    public void ImportData(String csvFilePath, DataTable dataTable){
        try{
            con.setAutoCommit(false);
            String sql = dataTable.insertInToData();
            PreparedStatement statement = con.prepareStatement(sql);
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText ;
            lineReader.readLine();

            while((lineText = lineReader.readLine()) != null){
                String[] data = lineText.split(",");
                String Nom = data[0];
                String code = data[1];
                statement.setString(1, Nom);
                statement.setString(2, code);
                statement.addBatch();
                statement.executeBatch();
            }
            lineReader.close();
            statement.executeBatch();
            con.commit();
            con.close();
            Notification.show("Import success");
        }catch (Exception e){
            Notification.show("Import failed");
        }
    }
}
