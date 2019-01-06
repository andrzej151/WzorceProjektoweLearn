package lancuchpolecen;

public class Laduj extends Irel{

	@Override
	public Irel doTasc() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Laduje");
		
		return next.doTasc();
	}

}
