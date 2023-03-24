import java.util.Scanner;

/**
 DRAGONS & Iek delta
 */
public class Game
{
    public static void main(){
        int answer;
        System.out.println("Kalos eirthes sto iek delta, akous fones apo ton imiorofo th kaneis");
        System.out.println("1-Feybgo pros ta Coffe Island");
        System.out.println("2-aneueno me to asnaser");
        System.out.println("3-Aneyeno apo ths skales");
        System.out.println("Pata to noumero ths epiloghs ");
        
        Scanner myObj = new Scanner (System.in);
        answer = myObj.nextInt();
        
        if(answer==1){
            System.out.println("eisai floros kai se troh o drakos");
        }
         else if(answer==2){
            System.out.println("Mpainhs sto asanser, kleinhnoun h portes kai blepeis dipla sou 2 zombi");
            System.out.println("1-to paizeis kai esu zobie");
            System.out.println("2-parkalas ta zobie na mhn se fane ");
            System.out.println("3-ta baras");
            answer = myObj.nextInt();
        
            if(answer==1){
            System.out.println("se mhrizoun kai meta se trone.TELOS PAIXNIDIOU ");
        }
         else if(answer==2){
            System.out.println("se katasparazoun.TELOS PAIXNIDIOU");
            }
            else if(answer==3){
            System.out.println("skotonhs ta zombie kai to asanser se paei sthn tarata kai katastreuete thn stigmh pou bgenhs");
            System.out.println("1-pidas sto dupla mpalkoni");
            System.out.println("2-prospathis na pas psana kato me ta skalia ");
            System.out.println("3-pidas apo thn taratsa kato");
            answer = myObj.nextInt();
            
            if(answer==1){
            System.out.println("parapatas kai skotonese.TELOS");
        }
        else if(answer==2){
            System.out.println("se katasparazoun ta zombie.TELOS");
            }
            else if(answer==3){
            System.out.println("Peftis pano se mia tenta kai sozese.");
            }
            }
        }   
        else if(answer==3){
            System.out.println("blepeis 1 kafe arkouda");
            System.out.println("1-thn arxizeis sta mpuketa");
            System.out.println("2-kaneis ton nekro ");
            System.out.println("3-trexeis");
            answer = myObj.nextInt();
            if(answer==1){
            System.out.println("se katasparazei h arkouda kai se skotoni arga kai basanistika.TELOS PAIXNIDIOU ");
        }
         else if(answer==2){
            System.out.println("h arkouda se parataei kai katebenei kato");
            System.out.println("1-pas sthn ethousa hpologiston");
            System.out.println("2-pas pros ta kato pou pige h arkouda ");
            System.out.println("3-pas pros thn eksodo kindinou");
            answer = myObj.nextInt();
            
            if(answer==1){
            System.out.println("klhdonoun h portes kai se skotonoun h hackers.TELOS");
        }
        else if(answer==2){
            System.out.println("harkouda den se katalabenei kai feubghs apo to ktirio ");
            }
            else if(answer==3){
            System.out.println("Se briskh h katharisria kai se skotonh giati nomoizeis oti eisai zombie.");
            }
        }
            else if(answer==3){
            System.out.println("katebeneis pros ta kato kai h arkouda se katasparazei.TELOS PAIXNIDIOU");
            }
        }
    else{
        System.out.println("Lathos"); 
    }
  } 
}

 