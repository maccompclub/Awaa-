class entity
{
    int positionx;
    int positiony;
    boolean passable;
    int slow;
    public entity (character player)
    {
        positionx = player.posx;
        positiony = player.posy;
        passable = false;
    }


    public entity (enemy ene)
    {
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
    
    public static void updatePos(int deltaX,int deltaY)
    {
        positionx+=deltaX;
        positiony+=deltaY;
    }
}


