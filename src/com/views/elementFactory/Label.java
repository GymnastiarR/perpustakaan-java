package com.views.elementFactory;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(int y, String text){
        setText(text);
        setBounds(30, y, 400, 30);
        setFont(new Font("Poppins", Font.PLAIN, 20));
    }

    public Label(int y, int height, int size, String text){
        setText(text);
        setBounds(30, y, 400, height);
        setFont(new Font("Poppins Medium", Font.PLAIN, size));
    }
}