public class MojeInicjaly
{
    public static void main(String args[])
    {
        Prostokat pStopka = new Prostokat();
        pStopka.makeVisible();
        pStopka.changeSize(20, 100); 
        pStopka.changeColor("red");
        Square pGora = new Square();
        pGora.makeVisible();
        pGora.changeSize(50); 
        pGora.changeColor("red");
        pGora.moveHorizontal(10);
        Square pSrodek = new Square();
        pSrodek.makeVisible();
        pSrodek.changeSize(30); 
        pSrodek.changeColor("white");
        pSrodek.moveHorizontal(20);
        pSrodek.moveVertical(10);
        Circle sGora = new Circle();
        sGora.makeVisible();
        sGora.changeSize(60); 
        sGora.changeColor("blue");
        sGora.moveHorizontal(120);
        Circle sDol = new Circle();
        sDol.makeVisible();
        sDol.changeSize(60); 
        sDol.changeColor("blue");
        sDol.moveHorizontal(120);
        sDol.moveVertical(50);
        Circle sGoraZaslona = new Circle();
        sGoraZaslona.makeVisible();
        sGoraZaslona.changeSize(50); 
        sGoraZaslona.changeColor("white");
        sGoraZaslona.moveHorizontal(135);
        sGoraZaslona.moveVertical(5);
        Circle sDolZaslona = new Circle();
        sDolZaslona.makeVisible();
        sDolZaslona.changeSize(50); 
        sDolZaslona.changeColor("white");
        sDolZaslona.moveHorizontal(115);
        sDolZaslona.moveVertical(55);
    }
}
