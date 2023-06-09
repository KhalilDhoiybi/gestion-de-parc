/*
 * Pc class
 * Cette classe represente un pc et hérite de la classe MaterielInfo
 * Nom du fichier: Pc.java
 */
public class Pc extends MaterielInfo {
  // Attributes
  private String processeur;
  private String memoire;
  private String disqueDur;

  // Constructeur
  public Pc(String numSerie, String processeur, String memoire, String disqueDur) {
    super(numSerie);
    this.processeur = processeur;
    this.memoire = memoire;
    this.disqueDur = disqueDur;
  }

  /*
   * Getters
   */
  // getProcesseur
  public String getProcesseur() {
    return processeur;
  }

  // getMemoire
  public String getMemoire() {
    return memoire;
  }

  // getDisqueDur
  public String getDisqueDur() {
    return disqueDur;
  }

  /*
   * Setters
   */
  // setProcesseur
  public void setProcesseur(String processeur) {
    this.processeur = processeur;
  }

  // setMemoire
  public void setMemoire(String memoire) {
    this.memoire = memoire;
  }

  // setDisqueDur
  public void setDisqueDur(String disqueDur) {
    this.disqueDur = disqueDur;
  }

  /*
   * Methodes
   */
  // Afficher les informations du pc
  public void afficher() {
    super.afficher();
    System.out.println("Processeur: " + this.processeur);
    System.out.println("Memoire: " + this.memoire);
    System.out.println("Disque dur: " + this.disqueDur);
  }
}