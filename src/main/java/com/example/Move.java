package com.example;

import com.birdbrain.Finch;

public class Move {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.setMove("F", 200, 100);

        myFinch.stopAll();
        myFinch.disconnect();
    }
}
