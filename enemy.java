class enemy
{
  char enemyType;
  int enemyColour;
  int enemyHealth;
  int enemyMaxHealth;
  public enemy(char type,int colour)
  {
  enemyType=type;
  enemyColour=colour;
  if (type=='z')
  {
  enemyMaxHealth=10;
  enemyHealth=enemyMaxHealth;
  }
  }
}
