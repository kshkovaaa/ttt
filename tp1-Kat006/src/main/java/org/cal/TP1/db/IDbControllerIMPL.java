package org.cal.TP1.db;

import java.util.List;

public class IDbControllerIMPL implements IDbController{

	//Le IDbController est l’interface de la classe ayant comme rôle de controller les accès à la
	//base de données.
	//Les méthodes de cette classe vont, d’ordre général, faire deux choses :
	//1. Valider les entrées, si nécessaire.
	//2. Appeler la fonction appropriée de la classe implémentant IDb.
	//Si la validation échoue, le IDbController doit lancer une exception de type approprié.
	//Assurez-vous que votre implémentation du IDbController puisse être initialisé avec une
	//instance déjà existante de IDb. Cela vous sera utile plus tard pour les tests unitaires.
	
	private IDb idB;
	public IDbControllerIMPL() {
		idB = new IDbIMPL();
	}
	
	@Override
	public void assignerTaches() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterEmploye(String nom, String fonction) {
	    if(nom != null && fonction != null &&
	        !nom.equals("") && !fonction.equals("")) {
	    	Employe empl = new Employe(nom, fonction);
	        idB.ajouterEmploye(empl);
	    }
	    else {
	        throw new NullPointerException();
	    }
	}

	@Override
	public void ajouterNouvelleTache(String description, String priorite, String dateCreation, String fonction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Tache> getTachesNonAssignes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Tache> getTachesAssignes(Employe e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<String> getFonctions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> getEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> getEmployesParFonction(String fonction) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
