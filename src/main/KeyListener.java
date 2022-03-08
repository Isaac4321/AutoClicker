package main;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.awt.*;

public class KeyListener implements NativeKeyListener {

    private Driver driver = new Driver();


    private ThreadTest thread1 = new ThreadTest();

    public KeyListener() throws AWTException {
    }

    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
    }

    public void nativeKeyPressed(NativeKeyEvent nativeEvent) {

        if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_CONTROL) {
            thread1.start();
        }

        if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_ALT) {
            try {
                thread1.interrupt();
                GlobalScreen.unregisterNativeHook();

            } catch (NativeHookException e) {

            }
        }

    }

    public void nativeKeyReleased(NativeKeyEvent nativeEvent) {
    }

}
