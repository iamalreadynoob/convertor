package gui;

import javax.swing.*;

public class Add
{

    protected Add(JFrame frame)
    {
        frame.add(Screen.prompt);
        frame.add(Screen.from);
        frame.add(Screen.to);
        frame.add(Screen.info);
        frame.add(Screen.convert);
        frame.add(Screen.choose);
        frame.add(Screen.fromList);
        frame.add(Screen.toList);
    }

}
