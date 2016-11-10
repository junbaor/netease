package com.junbaor.netease.model.record;

public class Weekdata {

    private int playcount;
    private int score;
    private Song song;

    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }

    public int getPlaycount() {
        return playcount;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Song getSong() {
        return song;
    }

}