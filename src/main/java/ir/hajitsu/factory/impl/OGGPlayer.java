package ir.hajitsu.factory.impl;

import ir.hajitsu.factory.Player;
import ir.hajitsu.factory.exception.MediaPlayerException;
import org.newdawn.easyogg.OggClip;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OGGPlayer implements Player {
    private String mediaPath;

    public OGGPlayer(String mediaPath) {
        this.mediaPath = mediaPath;
    }

    @Override
    public void play() throws MediaPlayerException {
        try {
            FileInputStream file = new FileInputStream(mediaPath);
            OggClip ogg = new OggClip(file);
            ogg.play();
        } catch (Exception e) {
            throw new MediaPlayerException(e);
        }
    }
}
