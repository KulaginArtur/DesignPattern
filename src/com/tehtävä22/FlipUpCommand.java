package com.tehtävä22;

public class FlipUpCommand implements Command {

    private Screen screen;

    public FlipUpCommand(Screen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.screenUp();
    }
}
