/*
 * Main class
 * Cette classe est la classe principale du programme
 * Nom du fichier: Main.java
 */

import java.util.Scanner;

public class Main {
  // Afficher le menu principal
  public static void afficherMenuPrincipal() {
    System.out.println("Bienvenue dans le programme de gestion de parc");
    System.out.println("1. Gestion des vehicules");
    System.out.println("2. Gestion des materiels informatiques");
    System.out.println("3. Quitter");
    System.out.print("Votre choix: ");
  }

  // Afficher le menu de gestion des vehicules
  public static void afficherMenuVehicules() {
    System.out.println("Gestion des vehicules");
    System.out.println("1. Ajouter une voiture");
    System.out.println("2. Ajouter un camion");
    System.out.println("3. Afficher les voitures");
    System.out.println("4. Afficher les camions");
    System.out.println("0. Retour au menu principal");
    System.out.print("Votre choix: ");
  }

  // Afficher le menu de gestion des materiels informatiques
  public static void afficherMenuMaterielsInfo() {
    System.out.println("Gestion des materiels informatiques");
    System.out.println("1. Ajouter un ordinateur");
    System.out.println("2. Ajouter une imprimante");
    System.out.println("3. Afficher les ordinateurs");
    System.out.println("4. Afficher les imprimantes");
    System.out.println("0. Retour au menu principal");
    System.out.print("Votre choix: ");
  }

  // Main method
  public static void main(String[] args) {
    /*
     * Declaration des variables
     */
    // Choix de l'utilisateur
    int choixMenuPrincipal = 0;
    int choixMenuVehicules = 0;
    int choixMenuMaterielsInfo = 0;

    // Scanners pour lire les entrees de l'utilisateur
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    // Lire le numero de parc
    System.out.print("Entrez le numero de parc: ");
    int numParc = scanner1.nextInt();
    // Creer un objet parc
    Parc parc = new Parc(numParc);

    // Afficher le menu principal tant que l'utilisateur ne choisit pas de quitter
    do {
      // Afficher le menu principal
      afficherMenuPrincipal();
      // Lire le choix de l'utilisateur
      choixMenuPrincipal = scanner1.nextInt();
      // Switch sur le choix de l'utilisateur
      switch (choixMenuPrincipal) {
        case 1:
          do {
            // Afficher le menu de gestion des vehicules
            afficherMenuVehicules();
            // Lire le choix de l'utilisateur
            choixMenuVehicules = scanner1.nextInt();
            // Switch sur le choix de l'utilisateur
            switch (choixMenuVehicules) {
              case 1:
                /*
                 * Lire les informations de la voiture
                 */
                // Lire le matricule
                System.out.print("Entrez le matricule: ");
                String matricule = scanner2.nextLine();
                // Lire la marque
                System.out.print("Entrez la marque: ");
                String marque = scanner2.nextLine();
                // Lire le modele
                System.out.print("Entrez le modele: ");
                String modele = scanner2.nextLine();
                // Lire le type
                System.out.print("Entrez le type: ");
                String type = scanner2.nextLine();
                // Creer un objet voiture
                Voiture voiture = new Voiture(matricule, marque, modele, type);
                // Ajouter la voiture au parc
                parc.ajouterVihecule(voiture);
                break;
              case 2:
                /*
                 * Lire les informations du camion
                 */
                // Lire le matricule
                System.out.print("Entrez le matricule: ");
                matricule = scanner2.nextLine();
                // Lire la marque
                System.out.print("Entrez la marque: ");
                marque = scanner2.nextLine();
                // Lire le modele
                System.out.print("Entrez le modele: ");
                modele = scanner2.nextLine();
                // Lire le poids
                System.out.print("Entrez le poids: ");
                Double poids = scanner1.nextDouble();
                // Creer un objet camion
                Camion camion = new Camion(matricule, marque, modele, poids);
                // Ajouter le camion au parc
                parc.ajouterVihecule(camion);
                break;
              case 3:
                // Afficher les voitures
                parc.listerVoitures();
                break;
              case 4:
                // Afficher les camions
                parc.listerCamions();
                break;
              case 0:
                // Retour au menu principal
                break;
              default:
                // Choix invalide
                System.out.println("Choix invalide");
                break;
            }
          } while (choixMenuVehicules != 0);
          break;
        case 2:
          do {
            // Afficher le menu de gestion des materiels informatiques
            afficherMenuMaterielsInfo();
            // Lire le choix de l'utilisateur
            choixMenuMaterielsInfo = scanner1.nextInt();
            // Switch sur le choix de l'utilisateur
            switch (choixMenuMaterielsInfo) {
              case 1:
                /*
                 * Lire les informations de l'ordinateur
                 */
                // Lire le numero de serie
                System.out.print("Entrez le numero de serie: ");
                String numSerie = scanner2.nextLine();
                // Lire la processeur
                System.out.print("Entrez la processeur: ");
                String processeur = scanner2.nextLine();
                // Lire la memoire
                System.out.print("Entrez la memoire: ");
                String memoire = scanner1.nextLine();
                // Lire le disque dur
                System.out.print("Entrez le disque dur: ");
                String disqueDur = scanner2.nextLine();
                // Creer un objet ordinateur
                Pc pc = new Pc(numSerie, processeur, memoire, disqueDur);
                // Ajouter l'ordinateur au parc
                parc.ajouterMaterielInfo(pc);
                break;
              case 2:
                /*
                 * Lire les informations de l'imprimante
                 */
                // Lire le numero de serie
                System.out.print("Entrez le numero de serie: ");
                numSerie = scanner2.nextLine();
                // Lire le type
                System.out.print("Entrez le type: ");
                String type = scanner2.nextLine();
                // Lire le nombre des pages par minute
                System.out.print("Entrez le nombre des pages par minute: ");
                int nbPagesParMinute = scanner1.nextInt();
                // Creer un objet imprimante
                Printer printer = new Printer(numSerie, type, nbPagesParMinute);
                // Ajouter l'imprimante au parc
                parc.ajouterMaterielInfo(printer);
                break;
              case 3:
                // Afficher les ordinateurs
                parc.listerPcs();
                break;
              case 4:
                // Afficher les imprimantes
                parc.listerPrinters();
                break;
              case 0:
                // Retour au menu principal
                break;
              default:
                // Choix invalide
                System.out.println("Choix invalide");
                break;
            }
          } while (choixMenuMaterielsInfo != 0);
          break;
        case 3:
          // Quitter
          break;
        default:
          // Choix invalide
          System.out.println("Choix invalide");
          break;
      }
    } while (choixMenuPrincipal != 3);
    // Fermer les scanners
    scanner1.close();
    scanner2.close();
  }
}