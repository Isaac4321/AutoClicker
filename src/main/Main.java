package main;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main(String... args) throws NativeHookException, AWTException {

        GlobalScreen.registerNativeHook();
        GlobalScreen.addNativeKeyListener(new KeyListener());

    }

}
