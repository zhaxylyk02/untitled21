package com.company;
public class Struna {
    private String name;
    public int count;
    public Struna(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public void play() {
        System.out.println( name + " is playing");
    }
    public void nastroika() {
        System.out.println( count + " struna nastraivaetsya");
    }
    public void ZamenaStruni() {
        System.out.println( count + " struna zamenayetsa");
    }
    @Override
    public String toString() {
        return "Struna : '" + name + "'";
    }
}