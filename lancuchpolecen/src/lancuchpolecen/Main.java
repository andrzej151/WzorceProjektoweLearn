package lancuchpolecen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laduj lad = new Laduj();
		Pall pal = new Pall();
		Wywalluske wywal = new Wywalluske();
		lad.addnextTask(pal);
		pal.addnextTask(wywal);
		wywal.addnextTask(lad);
		
		try {
			lad.doTasc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Koniec");
		}
		
	}

}
