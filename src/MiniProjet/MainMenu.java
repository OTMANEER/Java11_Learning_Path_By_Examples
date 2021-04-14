package MiniProjet;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
    Nomenclature nomenclature;
    public MainMenu() {
        Nomenclature nomenclature = new Nomenclature("Default");
    }

    public void Menu() throws InputMismatchException {
        int choix =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Nouvelle nomenclature");
        System.out.println("2-Ajouter une pièce sans ces composants");
        System.out.println("3-Afficher la nomenclature");
        System.out.println("4-Liste les pièces de même dénomination");
        System.out.println("5-Ajouter un composant à une pièce");
        System.out.println("6-Afficher tous les détails d’une piece");
        System.out.println("7-Supprimer une pièce");
        System.out.println("8-Trier la nomenclature par reference");
        System.out.println("0-Sortir");

        do{
            System.out.print("Donner votre choix: ");
            choix = sc.nextInt();
            switch (choix) {
            case 1:
                    System.out.print("Donner le nom de cette Nomenclature: ");
                    sc.nextLine();
                    String s0 = sc.nextLine();
                    this.nomenclature = new Nomenclature(s0);
                    break;
                case 2:
                    String flag2="";
                    sc.nextLine();
                    do {
                    System.out.print("S'agit-il d'une piece de Base Ou Composite? (b/c) ou (B/C): ");
                        flag2 = sc.nextLine();
                    }while(!flag2.equals("b") && !flag2.equals("B") && !flag2.equals("C")&& !flag2.equals("c"));
                    System.out.print("Donner la reference de cette Piece: ");
                    int ref1 = sc.nextInt();
                    int occurence=0;
                    Piece pb1;
                if(flag2.equals("b")|| flag2.equals("B")){
                    System.out.print("Donner le nombre d'occurence: ");
                    sc.nextLine();
                    occurence = sc.nextInt();
                      pb1 = new PieceDeBase(ref1,occurence);
                }else{
                    System.out.print("Donner le nom de la piece: ");
                    sc.nextLine();
                    String s2 = sc.nextLine();
                    System.out.print("Donner le poids de cette piece: ");
                    float f2 = sc.nextFloat();
                      pb1 = new PieceComposite(s2,f2,ref1);
                }

                    if(nomenclature == null)
                        this.nomenclature = new Nomenclature("Default");
                    String flag="";
                    System.out.print("La piece est fragile? (y/n)ou (Y/N) : ");
                    sc.nextLine();
                   flag = sc.nextLine();
                    if(flag.equals("y") || flag.equals("Y")) {
                        nomenclature.ajouter_piece_fragile(ref1, pb1);
                        break;
                    }
                    nomenclature.ajouter(ref1, pb1);
                    break;
                case 3:
                    if (nomenclature != null)
                        if(nomenclature.toutesPieces.size()==0)
                            System.out.println("Nomenclature Vide!");
                        else
                        System.out.println(this.nomenclature);
                    else
                        System.out.println("Nomenclature Vide!");
                    break;
                case 4:
                    this.nomenclature.afficher_meme_domination();
                    System.out.println("\n");
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Donner la denomination de la piece principale: ");
                    String sPrin = sc.nextLine();
                    Piece pb3;
                    String flag4;
                    do {
                    System.out.print("S'agit-il d'une piece de Base Ou Composite? (b/c) ou (B/C): ");
                    flag4 = sc.nextLine();
                }while(!flag4.equals("b") && !flag4.equals("B") && !flag4.equals("C")&& !flag4.equals("c"));
                    System.out.print("Donner la reference de cette piece: ");
                    int ref3 = sc.nextInt();
                    int i3=0;
                    if(flag4.equals("b")|| flag4.equals("B")){
                        System.out.print("Donner le nombre d'occurence de cette piece: ");
                          i3 = sc.nextInt();
                          pb3 = new PieceDeBase(ref3, i3);
                    }else{
                        System.out.print("Donner le nom de la piece: ");
                        sc.nextLine();
                        String s2 = sc.nextLine();
                        System.out.print("Donner le poids de cette piece: ");
                        float f2 = sc.nextFloat();
                        pb3 = new PieceComposite(s2,f2,ref3);
                    }

                    for (Map.Entry<Integer, Piece> entry : nomenclature.toutesPieces.entrySet()) {
                        Piece piece = entry.getValue();
                        if (sPrin.equals(piece.getDenomination()) && piece.getClass() == PieceComposite.class) {
                             ((PieceComposite) piece).ajouter_piece(pb3,i3);
                            break;
                        }
                    }
                    nomenclature.ajouter(ref3,pb3);
                    break;
                case 6:
                    boolean flag3=false;
                    System.out.print("Donner la denomination de la piece: ");
                    sc.nextLine();
                    String s4 = sc.nextLine();
                    for (Map.Entry<Integer, Piece> entry : nomenclature.toutesPieces.entrySet()) {
                        Piece piece = entry.getValue();
                        if (s4.equals(piece.getDenomination())) {
                            flag3 = true;
                            System.out.println(piece);
                            break;
                        }
                    }
                    if(!flag3)
                    System.out.println("La piece n'existe pas!");
                    break;
                case 7:
                    boolean flag5 = false;
                    System.out.print("Donner la reference de la piece à supprimer: ");
                    sc.nextLine();
                    int s5 = sc.nextInt();
                    for (Map.Entry<Integer, Piece> entry : nomenclature.toutesPieces.entrySet()) {
                        Piece piece = entry.getValue();
                        if (s5 == piece.getReference()) {
                            nomenclature.supprimer_piece(piece);
                            flag5=true;
                            break;
                        }
                    }
                    if (!flag5)
                    System.out.println("La piece n'existe pas");
                    break;
                case 8:
                    this.nomenclature.trier();
                    break;
                case 9:
                    Scanner scanner  = new Scanner(System.in);
                    String nomFichier;
                    System.out.print("Donner le nom du fichier: ");
                    nomFichier =scanner.nextLine();
                    System.out.print("");
                    assert nomenclature != null;
                    try {
                        this.nomenclature.sauvegarder_nomenclature(nomFichier);
                    } catch (IOException e) {
                        System.out.println("Une exception!!  faite attention aux entrées");
                    }
                    break;

                case 10:
                    Scanner scan  = new Scanner(System.in);
                    String nomNomen;
                    System.out.print("Donner le nom du fichier: ");
                    nomNomen =scan.nextLine();
                    System.out.println(nomNomen);
                    assert nomenclature != null;
                    try {
                        this.nomenclature = Nomenclature.lire_nomenclature(nomNomen);
                    } catch (IOException e) {
                        System.out.println("lire nomenclature ne marche pas avec cet entrée :(");
                    }
                    break;
                case 0:
                    System.out.println("Au revoir ...");
                    return;
                default:
                    System.out.println("Choix ne correspond pas");
                    break;
            }
        }while(choix != -1);

    }
    public static void main(String[] args) {
        boolean flagGenerale= false;
        do {
            try {
                MainMenu mainMenu = new MainMenu();
                mainMenu.Menu();

            }catch (Exception e){
                System.out.println("Les entrées ne marchent pas!!!!!!!!!!!");
                flagGenerale = true;
            }
        }while (flagGenerale);
        }
}
