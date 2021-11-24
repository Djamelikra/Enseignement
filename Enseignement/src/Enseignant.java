
public class Enseignant {
	private String nom;
	private String prenom;
	private int tel;
	private String codeSpecialite;
	
	public Enseignant(String nom, String prenom, int tel, String codeSpecialite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.codeSpecialite = codeSpecialite;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCodeSpecialite() {
		return codeSpecialite;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getTel() {
		return tel;
	}
	

	public void setCodeSpecialite(String codeSpecialite) {
		this.codeSpecialite = codeSpecialite;
	}

	public String affichage() {
		return "Enseignant [nom:" + nom + ", prenom:" + prenom + ", tel:" + tel + ", codeSpecialite:" + codeSpecialite
				+ "]";
	}
	
	public String getFullName() {
		return this.prenom + " " + this.nom ;
	}
	
	
	
	

}
