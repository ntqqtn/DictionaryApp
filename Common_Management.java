package com.example.project;

public class Common_Management extends Note{
    public void add(Word word){
        note.add(word);
    }

    public void update(Word word){
        String w_target = word.getWord_target();
        String w_update_explain = word.getWord_explain();
        for (Word w : note) {
            if (w_target.equalsIgnoreCase(w.getWord_target())) {
                w.setWord_explain(w_update_explain);
                break;
            }
        }
    }

    public void delete(Word word){
        String w_target = word.getWord_target();
//        for(int i=0; i<note.size(); i++){
//            if(w_target.equalsIgnoreCase(note.get(i).getWord_target())){
//                note.remove(i);
//                break;
//            }
//        }
        for(Word w : note){
            if(w_target.equalsIgnoreCase(w.getWord_target())){
                note.remove(w);
                break;
            }
        }
    }
}
