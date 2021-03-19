public class Domek
{
    public static void main(String args[])
    {
        Prostokat komin = new Prostokat();
        komin.makeVisible();
        komin.changeSize(15, 25); 
        komin.moveVertical(40);
        komin.moveHorizontal(70);
        Triangle dach = new Triangle(); //utworzenie nowego obiektu typu Triangle i nadanie mu nazwy dach
        dach.makeVisible(); //wyświetlenie obiektu dach
        dach.changeSize(50, 140); //zmiana rozmiaru obiektu dach – wysokość 50, szerokość 140
        dach.moveHorizontal(60); //przesunięcie w poziomie obiektu dach o 60 pixeli w prawo
        dach.moveVertical(70); //przesunięcie w pionie obiektu dach o 70 pixeli w dół
        Square sciana = new Square();
        sciana.changeColor("red");
        sciana.makeVisible();
        sciana.changeSize(100);
        sciana.moveVertical(85);
        Square okno = new Square();
        okno.changeColor("black");
        okno.makeVisible();
        okno.moveVertical(100);
        okno.moveHorizontal(20);
        Prostokat drzwi = new Prostokat();
        drzwi.changeColor("black");
        drzwi.makeVisible();
        drzwi.changeSize(30, 60);
        drzwi.moveVertical(125);
        drzwi.moveHorizontal(60);
        Square drzewoPien = new Square();
        drzewoPien.changeColor("black");
        drzewoPien.makeVisible();
        drzewoPien.changeSize(20);
        drzewoPien.moveVertical(170);
        drzewoPien.moveHorizontal(170);
        Triangle drzewoBot = new Triangle();
        drzewoBot.makeVisible();
        drzewoBot.changeSize(50, 100); 
        drzewoBot.moveHorizontal(190); 
        drzewoBot.moveVertical(160); 
        Triangle drzewoMid = new Triangle();
        drzewoMid.makeVisible();
        drzewoMid.changeSize(50, 80);
        drzewoMid.moveHorizontal(190); 
        drzewoMid.moveVertical(140); 
        Triangle drzewoTop = new Triangle();
        drzewoTop.makeVisible();
        drzewoTop.changeSize(50, 60);
        drzewoTop.moveHorizontal(190); 
        drzewoTop.moveVertical(120); 
        Circle slonce = new Circle();
        slonce.makeVisible();
        slonce.changeColor("yellow");
        slonce.changeSize(50);
        slonce.slowMoveVertical(-50);
        slonce.slowMoveHorizontal(170);
        slonce.slowMoveVertical(50);
    }
}