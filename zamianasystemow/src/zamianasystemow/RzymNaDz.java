package zamianasystemow;

import java.util.HashMap;

public class RzymNaDz implements Interpreter {

	private String in, out;
	private HashMap<String, Integer> mapaDZ;
	private HashMap<String, Integer> mapaZ;

	// M 1000
	// SM 900
	// D 500
	// SD 400
	// S 100
	// XS 90
	// L 50
	// XL 40
	// X 10
	// IX 9
	// V 5
	// IV 4
	// I 1

	 public RzymNaDz() {
		// TODO Auto-generated constructor stub
		mapaDZ = new HashMap<>();
		mapaDZ.put("SM", 900);
		mapaDZ.put("SD", 400);
		mapaDZ.put("XS", 90);
		mapaDZ.put("XL", 40);
		mapaDZ.put("IX", 9);
		mapaDZ.put("IV", 4);

		mapaZ = new HashMap<>();
		mapaZ.put("M", 1000);
		mapaZ.put("D", 500);
		mapaZ.put("S", 100);
		mapaZ.put("L", 50);
		mapaZ.put("X", 10);
		mapaZ.put("V", 5);
		mapaZ.put("I", 1);
	}

	@Override
	public void setString(String napis) {
		// TODO Auto-generated method stub
		in = napis;
	}

	@Override
	public Boolean interpretuj() {
		// TODO Auto-generated method stub
		int wynik = 0;
		in = in.toUpperCase();
		

		for (int i = 0; i < in.length(); i++) {
			//System.out.println(wynik+" "+ in.substring(i, i+2) );
			if (i+1<in.length()&&(mapaDZ.get(in.substring(i, i+2)) != null)) {
				wynik += mapaDZ.get(in.substring(i, i+2));
				
				i+=1;

			} else if (mapaZ.get(in.substring(i, i+1)) != null) {
				wynik += mapaZ.get(in.substring(i, i+1));
			} else {
				out= "NIE MOZNA ZINTERPRETOWAC";
				return false;
			}
			
		}
		out= in+"="+wynik;
		return true;
	}

	@Override
	public Boolean interpretuj(String napis) {
		// TODO Auto-generated method stub
		setString(napis);
		return interpretuj();
	}

	@Override
	public Object wynik() {
		// TODO Auto-generated method stub
		return out;
	}

}
