
public class Etudiant {
	private String nom;
	private String prenom;
	private String filiere;
	
	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Etudiant(String nom, String prenom, String filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}

	public Etudiant() {
		super();
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
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", filiere=" + filiere + "]";
	}
	
	public String getFullName() {
		return this.nom + " " + this.prenom;
	}
	
	
	
}
