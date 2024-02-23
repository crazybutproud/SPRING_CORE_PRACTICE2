package ru.anna.musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music beanMusic = classPathXmlApplicationContext.getBean("musicBean",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(beanMusic); //внедряем зависимость вручную с помощью конструктора
        musicPlayer.playMusic(); //использует зависимость чтобы реализовать метод

        classPathXmlApplicationContext.close();
    }
}
