package com.company;
public class Grif {
    private String name;
    public int count;
    public Grif(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public void nastroika() {
        System.out.println( name + " nastraivaetsya");
    }
    public void ZamenaStruni() {
        System.out.println( count + " struna zamenayetsa");
    }
}
