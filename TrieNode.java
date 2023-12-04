package com.example.project;

import java.util.HashMap;

public class TrieNode{
    protected HashMap<Character, TrieNode> children = new HashMap<>();
    protected boolean isEndOfWord = false;
    protected String word;
    protected String pronounce;
    protected String html;
    protected String description;
    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public TrieNode(){
        isEndOfWord = false;
    }
}
