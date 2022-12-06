package ir.hajitsu.factory.impl;

import ir.hajitsu.factory.Player;
import ir.hajitsu.factory.exception.MediaPlayerException;

import java.io.File;
import java.io.FileInputStream;

public class MP3Player implements Player {

    private String mediaPath;

    public MP3Player(String mediaPath) {
        this.mediaPath = mediaPath;
    }

    @Override
    public void play() throws MediaPlayerException {
        try {
            new Thread(() -> {
                try {
                    final javazoom.jl.player.Player p = new javazoom.jl.player.Player(new FileInputStream(mediaPath));
                    p.play();
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            });
        } catch (Exception e) {
            throw new MediaPlayerException(e);
        }
    }
}
