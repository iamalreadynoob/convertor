package gui;

import func.ListHandling;

import javax.swing.*;
import java.awt.*;

public class Positions
{

    public Positions(JFrame frame)
    {
        frame.getContentPane().setBackground(Color.BLACK);

        Screen.prompt.setBounds(20, 30, 100, 30);
        Screen.prompt.setEditable(false);
        Screen.prompt.setBackground(Color.GRAY.brighter());
        Screen.prompt.setForeground(Color.BLACK);
        Screen.prompt.setText("select file:");
        Screen.prompt.setBorder(null);
        Screen.prompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.choose.setBounds(150, 30, 100, 30);
        Screen.choose.setBorder(null);
        Screen.choose.setBackground(Color.GRAY.brighter());
        Screen.choose.setForeground(Color.BLACK);
        Screen.choose.setText("choose");

        Screen.from.setBounds(20, 80, 100, 30);
        Screen.from.setEditable(false);
        Screen.from.setBackground(Color.GRAY.brighter());
        Screen.from.setForeground(Color.BLACK);
        Screen.from.setText("from:");
        Screen.from.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.fromList.setBounds(150, 80, 100, 30);
        Screen.fromList.setBackground(Color.GRAY.brighter());
        Screen.fromList.setForeground(Color.BLACK);
        new ListHandling(Screen.fromList).fill();

        Screen.to.setBounds(20, 130, 100, 30);
        Screen.to.setEditable(false);
        Screen.to.setBackground(Color.GRAY.brighter());
        Screen.to.setForeground(Color.BLACK);
        Screen.to.setText("to:");
        Screen.to.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.toList.setBounds(150, 130, 100, 30);
        Screen.toList.setBackground(Color.GRAY.brighter());
        Screen.toList.setForeground(Color.BLACK);

        Screen.convert.setBounds(400, 80, 100, 30);
        Screen.convert.setBorder(null);
        Screen.convert.setBackground(Color.GRAY.brighter());
        Screen.convert.setForeground(Color.BLACK);
        Screen.convert.setText("convert");
    }

}
