public class Etudiant {
    // Attributs
    private String nom;
    private int numeroEtudiant;
    private double moyenne;

    // Constructeur
    public Etudiant(String nom, int numeroEtudiant, double moyenne) {
        this.nom = nom;
        this.numeroEtudiant = numeroEtudiant;
        this.moyenne = moyenne;
    }

    // Méthodes getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    // Méthode pour afficher les informations de l'étudiant
    public void afficherInformations() {
        System.out.println("Nom de l'étudiant : " + nom);
        System.out.println("Numéro d'étudiant : " + numeroEtudiant);
        System.out.println("Moyenne de l'étudiant : " + moyenne);
    }
}
