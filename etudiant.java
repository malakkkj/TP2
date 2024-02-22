public class Etudiant {
    // Attributs
    private String nom;
    
    private double moyenne;
    private double note;

    // Constructeur
    public Etudiant(String nom, double moyenne) {
        this.nom = nom;
      
        this.moyenne = moyenne;
    }

    // Méthodes getters et setters pour nom, numéro étudiant, moyenne et note
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    // Méthode de statistiques pour calculer la moyenne des notes des étudiants dans une liste
    public static double calculerMoyenneNotes(List<Etudiant> etudiants) {
        double sommeNotes = 0;
        int nombreEtudiants = etudiants.size();
        
        for (Etudiant etudiant : etudiants) {
            sommeNotes += etudiant.getNote();
        }
        
        return sommeNotes / nombreEtudiants;
    }

}
