package com.solidprinciples.SRP;

class RadioSRP {
    String song;
    public RadioSRP() {
    }

    //RadioSRP is following SRP because it has one responsibility which is to changeMusic
    public void changeMusic(String newSong){
        setSong(newSong);
        System.out.printf("Playing song %s", newSong);
    }

    public String getSong() {
        return song;
    }

    private void setSong(String song) {
        this.song = song;
    }
}