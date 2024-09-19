import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero 
 * 
 * @author Charlie 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant-trumpets-growls-6047.mp3");
    public void act()
    {
        // Add your action code here.
        
        if (Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        eat();
    }
    
    public void eat()
    {
        //Remove apple if elephant eats it
        if(isTouching(Apple.class))
        {
           removeTouching(Apple.class);
           MyWorld world = (MyWorld) getWorld();
           world.createApple();
           world.IncreaseScore();
           elephantSound.play();
        }
        
    }
}
