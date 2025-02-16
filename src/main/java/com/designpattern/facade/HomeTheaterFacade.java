package com.designpattern.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    // 기타 메소드
    public void watchMovie(String movie) {
        //영화를 보기위한 모든 메소드를 구현
        System.out.println("Watching movie " + movie);
        popper.on();
        popper.off();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        //홈시어터 종료
        System.out.println("Ending movie");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.off();
    }
}
