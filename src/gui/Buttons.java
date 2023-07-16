package gui;

import func.Convert;
import func.ListHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Buttons
{

    public Buttons(JFrame frame)
    {
        Screen.convert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {

            }
        });

        Screen.choose.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(frame);

                if (value == JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser.getSelectedFile();
                    //TODO: fill
                    //new Convert()
                }
            }
        });

        Screen.fromList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new ListHandling(Screen.fromList, Screen.toList).handle();
            }
        });
    }

}
