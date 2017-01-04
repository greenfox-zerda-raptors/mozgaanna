package com.greenfoxacademy;


/**
 * Created by mozgaanna on 20/12/16.
 */



public class Todo {

    public int getId() {
        return id;
    }

    int id;
    String title;
    boolean isUrgent;
    boolean isDone;

    public Todo(int id, String title, boolean isDone, boolean isUrgent){
        this.id = id;
        this.title = title;
        this.isDone = isDone;
        this.isUrgent = isUrgent;
    }

    public Todo(){
    }

    public Todo(int id, String title){
        this.id = id;
        this.title = title;
    }



    public String getTitle() {
        return title;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsUrgent(boolean isUrgent) {
        isUrgent = isUrgent;
    }

    public void setIsDone(boolean isDone) {
        isDone = isDone;
    }

//    @Override
//    public String toString() {
//        return "Todo{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", isUrgent=" + isUrgent +
//                ", isDone=" + isDone +
//                '}';
//    }
}
