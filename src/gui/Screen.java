package gui;

import javax.swing.*;

public class Screen extends JFrame
{

    protected static JTextField prompt, from, to;
    protected static JButton convert, choose;
    protected static JComboBox<String> fromList, toList;

    public Screen()
    {
        this.setSize(640, 360);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("convertor");

        new CreateNew();
        new Add(this);
        new Positions(this);
        new Buttons(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
