package Ant;

import lombok.Data;
import org.junit.jupiter.api.Test;
@Data
public class MusicTaskTest {

    @Test
    void playSound() {
        MusicTask task = new MusicTask();
        task.musicFilepath = "sounds/kurtangle.wav";
        task.playSound();
    }
}