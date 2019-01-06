package zamianasystemow;

import java.util.HashMap;

import javax.swing.text.StyleConstants.ColorConstants;

public class DzNaRzym implements Interpreter {

	private int in;
	private boolean blad=false;
	private String out;
	private HashMap<Integer, String> mapa;
	private int[] zam = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

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

	public DzNaRzym() {

		mapa = new HashMap<>();
		mapa.put(1000, "M");
		mapa.put(900, "SM");
		mapa.put(500, "D");
		mapa.put(400, "SD");
		mapa.put(100, "S");
		mapa.put(90, "XS");
		mapa.put(50, "L");
		mapa.put(40, "XL");
		mapa.put(10, "X");
		mapa.put(9, "IX");
		mapa.put(5, "V");
		mapa.put(4, "IV");
		mapa.put(1, "I");
	}

	@Override
	public void setString(String napis) {
		// TODO Auto-generated method stub
		try {
		in = Integer.parseInt(napis);
		}catch (Exception e) {
			// TODO: handle exception
			blad = true;
		}
	}

	@Override
	public Boolean interpretuj() {
		// TODO Auto-generated method stub
		StringBuffer wynik = new StringBuffer("");
		int tmp = in;
		int i = 0;

		while (tmp > 0 && i < zam.length) {

			if (tmp - zam[i] >= 0) {

				wynik.append(mapa.get(zam[i]));
				// System.out.println(wynik + " ==== " + tmp + " " + zam[i] + " " +
				// mapa.get(zam[i]));
				tmp -= zam[i];
			} else {
				i++;
			}

		}

		out = in + "=" + wynik;
		return true;
	}

	@Override
	public Boolean interpretuj(String napis) {
		// TODO Auto-generated method stub
		blad = false;
		setString(napis);
		if (blad) {
			return false;
		}
		return interpretuj();
	}

	@Override
	public Object wynik() {
		// TODO Auto-generated method stub
		return out;
	}

}
