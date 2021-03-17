import java.util.Scanner;

class Drugi {
  public static void main(String args[]) {
	Scanner klawiatura = new Scanner(System.in); //inicjujemy obiekt do odbierania danych z konsoli
    
	//System.out.print("Podaj swoje imię: "); //W java znaki kodowane są UTF-16, ę kodujemy \u0119
	System.out.print("Podaj swoje imi\u0119: ");
	String imie = klawiatura.nextLine();
    
    System.out.print("Podaj swoje nazwisko: ");
	String nazwisko = klawiatura.nextLine();
    	
	System.out.println("Witaj " + imie + " " + nazwisko + "!");  
  }
}

//print vs println
//println po wydrukowaniu tekstu ustawia kursor w nowej linii ęęę
//print zostawia kursor za ostatnim znakiem wprowadzanego tekstu
//System.out.print("\u0119");  - wyświetli ę
//System.out.print("ę");  - wyświetli Ä