import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 80);
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 125);
        prepare();
    }

    /**
     * THe main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
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
        Elephant elephant = new Elephant();
        addObject(elephant,492,108);
        elephant.setLocation(504,102);
        elephant.setLocation(535,68);
        Label label = new Label("Use <-- and -->  to Move", 30);
        addObject(label,256,208);
        label.setLocation(305,220);
        label.setLocation(307,220);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,292,311);
        elephant.setLocation(552,40);
        label.setLocation(289,224);
        label2.setLocation(281,316);
        label.setLocation(363,217);
        elephant.setLocation(539,60);
        label.setLocation(310,209);
        label2.setLocation(290,300);
        label.setLocation(277,225);
        label.setLocation(362,220);
        label.setLocation(304,222);
        label2.setLocation(288,292);
    }
}
