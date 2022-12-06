package ir.hajitsu.factory;

import ir.hajitsu.factory.impl.MP3Player;
import ir.hajitsu.factory.impl.OGGPlayer;

import java.text.MessageFormat;
import java.util.Objects;

public class PlayerFactory {

    public Player getPlayerInstance(String filePath, Player.MediaType type) {
        Objects.requireNonNull(filePath);
        Objects.requireNonNull(type);

        Player player = null;
        switch (type) {
            case MP3:
                player = new MP3Player(filePath);
                break;

            case OGG:
                player = new OGGPlayer(filePath);
                break;
            default:
                throw new IllegalStateException(MessageFormat.format("Type {0} not implemented yet.", type.name()));
        }
        return player;
    }
}
