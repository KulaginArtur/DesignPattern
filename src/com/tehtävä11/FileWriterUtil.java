package com.tehtävä11;

public class FileWriterUtil {

    private final String fileName;
    private int content;

    public FileWriterUtil(String file) {
        fileName = file;
    }

    public String toString(){
        return String.valueOf(content);
    }

    public Object save(){
        return new Memento(this.fileName, this.content);
    }

    public void join(){
        content = (int)(10.0 * Math.random());
    }

    public boolean guess(int guess){
        return guess != content;
    }

    public static class Memento {

        private String fileName;
        private int content;

        public Memento(String file, int content){
            this.fileName = file;
            this.content = content;
        }

    }
}