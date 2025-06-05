package com.finalproject;

import com.birdbrain.Finch;
public class CsaProject {



    public static void main(String[] args) {
        
      
        //Instantiates the myFinch object
        MusicFinch myFinch = new MusicFinch();

        //Plays the first portion of the song and alternates beak lights between white and purple on notes.
        myFinch.playNoteAndPause(60, 0.2);
        myFinch.setBeak(100, 100, 100);
        myFinch.playNoteAndPause(60, 0.2);
        myFinch.setBeak(100, 0, 100);
        myFinch.playNoteAndPause(58, 0.2);
        myFinch.setBeak(100, 100, 100);
        myFinch.playNoteAndPause(60, 0.5);
        myFinch.setBeak(100, 0, 100);
        myFinch.playNoteAndPause(55, 0.6);

        //Has the finch move forward and set its beak to white
        myFinch.setMove("F", 25, 100);
        myFinch.setBeak(100, 100, 100);

        //Plays the second portion of the song and alternates beak lights between white and purple on notes.
        myFinch.playNoteAndPause(55, 0.2);
        myFinch.setBeak(100, 0, 100);
        myFinch.playNoteAndPause(60, 0.2);
        myFinch.setBeak(100, 100, 100);
        myFinch.playNoteAndPause(65, 0.2);
        myFinch.setBeak(100, 0, 100);
        myFinch.playNoteAndPause(64, 0.2);
        myFinch.setBeak(100, 100, 100);
        myFinch.playNoteAndPause(60, 0.4);

        //Has the finch move back to it's starting position and turn right and left
        myFinch.setMove("B", 25, 100);
        myFinch.setTurn("R",90,100);
        myFinch.setTurn("L",180,100);

        //Changes beak lights between white, red, green, and blue rapidly
        myFinch.setBeak(100, 100, 100);
        myFinch.pause(.1);
        myFinch.setBeak(100, 0, 0);
        myFinch.pause(.1);
        myFinch.setBeak(0 , 100, 0);
        myFinch.pause(.1);
        myFinch.setBeak(0, 0, 100);
        myFinch.pause(1);

        //myFinch.stopAll();
        myFinch.disconnect();
    }
}
 