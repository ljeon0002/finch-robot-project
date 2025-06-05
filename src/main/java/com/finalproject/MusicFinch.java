package com.finalproject;

import com.birdbrain.Finch;

//Creates the MusicFinch class, which extends the Finch class
public class MusicFinch extends Finch {
    
    //Method for played a note on the midi scale for a specified number of second (beats) with a pause after the note is played
    public void playNoteAndPause(int note, double beats)
    {
        playNote(note, beats);
        pause(beats + .1);
    }
}
