
public class MainEnseignement {

	public static void main(String[] args) {
		//5 Spécialités
		Specialite[] speciality = new Specialite[8];
			speciality[0] = new Specialite("jee","Java/J2E");
			speciality[1] = new Specialite("htm","HTML/CSS");
			speciality[2] = new Specialite("gp","Gestion de projet");
			speciality[3] = new Specialite("js","JavaScript");
			speciality[4] = new Specialite("php","PHP");
			speciality[5] = new Specialite("c++","C++");
			speciality[6] = new Specialite("me","Merise");
			speciality[7] = new Specialite("uml","UML");
			
		//4 Enseignants :
		Enseignant[] teacher = new Enseignant[4];	
			teacher[0] = new Enseignant("Camara","Moussa",01234567,"jee");
			teacher[1] = new Enseignant("Zak","Zacharia",01233567,"jee");
			teacher[2] = new Enseignant("Michel","Dupont",01444567,"php");
			teacher[3] = new Enseignant("Jean","Duchmol",01554567,"js");
			
	/*Afficher la liste des enseignants par spécialité, s’il n’a pas d’enseignant on affiche le message 
	  « Aucun enseignant pour la spécialité nom_de_la_specialité » */
	
	System.out.println("Voici la liste des eseneignants par spécialité:");
	for(Specialite sp : speciality) {
		int flag = 0;
		for(Enseignant en : teacher) {
			if(en.getCodeSpecialite() == (sp.getCodeSpecialite())){
				System.out.println(sp.getNomSpecialite() +  "\t->" + en.getFullName());
				flag = 1;
			}
				
		}
		if(flag == 0){
			System.out.println("Désolé, il n' y a aucun enseignant pour la spécialité : " + sp.getNomSpecialite());
		}
	}
			
			

	}/*Main*/

}
