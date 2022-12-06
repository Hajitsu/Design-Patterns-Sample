package ir.hajitsu.factory;

import ir.hajitsu.factory.impl.MP3Player;
import ir.hajitsu.factory.impl.OGGPlayer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerFactoryTest {

    @Test
    void getPlayerInstance() throws Exception {
        PlayerFactory playerFactory = new PlayerFactory();

        Player mp3PlayerInstance = playerFactory.getPlayerInstance("/Users/hajitsu/Downloads/Audio_General_11_Isfahanlanguagecenter.ir/IELTS11_Test2_Section2.mp3", Player.MediaType.MP3);
        Assert.assertTrue(mp3PlayerInstance instanceof MP3Player);
//        mp3PlayerInstance.play();

        Player oggPlayerInstance = playerFactory.getPlayerInstance("", Player.MediaType.OGG);
        Assert.assertTrue(oggPlayerInstance instanceof OGGPlayer);
//        oggPlayerInstance.play();
    }
}