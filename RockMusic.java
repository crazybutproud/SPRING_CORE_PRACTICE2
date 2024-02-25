package ru.anna.musicPlayer;

public class RockMusic implements Music{
    public String getSong() {
        return "Симфония разрушения";
    }

    public void doMyInit () {
        System.out.println("Doing my init...");
    }
    public void doMyDestroy () {
        System.out.println("Doing my destroy...");
    }

    private RockMusic() {
    }
    public static RockMusic getRockMusic () {
        return new RockMusic();
    }
}
