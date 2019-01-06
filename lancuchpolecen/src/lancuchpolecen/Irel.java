package lancuchpolecen;

public abstract class Irel {
	protected Irel next;

	public void addnextTask(Irel n) {
		if(n==null) {
			System.out.println("null");
		}else {
			next = n;
		}
	}
	
	public abstract Irel doTasc() throws Exception;
}
