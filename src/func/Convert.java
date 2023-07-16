package func;

public class Convert
{

    public Convert(Types from, Types to, String path)
    {
        switch (from)
        {
            case WEBP: new WebpHandling(to, path); break;
        }
    }

    public enum Types
    {
        WEBP, PNG, JPG
    }

}
