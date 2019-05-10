package cc.moecraft.school.chapter1;

import javax.swing.*;

public class DialogViewer16
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.printf("Hello, %s!", name);
    }
}
