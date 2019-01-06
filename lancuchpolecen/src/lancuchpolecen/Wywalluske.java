package lancuchpolecen;

public class Wywalluske extends Irel{

	@Override
	public Irel doTasc() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Wywalam luske");
		
		
		return next.doTasc();
	}

}
