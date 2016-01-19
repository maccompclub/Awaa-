class entity
{
    int positionx;
    int positiony;
    boolean passable;
    int slow;
    enemy Enemy;
    npc NPC;
    character CHAR;
    char drawData;
    int colourData;
    
    public entity (String spawnInfo)
    {
        //"Type;chunkx;chunky;posx;poy;drawTile;drawColour"
        String [] data = spawnInfo.split(';');
        if (data[0].equalsIgnoreCase("Enemy"))
        {
            NPC = null;
            CHAR =null;
            try {
            Enemy = new enemy (data[5].charAt(0),data[6]);    
            positionx= Integer.parseInt(data[3]);
            positiony= Integer.parseInt(data[4]);
            
            
            } catch (Exception e){}
        }
        if (data[0].equalsIgnoreCase("NPC"))
        {
            
        }
        if (data[0].equalsIgnoreCase("Character"))
        {
            
        }
        positionx = ene.posx;
        positiony = ene.posy;
        passable = false;
    }


    public entity (terrain tera)
    {
        positionx = tera.posx;
        positiony = tera.posy;
        passable = tera.pass;
    }
    
   /* public static void updatePos(int deltaX,int deltaY)
    {
        positionx+=deltaX;
        positiony+=deltaY;
    }*/
}


