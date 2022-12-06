package ir.hajitsu.factory;

import ir.hajitsu.factory.exception.MediaPlayerException;

public interface Player {
    void play() throws MediaPlayerException;

    enum MediaType {
        MP3,
        OGG
    }
}
