package MiniProjet;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
      /*  System.out.println("---------------------------start reading file--------------------------------");
        long start = System.currentTimeMillis();
        //   String file ="/home/oes/Documents/Java_OCP11/src/MiniProjet/files/test2.nom";
        Path path = Paths.get("src/MiniProjet/files/test1.nom");
        BufferedReader reader = Files.newBufferedReader(path);
        String line;
        String nomNomenclature ="";
        String nomComposite="";
        int refComposite;
        float poidComposite = 0;
        int refBase;
        float poidBase=0;
        int Lines=0;
        boolean flagLine=false;
        Nomenclature nomenclature;
        while((line = reader.readLine())!=null){
            line = line.stripLeading();
            line = line.stripTrailing();
            String[] t = line.split(" ");
            Lines++;
            if(Lines==1){
                nomNomenclature =t[0];
                 nomenclature = new Nomenclature("JPDL");
            }else if(t.length == 3){
                refComposite =Integer.parseInt(t[0]);
                nomComposite = t[1];
                poidComposite =Float.parseFloat(t[2]);
                PieceComposite pieceComposite = new PieceComposite(nomComposite);
                System.out.println("Nom: "+nomComposite+"  ref: "+refComposite+" poids: "+poidComposite);
            }else if(t.length == 2){
                refBase =Integer.parseInt(t[0]);
                poidBase =Float.parseFloat(t[1]);
                if(refBase == -1){
                    flagLine= true;
                    System.out.println("-----------------------------");
                    continue;
                }
                PieceDeBase pieceDeBase = new PieceDeBase(refBase,poidBase);
                System.out.println("        ref: "+refBase+" poids: "+poidBase);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("IN:"+((end-start)*0.001)+" seconds");

        System.out.println("----------------------------end of file----------------------------------");


*//*        pieceComposite1.ajouter_piece(pieceDeBase,2);
        pieceComposite1.ajouter_piece(pieceDeBase,2);
        pieceComposite2.ajouter_piece(pieceDeBase1,10);
        pieceComposite2.ajouter_piece(pieceDeBase1,10);
        pieceComposite1.ajouter_piece(pieceComposite2,1);*//*

 *//*          try{
             System.out.println(pieceComposite1.getPoid());
             pieceComposite1.affiche_tous_sous_pieces(10);
          } catch (Exception e) {
               System.out.println("We are Sorry A lot of Exceptions appear in  this banch of code");
           }
*//*
     //   Nomenclature nomenclature = new Nomenclature("JPDL");
       *//*  nomenclature.ajouter(123,pieceDeBase );
         nomenclature.ajouter(1255,pieceDeBase1);
         nomenclature.ajouter(124,pieceComposite1);
         nomenclature.ajouter(124,pieceComposite1);
         nomenclature.ajouter(124,pieceComposite1);
         nomenclature.ajouter(124,pieceComposite1);*//*
        try {
            System.out.println(nomenclature.toString());
        } catch (Exception e) {
            System.out.println("We have an exception");
        }
        Piece p = nomenclature.chercherUnePiece(121);
        System.out.println(p);
        // nomenclature.afficher_toutes_pieces_composites(pieceComposite1);
       nomenclature.supprimer_piece(pieceDeBase1);
        System.out.println("------------------------------------------");
        try {
            System.out.println(nomenclature.toString());
        } catch (Exception e) {
            System.out.println("We have an exception");
        } */
        Nomenclature nomenclature = new Nomenclature("TEST");
        PieceDeBase pieceDeBase = new PieceDeBase(120,11);
        PieceDeBase pieceDeBase1 = new PieceDeBase(119,11);
        PieceDeBase pieceDeBase2 = new PieceDeBase(1908,11);
        PieceDeBase pieceDeBase3 = new PieceDeBase(1901,11);
        PieceComposite pieceComposite = new PieceComposite("test",11.33F,1990);
        pieceComposite.ajouter_piece(pieceDeBase,10);
        pieceComposite.ajouter_piece(pieceDeBase,10);
        pieceComposite.ajouter_piece(pieceDeBase1,10);
        pieceComposite.ajouter_piece(pieceDeBase2,10);

        nomenclature.ajouter(1990,pieceComposite);
        pieceComposite.ajouter_piece(pieceDeBase3,1902);
        System.out.println(nomenclature);
    }
}

// 2.1:  Une grande quantité des exceptions sera levées


