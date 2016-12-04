package ch7AdapterFacade.facade;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdplayer;
    Projector projector;
    TheaterLights theaterLights;
    MainScreen mainScreen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdplayer, Projector projector, TheaterLights theaterLights, MainScreen mainScreen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdplayer = cdplayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.mainScreen = mainScreen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie ...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        mainScreen.down();
        popcornPopper.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){

        System.out.println("movie end ...");
        popcornPopper.off();
        theaterLights.on();
        mainScreen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
