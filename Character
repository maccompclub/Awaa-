import java.io.*;
class character
{
    public statis String name;
    public static int strh;
    public static int inte;
    public static int dext;
    public static int luck;
    public static int survival;
    public static int tech;
    public static int combat;
    public static int maxhealth;
    public static int currenthealth;
    public static int posx;
    public static int posy;
    public static int chunkx;
    public static int chunky;

    public character (int strh, int inte, int dext, int luck)
    {
        chunkx = 0;
        chunky = 0;
        this.strh = strh;
        this.inte = inte;
        this.dext = dext;
        this.luck = luck;
    }


    public character (String name)
    {
        try
        {
            BufferedReader read = new BufferedReader (new FileReader (name + ".txt"));
            name=name;
            chunkx = Integer.parseInt (read.readLine ());
            chunky = Integer.parseInt (read.readLine ());
            posx = Integer.parseInt (read.readLine ());
            posy = Integer.parseInt (read.readLine ());
            strh = Integer.parseInt (read.readLine ());
            inte = Integer.parseInt (read.readLine ());
            dext = Integer.parseInt (read.readLine ());
            luck = Integer.parseInt (read.readLine ());
            survival = Integer.parseInt (read.readLine ());
            tech = Integer.parseInt (read.readLine ());
            combat = Integer.parseInt (read.readLine ());
            maxhealth=Integer.parseInt(read.readLine());
            currenthealth=Integer.parseInt(read.readLine());
        }
        catch (Exception e)
        {
        }
    }
    public static void save()
    {
    PrintWriter saver = new PrintWriter(new FileWriter(name+".txt"));
    saver.printLine(chunkx);
    saver.printLine(chunky);
    saver.printLine(posx);
    saver.printLine(posy);
    saver.printLine(strh);
    saver.printLine(inte);
    saver.printLine(dext);
    saver.printLine(luck);
    saver.printLine(survival);
    saver.printLine(tech);
    saver.printLine(combat);
    saver.printLine(maxhealth);
    saver.printLine(currenthealth);
    }


    public String toString ()
    {
        return "Current location:(" + chunkx + "," + chunky + ")\nStrength: " + strh + "\nIntelligence: " + inte + "\nDexterity: " + dext + "\nLuck: " + luck;
    }


    public static boolean cook ()
    {
        if (survival >= 3 && inte >= 5 && dext >= 5)
        {
            double lmao = Math.random () * (101);
            if (lmao < (inte + dext) * survival)
            {
                return true;
            }
        }
        return false;
    }


    public static boolean crit ()
    {
        if (combat > 2 && luck > 5)
        {
            double lmao = Math.random () * (101);
            if (lmao < luck * combat)
            {
                return true;
            }
        }
        return false;
    }
}
