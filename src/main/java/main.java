public class main {
	/**
	*Main
	*
	*/
	public static void main(String[] args) {
		
		try {
		Pile maPile = new Pile();
		if (!maPile.est_vide()) System.out.println("NOK");
		maPile.empiler(5);
		if (!maPile.est_vide()) System.out.println("OK");
		maPile.depiler();
		maPile.empiler(10);
		maPile.empiler(5);
		maPile.empiler(5);
		System.out.println(maPile.affiche());
		System.out.println(maPile.sommet());
		} catch (Exception e) {
            e.printStackTrace();
		}
	}

}
