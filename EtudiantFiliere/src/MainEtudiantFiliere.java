public class MainEtudiantFiliere {

	public static void main(String[] args) {
		
		//La liste des filières de notre école
		Filiere[] Fil = new Filiere[3];
		Fil[0] = new Filiere("Informatique");
		Fil[1] = new Filiere("Techno de l'info et de communication");
		Fil[2] = new Filiere("Génie civil");
		
		System.out.println("La liste des filières de notre école :");
		for (Filiere f : Fil)
			System.out.println("-->" + f.getFiliere());
		
		System.out.println("-------------------------\n-------------------------");
		
		//Liste des étudiants par filière 

		Etudiant[]  Student = new Etudiant[5];
		Student[0] = new Etudiant("Camara", "Moussa","Informatique");
		Student[1] = new Etudiant("Simpson", "Homer","Informatique");
		Student[2] = new Etudiant("Machin", "Bidule","Marketing");
		Student[3] = new Etudiant("Dupont", "Jean","Génie civil");
		Student[4] = new Etudiant("Simpson", "Bart","Génie civil");
		for (Filiere f : Fil) {
			System.out.println("->" + f.getFiliere());
			for (Etudiant  Stud : Student) {
					if (Stud.getFiliere() == f.getFiliere()){
						System.out.println("--->Je suis bien l'étudiant : " + Stud.getFullName());
					}
			
			}
		}

	}

}
