/*
 * Printer class
 * Cette classe represente une imprimante et hérite de la classe MaterielInfo
 * Nom du fichier: Printer.java
 */
public class Printer extends MaterielInfo {
  // Attributes
  private String type;
  private int nbPagesParMin;

  // Constructeur
  public Printer(String numSerie, String type, int nbPagesParMin) {
    super(numSerie);
    this.type = type;
    this.nbPagesParMin = nbPagesParMin;
  }

  /*
   * Getters
   */
  // getType
  public String getType() {
    return type;
  }

  // getNbPagesParMin
  public int getNbPagesParMin() {
    return nbPagesParMin;
  }

  /*
   * Setters
   */
  // setType
  public void setType(String type) {
    this.type = type;
  }

  // setNbPagesParMin
  public void setNbPagesParMin(int nbPagesParMin) {
    this.nbPagesParMin = nbPagesParMin;
  }

  /*
   * Methodes
   */
  // Afficher les informations de l'imprimante
  public void afficher() {
    super.afficher();
    System.out.println("Type: " + this.type);
    System.out.println("Nombre de pages par minute: " + this.nbPagesParMin);
  }
}