package main;

import java.awt.*;

public class ThreadTest extends Thread {

    private Driver driver = new Driver();
    private boolean running = true;


    public ThreadTest() throws AWTException {
    }

    @Override
    public void run() {
        while (running) {
            try {
                driver.leftClick(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void interrupt() {
        running = false;
    }
}
