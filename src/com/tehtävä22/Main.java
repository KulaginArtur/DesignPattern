package com.tehtävä22;

public class Main {

    public static void main(String[] args) {
        Screen screen = new Screen();
        Command screenUp = new FlipUpCommand(screen);
        Command screenDown = new FlipDownCommand(screen);
        WallButton button1 = new WallButton(screenUp);
        WallButton button2 = new WallButton(screenDown);
        button1.push();
        button2.push();
    }
}

