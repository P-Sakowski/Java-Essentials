
public abstract class Figure
{
    public int xPosition;
    public int yPosition;
    public String color;
    public boolean isVisible;
    
    public Figure(int XPosition, int YPosition, String Color, boolean IsVisible)
    {
        this.xPosition = XPosition;
        this.yPosition = YPosition;
        this.color = Color;
        this.isVisible = IsVisible;
    }
    
    public abstract void draw();

    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    public void moveRight()
    {
        moveHorizontal(20);
    }

    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    public void moveUp()
    {
        moveVertical(-20);
    }

    public void moveDown()
    {
        moveVertical(20);
    }
    
    public void moveHorizontal(int distance)
    {
        this.erase();
        this.xPosition += distance;
        this.draw();
    }

    public void moveVertical(int distance)
    {
        this.erase();
        this.yPosition += distance;
        this.draw();
    }
    
        public final void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
    
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }
}