package com.tehtävä22;

public class FlipDownCommand implements Command {

    private Screen screen;

    public FlipDownCommand(Screen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.screenDown();
    }
}