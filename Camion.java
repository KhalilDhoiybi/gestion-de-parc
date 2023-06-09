/*
 * Camion class
 * Cette classe représente un camion et hérite de la classe Vihecule
 * Nom du fichier: Camion.java
 */
public class Camion extends Vihecule {
  // Attributes
  private Double poidsMax;

  // Constructeur
  public Camion(String matricule, String marque, String modele, Double poidsMax) {
    super(matricule, marque, modele);
    this.poidsMax = poidsMax;
  }

  /*
   * Getters
   */
  // getPoidsMax
  public Double getPoidsMax() {
    return poidsMax;
  }

  /*
   * Setters
   */
  // setPoidsMax
  public void setPoidsMax(Double poidsMax) {
    this.poidsMax = poidsMax;
  }

  /*
   * Methodes
   */
  // Afficher les informations du camion
  public void afficher() {
    super.afficher();
    System.out.println("Poids max: " + this.poidsMax);
  }
}