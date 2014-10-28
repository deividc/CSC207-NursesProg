import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRecorder
{
    public boolean fileRecorder(String filename, String data)
    {
        try (PrintStream out = new PrintStream(new FileOutputStream(filename))) {
            out.print(data);
        }
        catch ( IOException e)
        {
            return false;
        }
        
        return true;
    }
}
