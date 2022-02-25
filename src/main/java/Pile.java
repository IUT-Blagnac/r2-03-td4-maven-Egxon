/**
*Créé une pile.
*
*/
public class Pile {

	int e;
	int[] tab;
	

	Pile(){
		
		this.e = -1;
		this.tab = new int[100];
		
	}
	
	/**
*Verifie si la pile est vide
*
*/
	public boolean est_vide() {
		if (this.e == -1) {
			return false;
		}
			
		return true;
		
	}
	


	/**
	*Empile un elements
	* @param int i
	*/
	public void empiler(int i) {
		this.e ++;
		this.tab[e] = i;
		
	}

	/**
	*depile un elements
	* @param int i
	* @throws si la pile est vide
	*/
	public void depiler() throws Exception {
		
		if (this.est_vide()==false) {
			throw new Exception("la pile est vide");
		}
		
		this.tab[e] = 0;
		this.e --;
		
		
	}

	/**
	*retourne le sommet de la pile
	* @param int i
	* @throws si la pile est vide
	*/
	public int sommet() throws Exception {
		
		if (this.est_vide()==false) {
			throw new Exception("la pile est vide");
		}
		
		return (this.tab[e]);
	}
	
	public String affiche() {
		
	String tmp = "";	
		
	for (int i=0; i<=this.e ; i++) {
		
		tmp = tmp + " " + this.tab[i];
		
	}
		
		
		return tmp;
		
		
	
	}

}
