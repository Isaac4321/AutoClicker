package main;

import java.awt.*;
import java.awt.event.InputEvent;

public class Driver {

    private Robot robot;

    public Driver() throws AWTException {
        robot = new Robot();
    }

    public void rightClick(int milliseconds) throws InterruptedException {

        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(milliseconds);

    }

    public void leftClick(int milliseconds) throws InterruptedException {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(milliseconds);
    }

}
