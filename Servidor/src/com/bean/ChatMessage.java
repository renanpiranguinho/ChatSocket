package com.bean;

import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ChatMessage implements Serializable {
    
    private String name;
    private String text;
    private boolean sex;
    private String nameReserved;
    private Set<String> setOnlines = new HashSet<String>();
    private Action action;

    public String getName() {
        return name;
    }
    public boolean getSex(){
        return sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(boolean sex){
        this.sex = sex;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNameReserved() {
        return nameReserved;
    }

    public void setNameReserved(String nameReserved) {
        this.nameReserved = nameReserved;
    }

    public Set<String> getSetOnlines() {
        return setOnlines;
    }

    public void setSetOnlines(Set<String> setOnlines) {
        this.setOnlines = setOnlines;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
    
    public enum Action{
        CONNECT, DISCONNECT, SEND_ONE, SEND_ALL, USERS_ONLINE;
    }
}