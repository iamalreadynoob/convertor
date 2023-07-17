package func;

public class Convert
{

    public Convert(String from, String to, String path)
    {
        if (from.equals("webp")) new WebpHandling(to, path);
    }

}
