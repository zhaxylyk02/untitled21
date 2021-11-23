package com.company;
public class Main {
    public static void main(String[] args) {
        Struna guitar = new Struna("Classic guitar" ,6);
        Grif guitar2 = new Grif("Electric guitar", 4);
        guitar.play();
        guitar.nastroika();
        guitar.ZamenaStruni();
        guitar2.nastroika();
        guitar2.ZamenaStruni();
    }
}
