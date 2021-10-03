package org.cal.TP1.db;

import java.util.List;

public class IDbIMPL implements IDb {

	@Override
	public void ajouterTache(Tache t) {
		//La méthode « ajouterTache » permet d’ajouter une tâche à la base de données. Cette
		//tâche n’est pas assignée à un employé. On peut assumer que la tâche passée en
		//paramètre est valide. Une tâche null n’est pas acceptée
		
	}

	@Override
	public void ajouterEmploye(Employe e) {
		//permet d’ajouter un employé à la base de données. On
		//peut assumer que l’employé passé en paramètre est valide. Un employé null n’est pas
		//acceptée
	}

	@Override
	public void assignerTaches() {
		// La méthode « assignerTache » assigne toutes les tâches non assignées aux employés.
		//L’assignation des tâches doit être fait de façon que les différents employés éligibles aient
		//sensiblement le même nombre de tâches leur étant attribuées.La distribution des tâches, en plus d’être équitable en termes de nombre de tâche, devrait
		//être équitable en termes de priorité des tâches. Distribuez donc les tâches en
		//commençant par les plus prioritaire et en terminant par les moins prioritaire. En cas de
		//priorité équivalente, priorisez la plus ancienne.
		//Il est possible que certaines tâches soient uniquement réalisables pour une fonction
		//occupée par aucun employé. Dans ce cas, la tâche devra rester non-assigné.
		
	}

	@Override
	public Iterable<Tache> getTachesNonAssignees() {
		// La méthode « getTacheNonAssigne » retourne toutes les tâches qui n’ont pas encore été
		//assignés à un employé. L’interface graphique va itérer sur le retour de cette fonction afin
		//d’en afficher le résultat.
		return null;
	}

	@Override
	public Iterable<String> getFonctions() {
		// La méthode « getFonctions » retourne toutes les fonctions attribuées à des employés ou
		//bien des tâches. L’interface graphique va itérer sur le retour de cette fonction afin d’en
		//afficher le résultat.
		return null;
	}

	@Override
	public List<Employe> getEmployesParFonction(String fonction) {
		// La méthode « getEmployesParFonction » retourne la liste de tous les employés occupant
		//une certaine fonction. L’interface graphique va accéder aux éléments de cette liste par
		//accès aléatoire.
		return null;
	}

	@Override
	public List<Employe> getEmployes() {
		// La méthode « getEmployes» retourne la liste de tous les employés. L’interface graphique
		//va accéder aux éléments de cette liste par accès aléatoire.
		return null;
	}

}
