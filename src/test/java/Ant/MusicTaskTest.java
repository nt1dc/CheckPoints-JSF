package Ant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicTaskTest {

    @Test
    void playSound() {
        MusicTask task = new MusicTask();
        task.musicFilepath = "sounds/kurtangle.wav";
        task.playSound();
    }
}