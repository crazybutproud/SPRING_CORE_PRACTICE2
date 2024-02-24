package ru.anna.musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //Music beanMusic = classPathXmlApplicationContext.getBean("musicBean",Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(beanMusic); //внедряем зависимость вручную с помощью конструктора

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayerBean",MusicPlayer.class); //метод с dependencies injection

        musicPlayer.playMusic(); //использует зависимость чтобы реализовать метод

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        classPathXmlApplicationContext.close();
    }
}
