package com.greenfoxacademy.java.lessons.beans;

/**
 * Created by mozgaanna on 21/12/16.
 */
public class WithFries {
    boolean flSalted = true;

    public WithFries(boolean flSalted) {
        this.flSalted = flSalted;
    }

    public WithFries() {
    }

    @Override
    public String toString() {
        return (flSalted? "Salted" : "Unassaulted");
    }

    public void toggleFlSalted() {
        this.flSalted = ! this.flSalted;
    }
}
