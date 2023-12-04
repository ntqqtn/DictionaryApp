package com.example.project;

import java.sql.*;
import java.util.Scanner;

public class Dictionary extends Trie{
    TrieNode root = new TrieNode();
    public void createDictionary(){
        String jdbcUrl = "jdbc:sqlite:dict_hh.db";

        try {
            // ket noi voi sqlite va dict
            Connection connection = DriverManager.getConnection(jdbcUrl);
            // cau lenh muon lay du kieu gi???
            String sql = "SELECT * FROM av";
            // gui query den sqlite
            Statement statement = connection.createStatement();
            // thuc thi cau lenh va tra ve resultSet
            ResultSet result = statement.executeQuery(sql);

            while(result.next()) {
                String word = result.getString("word");
                String pronounce = result.getString("pronounce");
                String html = result.getString("html");
                String description = result.getString("description");

                insert(word, pronounce, html, description);

            }
        } catch (SQLException var8) {
            System.out.println("Error connecting to SQLite database");
            var8.printStackTrace();
        }
    }
    // test thử cách hoạt động của từu điển
    public static void main(String[] args) {
        Dictionary dictAV = new Dictionary();
        dictAV.createDictionary();

        while(true){
            Scanner scanner = new Scanner(System.in);
            String findWord = scanner.nextLine();



            long startTime = System.currentTimeMillis();
            for(String s:dictAV.predictList(/*dictAV.root,*/ findWord)){
                System.out.println(s);
            };
            dictAV.search(findWord);

//            ArrayList<String> predict = dict.getPredictWords(root, 100);
//            for(String w:predict){
//                System.out.println(w);
//            }
            long endTime = System.currentTimeMillis();
            // Ghi lại thời điểm kết thúc


            // Tính và hiển thị thời gian chạy (đơn vị: milliseconds)
            long executionTime = endTime - startTime;
            System.out.println("Thời gian chạy: " + executionTime + " milliseconds");
        }
    }
}
