package com.tehtävä11;


class FileWriterCaretaker {

    private Object obj;

    public void save(FileWriterUtil fileWriter){
        this.obj = fileWriter.save();
    }

}
