public class MainEtudiantFiliere {

	public static void main(String[] args) {
		
		//La liste des fili�res de notre �cole
		Filiere[] Fil = new Filiere[3];
		Fil[0] = new Filiere("Informatique");
		Fil[1] = new Filiere("Techno de l'info et de communication");
		Fil[2] = new Filiere("G�nie civil");
		
		System.out.println("La liste des fili�res de notre �cole :");
		for (Filiere f : Fil)
			System.out.println("-->" + f.getFiliere());
		
		System.out.println("-------------------------\n-------------------------");
		
		//Liste des �tudiants par fili�re 

		Etudiant[]  Student = new Etudiant[5];
		Student[0] = new Etudiant("Camara", "Moussa","Informatique");
		Student[1] = new Etudiant("Simpson", "Homer","Informatique");
		Student[2] = new Etudiant("Machin", "Bidule","Marketing");
		Student[3] = new Etudiant("Dupont", "Jean","G�nie civil");
		Student[4] = new Etudiant("Simpson", "Bart","G�nie civil");
		for (Filiere f : Fil) {
			System.out.println("->" + f.getFiliere());
			for (Etudiant  Stud : Student) {
					if (Stud.getFiliere() == f.getFiliere()){
						System.out.println("--->Je suis bien l'�tudiant : " + Stud.getFullName());
					}
			
			}
		}

	}

}
