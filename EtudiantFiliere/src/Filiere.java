
public class Filiere {
	private String nom;
	private String prenom;
	private String filiere;
	
	public Filiere(String filiere) {
		super();
		this.filiere = filiere;
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

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	@Override
	public String toString() {
		return "Filiere [nom=" + nom + ", prenom=" + prenom + ", filiere=" + filiere + "]";
	}
	
	
	
}
