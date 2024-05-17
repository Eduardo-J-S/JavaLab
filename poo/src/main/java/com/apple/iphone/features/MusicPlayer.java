package com.apple.iphone.features;

import com.apple.iphone.interfaces.Feature;

public class MusicPlayer extends Feature {
    private String currentSong;
    private boolean isPlaying = false;

    public void play() {
        if (!isStarted()) {
            System.out.println("Music Player has not been started.");
            return;
        }
        if (currentSong == null) {
            System.out.println("No song selected.");
        } else {
            System.out.println("Playing song: " + currentSong);
            isPlaying = true;
        }
    }

    public void pause() {
        if (!isStarted()) {
            System.out.println("Music Player has not been started.");
            return;
        }
        if (!isPlaying) {
            System.out.println("Song is not playing yet.");
            return;
        }
        System.out.println("Song paused.");
        isPlaying = false;
    }

    public void selectSong(String song) {
        if (!isStarted()) {
            System.out.println("Music Player has not been started.");
            return;
        }
        this.currentSong = song;
        System.out.println("Selected song: " + song);
    }
}
