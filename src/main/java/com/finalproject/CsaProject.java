package com.finalproject;

import com.birdbrain.Finch;
public class CsaProject {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.playNote(60, 16);
        myFinch.pause(0.6);

        // myFinch.playNote(58, 16);
        // myFinch.pause(0.3);

        myFinch.playNote(60, 16);
        myFinch.pause(0.6);

        myFinch.playNote(55, 16);
        myFinch.pause(0.9);

        myFinch.stopAll();
        myFinch.disconnect();
    }
}
 