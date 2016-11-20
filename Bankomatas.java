


package lt.vcs;

import java.util.Scanner;

public class Bankomatas {
    
     
    
    public static void main(String[] args) {
        
        bankas();
    }
   
        public static void bankas(){
            int likutis = 350;
            int komanda;
            int naujas;
            int klaida = 0;
        int pinas;
        int pinkodasas = 5454;
        int bandimas = 0;
        boolean baigti = false;
        System.out.println("Iveskite Pin - Koda");
        Scanner pinkodas = new Scanner(System.in);
                pinas = pinkodas.nextInt();
                
               do
               {bandimas++;
                if(pinas == pinkodasas && bandimas < 4){
             
            System.out.println("Sveiki atvykę");
                System.out.println("Norėdami sužinoti savo saskaitos likutį, paspaskite 1");
                System.out.println("Norėdami išgryninti pinigus, paspauskite 2");
                System.out.println("Norėdami pakeisti slaptažodį, paspauskite 3");
                System.out.println("Norėdami išeiti, paspauskite 4");
                
                komanda = pinkodas.nextInt();
                
                if(komanda == 1) {
                    System.out.println("Jūsų saskaitos likutis = " + likutis);
                    System.out.println("Norėdami grįžti - iveskite bet koki skaiciu");
                    komanda = pinkodas.nextInt();
                    komanda = klaida;
                }
                if (komanda == 2) {
                    
                    System.out.println("Kokią pinigų sumą norite pasiimti ? (Įveskite suma) ?");
                    komanda = pinkodas.nextInt();
                    if (likutis >= komanda){
                    likutis -=komanda;
                    System.out.println("Pasiėmėte iš bankomato = " + komanda ); // klausimas
                    System.out.println("Norėdami grįžti - iveskite bet koki skaiciu");
                    komanda = pinkodas.nextInt();
                    komanda = klaida;}
                    else{
                        System.out.println("Klaida nepakanka pinigu");
                        System.out.println("Norėdami grįžti - iveskite bet koki skaiciu");
                    komanda = pinkodas.nextInt();
                    komanda = klaida;
                    }
                }
                if(komanda == 3){
                    
                    System.out.println("Įveskite naują slaptažododį");
                    komanda = pinkodas.nextInt();
                    System.out.println("Pakartokite naują slaptažododį");
                    naujas = pinkodas.nextInt();
                    if(komanda == naujas){
                    System.out.println("Slaptažodis sekmingai pakeistas !!!");
                    System.out.println("Norėdami grįžti - iveskite bet koki skaiciu");
                    komanda = pinkodas.nextInt();
                    komanda = klaida;
                    }
                    else {
                         System.out.println("Slaptažodžiai NESUTAMPA !!!");
                         System.out.println("Norėdami grįžti - iveskite bet koki skaiciu");
                    komanda = pinkodas.nextInt();
                    komanda = klaida;
                    }
                }
                if(komanda == 4)
                {
                    System.out.println("Pasiimkite savo kortelę");
                    break;
                     }
                }
                 if (pinas != pinkodasas && bandimas < 3 ){
                 System.out.println("Jūs įvedėte neteisingą PIN kodą");
                 System.out.println("Įveskite Pin - Kodą");
                 pinas = pinkodas.nextInt();
                }
                 else if (pinas != pinkodasas && bandimas == 3 ){
                    System.out.println("Jūs tris kartus įvedėte neteisingą PIN kodą. Jūsų kortelė užblokuota");
                    break;
                    
                }
               }
               while (baigti = true);
               }
        }
