package func;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WebpHandling
{

    protected WebpHandling(Convert.Types to, String path)
    {
        switch (to)
        {
            case PNG: toPng(path); break;
        }
    }

    private void toPng(String path)
    {
        String newPath = path.split("/")[path.split("/").length - 1].split("\\.")[0];

        File input = new File(path);
        File output = new File(newPath);

        try
        {
            BufferedImage webp = ImageIO.read(input);

            BufferedImage png = new BufferedImage(webp.getWidth(), webp.getHeight(), BufferedImage.TYPE_INT_ARGB);
            png.getGraphics().drawImage(webp, 0, 0, null);
            ImageIO.write(png, "png", output);
        }
        catch (IOException e){e.printStackTrace();}
    }

}
