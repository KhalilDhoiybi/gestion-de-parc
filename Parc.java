/*
 * Parc class
 * Cette classe représente un parc
 * Nom du fichier: Parc.java
 */

import java.util.ArrayList;

public class Parc {
  // Attributes
  private int numero;
  private ArrayList<Vihecule> vihecules = new ArrayList<Vihecule>();
  private ArrayList<MaterielInfo> materielsInfo = new ArrayList<MaterielInfo>();

  // Constructeur
  public Parc(int numero) {
    this.numero = numero;
  }

  /*
   * Getters
   */
  // getNumero
  public int getNumero() {
    return numero;
  }

  // getVihecules
  public ArrayList<Vihecule> getVihecules() {
    return vihecules;
  }

  // getMaterielsInfo
  public ArrayList<MaterielInfo> getMaterielsInfo() {
    return materielsInfo;
  }

  /*
   * Setters
   */
  // setNumero
  public void setNumero(int numero) {
    this.numero = numero;
  }

  // setVihecules
  public void setVihecules(ArrayList<Vihecule> vihecules) {
    this.vihecules = vihecules;
  }

  // setMaterielsInfo
  public void setMaterielsInfo(ArrayList<MaterielInfo> materielsInfo) {
    this.materielsInfo = materielsInfo;
  }

  /*
   * Methodes
   */
  // Ajouter un vihecule
  public void ajouterVihecule(Vihecule vihecule) {
    this.vihecules.add(vihecule);
  }

  // Ajouter un materiel informatique
  public void ajouterMaterielInfo(MaterielInfo materielInfo) {
    this.materielsInfo.add(materielInfo);
  }

  // Lister les voiture
  public void listerVoitures() {
    for (Vihecule vihecule : this.vihecules) {
      if (vihecule instanceof Voiture) {
        vihecule.afficher();
      }
    }
  }

  // Lister les camions
  public void listerCamions() {
    for (Vihecule vihecule : this.vihecules) {
      if (vihecule instanceof Camion) {
        vihecule.afficher();
      }
    }
  }

  // Lister les ordinateurs
  public void listerPcs() {
    for (MaterielInfo materielInfo : this.materielsInfo) {
      if (materielInfo instanceof Pc) {
        materielInfo.afficher();
      }
    }
  }

  // Lister les Imprimantes
  public void listerPrinters() {
    for (MaterielInfo materielInfo : this.materielsInfo) {
      if (materielInfo instanceof Printer) {
        materielInfo.afficher();
      }
    }
  }

  // Lister les materiels informatiques
  public void listerMaterielsInfo() {
    for (MaterielInfo materielInfo : this.materielsInfo) {
      materielInfo.afficher();
    }
  }

  // Lister les vihecules
  public void listerVihecules() {
    for (Vihecule vihecule : this.vihecules) {
      vihecule.afficher();
    }
  }

  // Afficher les informations du parc
  public void afficher() {
    System.out.println("Numero: " + this.numero);
    System.out.println("Vihecules: ");
    for (Vihecule vihecule : this.vihecules) {
      vihecule.afficher();
    }
    System.out.println("Materiels informatiques: ");
    for (MaterielInfo materielInfo : this.materielsInfo) {
      materielInfo.afficher();
    }
  }
}