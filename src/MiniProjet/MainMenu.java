package MiniProjet;

import java.util.Scanner;

public class MainMenu {
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Nouvelle nomenclature");
        System.out.print("Donner le nom de cette Nomenclature: ");
        String s0 = sc.nextLine();
        Nomenclature nomenclature = new Nomenclature(s0);
        System.out.println("2-Ajouter une pièce sans ces composants");
        System.out.print("Donner le nom de la piece: ");
        String s1 = sc.nextLine();
        System.out.print("Donner le poids de cette piece: ");
        float f1 = sc.nextFloat();
        PieceDeBase pb1 = new PieceDeBase(s1,f1);
        System.out.print("Donner la reference de cette Piece: ");
        int ref1= sc.nextInt();
        nomenclature.ajouter(ref1,pb1);
        System.out.println("2-Ajouter une pièce sans ces composants");
        System.out.print("Donner le nom de la piece: ");
        sc.nextLine();
        String s2 = sc.nextLine();
        System.out.print("Donner le poids de cette piece: ");
        float f2 = sc.nextFloat();
        PieceDeBase pb2 = new PieceDeBase(s2,f2);
        System.out.print("Donner la reference de cette Piece: ");
        int ref2= sc.nextInt();
        nomenclature.ajouter(ref2,pb2);// piece normale
        System.out.println("3-Afficher la nomenclature");
        System.out.println(nomenclature); ///***
        System.out.println("4-Liste les pièces de même dénomination");
        nomenclature.afficher_meme_domination();
        System.out.println("\n");
        System.out.println("5-Ajouter un composant à une pièce");
        System.out.print("Donner la denomination de la piece: ");
        sc.nextLine();
        String s3 = sc.nextLine();
        PieceComposite pc = new PieceComposite(s3);
        System.out.print("Donner le nombre d'occurence de cette piece: ");
        int i3 = sc.nextInt();
        pc.ajouter_piece(pb1,i3);
        System.out.println("6-Afficher tous les détails d’une piece");
        try {
            pc.affiche_tous_sous_pieces(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("7-Supprimer une pièce");
        nomenclature.trier();
        nomenclature.supprimer_piece(pb1);
        nomenclature.supprimer_piece(pb1);
    }
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.Menu();
    }
}
