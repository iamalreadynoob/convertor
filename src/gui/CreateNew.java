package gui;

import javax.swing.*;

public class CreateNew
{

    protected CreateNew()
    {
        Screen.prompt = new JTextField();
        Screen.from = new JTextField();
        Screen.to = new JTextField();

        Screen.convert = new JButton();
        Screen.choose = new JButton();

        Screen.fromList = new JComboBox<>();
        Screen.toList = new JComboBox<>();
    }

}
