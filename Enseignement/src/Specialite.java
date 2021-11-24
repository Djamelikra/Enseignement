
public class Specialite {
	private String codeSpecialite;
	private String nomSpecialite;
	

	public Specialite(String codeSpecialite, String nomSpecialite) {
		super();
		this.codeSpecialite = codeSpecialite;
		this.nomSpecialite = nomSpecialite;
	}

	public String getCodeSpecialite() {
		return codeSpecialite;
	}

	public String getNomSpecialite() {
		return nomSpecialite;
	}

	public void setNomSpecialite(String nomSpecialite) {
		this.nomSpecialite = nomSpecialite;
	}

	public String affichage() {
		return "Specialite [code:" + codeSpecialite + ", Specialite :" + nomSpecialite + "]";
	}
	
	
	

}
