package org.cal.TP1.db;

import java.util.ArrayList;
import java.util.List;

public class Employe {
    private String nom;
    private String fonction;
    private List<Tache> taches;

    public Employe(String nom, String fonction) {
        this.nom = nom;
        this.fonction = fonction;
        this.taches = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getFonction() {
        return fonction;
    }

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
    

}
