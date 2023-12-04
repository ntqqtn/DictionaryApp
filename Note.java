package com.example.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Note extends Word{
    protected ArrayList<Word> note = new ArrayList<>();
//    HashMap<String, String> note = new HashMap<>();
//
//    public void addWord(String target, String explain){
//        note.put(target, explain);
//    }
//
//    public void deleteWord(String target){
//        note.remove(target);
//    }
//
//    public void updateWord(String target, String explain){
//        note.remove(target);
//        note.put(target, explain);
//    }
//
//    public void Print(){
//        for(String target : note.keySet()){
//            System.out.println(target +": " + note.get(target));
//        }
//    }
//
//    public static void main(String[] args) {
//        Note my_note = new Note();
//        Scanner scan = new Scanner(System.in);
//
//        for (int i=1; i<=100; i++){
//
//            int opt = scan.nextInt();
//            scan.nextLine();
//            switch (opt){
//                case 1:{
//                    String t = scan.nextLine();
//                    String e = scan.nextLine();
//                    my_note.addWord(t, e);
//                    break;
//                }
//                case 2:{
//                    String t = scan.nextLine();
//                    String e = scan.nextLine();
//                    my_note.updateWord(t, e);
//                    break;
//                }
//                case 3:{
//                    String t = scan.nextLine();
//                    my_note.deleteWord(t);
//                    break;
//                }
//                case 4:{
//                    my_note.Print();
//                    break;
//                }
//            }
//        }
//    }
}

//import java.sql.*;
//import java.util.LinkedList;
//
//public class Dictionary {
//    private final int sizeHashTable = 1023;
//
//    protected LinkedList<Word>[] hashElement = new LinkedList[sizeHashTable];
//
//    // ham hashFunction
//    public int hashFunction(int key) {
//        return key % sizeHashTable;
//    }
//
//    // hash Table
//    public void createHashTable(){
//        for (int i = 0; i < sizeHashTable; i++) {
//            hashElement[i] = new LinkedList<>();
//        }
//        String jdbcUrl = "jdbc:sqlite:dict_hh.db";
//
//        try {
//            // ket noi voi sqlite va dict
//            Connection connection = DriverManager.getConnection(jdbcUrl);
//            // cau lenh muon lay du kieu gi???
//            String sql = "SELECT * FROM av";
//            // gui query den sqlite
//            Statement statement = connection.createStatement();
//            // thuc thi cau lenh va tra ve resultSet
//            ResultSet result = statement.executeQuery(sql);
//
//            while(result.next()) {
//                int id = result.getInt("id");
//                String word = result.getString("word");
//                String pronounce = result.getString("pronounce");
//                String html = result.getString("html");
//                String description = result.getString("description");
//
//                Word createdWord = new Word(id, word, pronounce, html, description);
//
//                int index = hashFunction(id);
//                hashElement[index].add(createdWord);
//            }
//        } catch (SQLException var8) {
//            System.out.println("Error connecting to SQLite database");
//            var8.printStackTrace();
//        }
//
//    }
//}
