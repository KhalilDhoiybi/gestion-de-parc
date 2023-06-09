/*
 * MaterielInfo class
 * Cette classe represente un materiel informatique
 * Nom du fichier: MaterielInfo.java
 */
public class MaterielInfo {
  // Attributes
  private String numSerie;

  // Constructeur
  public MaterielInfo(String numSerie) {
    this.numSerie = numSerie;
  }

  /*
   * Getters
   */
  // getNumSerie
  public String getNumSerie() {
    return numSerie;
  }

  /*
   * Setters
   */
  // setNumSerie
  public void setNumSerie(String numSerie) {
    this.numSerie = numSerie;
  }

  /*
   * Methodes
   */
  // Afficher les informations du materiel informatique
  public void afficher() {
    System.out.println("Numero de serie: " + this.numSerie);
  }
}