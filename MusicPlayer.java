package ru.anna.musicPlayer;

public class MusicPlayer { //применяем инверсию управления IoC
    private Music music;

    public MusicPlayer(Music music) { //1.используем полиморфизм.внедряем зависимость извне(IoC)
        this.music = music;
    }
    //    <bean id="musicPlayerBean"
    //           class="ru.anna.musicPlayer.MusicPlayer">
    //        <constructor-arg ref="musicBean"/>
    //    </bean>

    public void playMusic() {
        System.out.println("Играет - " + music.getSong());
    }

    public void setMusic(Music music) { //2.через сеттер добавляем зависимость(ссылочное значение)
        this.music = music;
    }
    //    <bean id="musicPlayerBean"
    //           class="ru.anna.musicPlayer.MusicPlayer">
    //        <property name="music" ref="musicBean"/> //спринг откидывает начало метода set и ищет по второму слову.поэтому name=music(присваиваем бин с музыкой)
    //    </bean>

    public MusicPlayer() {
    } //для работы и создания нужен пустой конструктор

    private String name; //3.задаем точные значения полям через сеттеры
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
//    <bean id="musicPlayerBean"
//           class="ru.anna.musicPlayer.MusicPlayer">
//        <property name="music" ref="musicBean"/>
//
//        <property name="name" value="Some name"/>
//        <property name="volume" value="100"/>
//    </bean>

    ///4.работа через properties

    //<context:property-placeholder location="classpath:musicPlayer.properties"/>

    //    <bean id="musicPlayerBean"
    //           class="ru.anna.musicPlayer.MusicPlayer">
    //        <property name="music" ref="musicBean"/>
    //
    //        <property name="name" value="${musicPlayer.name}"/>
    //        <property name="volume" value="${musicPlayer.volume}"/>
    //    </bean>

}
