package ru.anna.musicPlayer;

public class MusicPlayer { //применяем инверсию управления IoC
    private Music music;

    public MusicPlayer(Music music) { //используем полиморфизм.внедряем зависимость извне(IoC)
        this.music = music;
    }
    public void playMusic () {
        System.out.println("Играет - " + music.getSong());
    }
}
