/*
 * Vihecule class
 * Cette classe represente un vihecule
 * Nom du fichier: Vihecule.java
 */
public class Vihecule {
  // Attributes
  private String matricule;
  private String marque;
  private String modele;

  // Constructeur
  public Vihecule(String matricule, String marque, String modele) {
    this.matricule = matricule;
    this.marque = marque;
    this.modele = modele;
  }

  /*
   * Getters
   */
  // getMatricule
  public String getMatricule() {
    return matricule;
  }

  // getMarque
  public String getMarque() {
    return marque;
  }

  // getModele
  public String getModele() {
    return modele;
  }

  /*
   * Setters
   */
  // setMatricule
  public void setMatricule(String matricule) {
    this.matricule = matricule;
  }

  // setMarque
  public void setMarque(String marque) {
    this.marque = marque;
  }

  // setModele
  public void setModele(String modele) {
    this.modele = modele;
  }

  /*
   * Methodes
   */
  // Afficher les informations du vihecule
  public void afficher() {
    System.out.println("Matricule: " + this.matricule);
    System.out.println("Marque: " + this.marque);
    System.out.println("Modele: " + this.modele);
  }
}