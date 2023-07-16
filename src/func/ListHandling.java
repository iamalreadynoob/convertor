package func;

import javax.swing.*;

public class ListHandling
{
    private JComboBox<String> fromList, toList;
    public ListHandling(JComboBox<String> fromList, JComboBox<String> toList)
    {
        this.fromList = fromList;
        this.toList = toList;
    }

    public ListHandling(JComboBox<String> fromList)
    {
        this.fromList = fromList;
    }

    public void handle()
    {
        if (fromList.getSelectedItem() != null)
        {
            if (fromList.getSelectedItem().toString().equals("webp"))
            {
                clear();
                toList.addItem("jpg");
                toList.addItem("png");
            }
        }

    }

    public void fill()
    {
        fromList.addItem("webp");
        fromList.setSelectedItem(null);
    }

    private void clear() {while (toList.getItemCount() > 0) toList.remove(0);}

}
