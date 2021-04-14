package MiniProjet;

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

                    System.out.print("Donner le nom de la piece: ");
                    String s2 = sc.nextLine();
                    Piece pb1;
                if(flag2.equals("b")|| flag2.equals("B")){
                    System.out.print("Donner le poids de cette piece: ");
                     float f2 = sc.nextFloat();
                      pb1 = new PieceDeBase(s2, f2);
                }else{
                      pb1 = new PieceComposite(s2);
                }
                    System.out.print("Donner la reference de cette Piece: ");
                    int ref1 = sc.nextInt();
                    if(nomenclature == null)
                        this.nomenclature = new Nomenclature("Default");
                    String flag="";
                    System.out.print("La piece est fragile? (y/n)ou (Y/N) : ");
                    sc.nextLine();
                   flag = sc.nextLine();
                    if(flag.equals("y") || flag.equals("Y")) {
                        this.nomenclature.ajouter_piece_fragile(ref1, pb1);
                        break;
                    }
                        this.nomenclature.ajouter(ref1, pb1);
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
                    System.out.print("Donner la denomination de la piece principale: ");
                    sc.nextLine();
                    String sPrin = sc.nextLine();
                    System.out.print("Donner la denomination de la piece: ");
                    String s3 = sc.nextLine();
                    System.out.print("Donner le nombre d'occurence de cette piece: ");
                    int i3 = sc.nextInt();
                    PieceDeBase pb3 = new PieceDeBase(s3, i3);

                    for (Map.Entry<Integer, Piece> entry : nomenclature.toutesPieces.entrySet()) {
                        Piece piece = entry.getValue();
                        if (sPrin.equals(piece.getDenomination()) && piece.getClass() == PieceComposite.class) {
                             ((PieceComposite) piece).ajouter_piece(pb3, i3);
                            break;
                        }
                    }
                    System.out.print("Donner la reference de cette piece: ");
                    int ref = sc.nextInt();
                    nomenclature.ajouter(ref, pb3);
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
                    boolean flag4=false;
                    System.out.print("Donner le nom de la piece à supprimer: ");
                    sc.nextLine();
                    String s5 = sc.nextLine();
                    for (Map.Entry<Integer, Piece> entry : nomenclature.toutesPieces.entrySet()) {
                        Piece piece = entry.getValue();
                        if (s5.equals(piece.getDenomination())) {
                            nomenclature.supprimer_piece(piece);
                            flag4=true;
                            break;
                        }
                    }
                    if (!flag4)
                    System.out.println("La piece n'existe pas");
                    break;
                case 8:
                    this.nomenclature.trier();
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
