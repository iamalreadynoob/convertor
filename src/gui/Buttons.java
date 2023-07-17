package gui;

import func.Convert;
import func.ListHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Buttons
{
    private String absPath;

    public Buttons(JFrame frame)
    {
        Screen.convert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                if (Screen.fromList.getSelectedItem() != null &&
                Screen.toList.getSelectedItem() != null)
                {
                    new Convert(Screen.fromList.getSelectedItem().toString(),
                            Screen.toList.getSelectedItem().toString(),
                            absPath);
                }
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
                    absPath = chooser.getSelectedFile().getAbsolutePath();
                    Screen.info.setText("The \"" + chooser.getSelectedFile().getAbsolutePath() + "\" located file has been chosen.");
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
