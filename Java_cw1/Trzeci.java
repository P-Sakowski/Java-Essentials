import javax.swing.JOptionPane;

class Trzeci {
  public static void main(String args[]) {

	String imie = JOptionPane.showInputDialog("Podaj imi\u0119: ");
	String nazwisko = JOptionPane.showInputDialog("Podaj nazwisko: ");
    	
	System.out.println("Witaj " + imie + " " + nazwisko + "!");
	JOptionPane.showMessageDialog(null, "Witaj " + imie + " " + nazwisko + "!");
  }
}