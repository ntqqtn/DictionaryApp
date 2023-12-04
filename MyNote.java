package com.example.project;

public class MyNote extends Common_Management{
    public void showMyNote(){
        for(Word w : note){
            System.out.println(w.getWord_target() + " | " + w.getWord_explain());
        }
    }

    public static void main(String[] args) {
        MyNote mn = new MyNote();
        Word w1 = new Word("nice", "xinh dep");
        Word w2 = new Word("lazy", "luoi bieng");
        Word w3 = new Word("hard", "cham chi");
        mn.add(w1);
        mn.add(w2);
        mn.add(w3);
        mn.update(new Word("lazy", "luoi"));
        mn.delete(new Word("nice", "xinh dep"));
        mn.showMyNote();
    }
}
