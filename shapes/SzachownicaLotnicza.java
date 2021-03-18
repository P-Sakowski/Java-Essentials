public class SzachownicaLotnicza
{
    public static void draw(int size)
    {
        Square border = new Square();
        border.makeVisible();
        border.changeSize(size+2);
        border.changeColor("black");
        border.moveHorizontal(-1);
        border.moveVertical(-1);
        Square wMain = new Square();
        wMain.makeVisible();
        wMain.changeSize(size);
        wMain.changeColor("white");
        Square rRightTop = new Square();
        rRightTop.makeVisible();
        rRightTop.changeSize(size/10*5);
        rRightTop.moveHorizontal(size/10*5);
        Square wRightTop = new Square();
        wRightTop.makeVisible();
        wRightTop.changeSize(size/10*4);
        wRightTop.moveHorizontal(size/10*5);
        wRightTop.moveVertical(size/10);
        wRightTop.changeColor("white");
        Square rLeftTop = new Square();
        rLeftTop.makeVisible();
        rLeftTop.changeSize(size/10*4);
        rLeftTop.moveHorizontal(size/10);
        rLeftTop.moveVertical(size/10);
        Square rLeftBottom = new Square();
        rLeftBottom.makeVisible();
        rLeftBottom.changeSize(size/10*5);
        rLeftBottom.moveVertical(size/10*5);
        Square wLeftBottom = new Square();
        wLeftBottom.makeVisible();
        wLeftBottom.changeSize(size/10*4);
        wLeftBottom.moveVertical(size/10*5);
        wLeftBottom.moveHorizontal(size/10);
        wLeftBottom.changeColor("white");
        Square rRightBottom = new Square();
        rRightBottom.makeVisible();
        rRightBottom.changeSize(size/10*4);
        rRightBottom.moveVertical(size/10*5);
        rRightBottom.moveHorizontal(size/10*5);
    }
}
