package ch7AdapterFacade.facade;


/**
 * Created by zhang.zj on 2016/12/4.
 */
public class HomeTheaterTestDriver {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Amplifier amplifier = new Amplifier(dvdPlayer);
        Tuner tuner = new Tuner();
        PopcornPopper popcornPopper = new PopcornPopper();
        MainScreen mainScreen = new MainScreen();
        TheaterLights theaterLights = new TheaterLights();
        CdPlayer cdplayer = new CdPlayer();
        Projector projector = new Projector();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdplayer, projector, theaterLights, mainScreen, popcornPopper);

        homeTheaterFacade.watchMovie("Harry Potter and What?");
        homeTheaterFacade.endMovie();
    }
}