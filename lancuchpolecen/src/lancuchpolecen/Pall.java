package lancuchpolecen;

import java.util.Scanner;

public class Pall extends Irel  {

	@Override
	public Irel doTasc() throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i= in.nextInt();
		if(i==0) {
			throw new Exception("koniec");
		}
		
		System.out.println("Ognia pal");
		
		return next.doTasc();
	}

}
