/*
 * Voiture class
 * Cette classe représente une voiture et hérite de la classe Vihecule
 * Nom du fichier: Voiture.java
 */
public class Voiture extends Vihecule {
  // Attributes
  private String type;

  // Constructeur
  public Voiture(String matricule, String marque, String modele, String type) {
    super(matricule, marque, modele);
    this.type = type;
  }

  /*
   * Getters
   */
  // getType
  public String getType() {
    return type;
  }

  /*
   * Setters
   */
  // setType
  public void setType(String type) {
    this.type = type;
  }

  /*
   * Methodes
   */
  // Afficher les informations de la voiture
  public void afficher() {
    super.afficher();
    System.out.println("Type: " + this.type);
  }
}