import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen_new extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    public TitleScreen_new()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 300, 80);
        prepare();
    }

    public void act()
    {
        //Start the game
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);

        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Use \u2190 and \u2192 to World", 35);
        addObject(label,288,267);
        label.setLocation(312,258);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,283,334);
        label2.setLocation(283,334);
        label2.setLocation(304,325);
        label.setLocation(286,247);
        Elephant elephant = new Elephant();
        addObject(elephant,545,65);
        label.setLocation(323,232);
        label2.setLocation(296,323);
    }
}
