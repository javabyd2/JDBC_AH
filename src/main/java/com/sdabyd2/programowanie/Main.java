package com.sdabyd2.programowanie;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection connection = DBConnector.getConnection();
        Statement statement = null;
        try {
            statement= connection.createStatement();
            String sql = "select * from customer";
            ResultSet resultSet = statement.executeQuery(sql);
            /*
            while(resultSet.next()){
                System.out.println("Imie: " + resultSet.getString("fist_name") + " email: "
                        + resultSet.getString("email"));
            String sql1 = "select * from car where mark<>'Opel'";
            ResultSet resultSet1 = statement.executeQuery(sql1);
            while (resultSet1.next()){
                System.out.println("Car wyjety" + resultSet1.getString("mark"));
            }/*
            String insert = "insert into car (reg_number, mark, model, rate) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1,"TKI 1GY1");
            preparedStatement.setString(2,"Volkswagen");
            preparedStatement.setString(3,"Sharan");
            preparedStatement.setInt(4,4);
            preparedStatement.executeUpdate();*/

            String sql2 = "select * from car";
            ResultSet resultSet1 = statement.executeQuery(sql2);
            while(resultSet1.next()) {
                System.out.println("Numer rejestracyjny: " + resultSet1.getString("reg_number") + " "
                        + resultSet1.getString("mark") + " " + resultSet1.getString("model")
                + " " + resultSet1.getInt("rate"));
            }/*
            String sql3 ="update car set mark = ?, model = ? where reg_number = 'CTU 1290'";
            PreparedStatement preparedStatement = connection.prepareStatement(sql3);
            preparedStatement.setString(1,"Volkswagen");
            preparedStatement.setString(2,"Garbus");
            preparedStatement.executeUpdate();*/

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //DBConnector.closeConnection();
        }
    }
}
