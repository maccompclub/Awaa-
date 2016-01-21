import java.io.*;
class SFile_RW
{
    public String readSave ()
    {
        String saveState = "";
        return saveState;
    }


    static int charx = 50, chary = 40;

    public static String [] loadreality (int toplchunkx, int toplchunky)
    {
        String[] reality = new String [1];
        String currentLoad = "";
        currentLoad = (toplchunkx) + " " + (toplchunky) + ".txt";
        try
        {
            BufferedReader currentRead = new BufferedReader (new FileReader (currentLoad));
            reality = new String [Integer.parseInt (currentRead.readLine ()) + 1];
            reality [0] = currentRead.readLine ();
            for (int i = 1 ; i < reality.length ; i++)
            {
                reality [i] = currentRead.readLine ();
            }
        }
        catch (Exception e)
        {
        }
        return reality;
    }


    public static String[] [] adjust (String input)
    {
        String[] inpoot = input.split (" ");
        String[] [] chuck = new String [50] [40];
        for (int i = 0 ; i < 40 ; i++)
        {
            for (int z = 0 ; z < 50 ; z++)
            {
                chuck [z] [i] = inpoot [z + 50 * i];
            }

        }
        return chuck;
    }


    public static void writeSave (String[] [] saveState, String saveFile)
    {
        try
        {
            FileWriter fiw = new FileWriter (saveFile);
            PrintWriter prw = new PrintWriter (fiw);
            for (int i = 0 ; i < 40 ; i++)
            {
                for (int z = 0 ; z < 50 ; z++)
                {
                    prw.print (saveState [z] [i] + " ");
                }
            }
        }
        catch (Exception e)
        {
        }
    }
}
