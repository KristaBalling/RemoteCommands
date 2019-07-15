package com.theironyard;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hotTub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
