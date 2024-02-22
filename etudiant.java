public class Etudiant {
    // Attributs
    private String nom;
    private int numeroEtudiant;
    

    // Constructeur
    public Etudiant(String nom, int numeroEtudiant) {
        this.nom = nom;
        this.numeroEtudiant = numeroEtudiant;
  
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


    // Méthode pour afficher les informations de l'étudiant
    public void afficherInformations() {
        System.out.println("Nom de l'étudiant : " + nom);
        System.out.println("Numéro d'étudiant : " + numeroEtudiant);
    }
}
