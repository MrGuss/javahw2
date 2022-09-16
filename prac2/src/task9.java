import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class task9 {
    public static void main(String[] args){
        //Init deck
        String suits[] = {"Spades ", "Clubs ", "Diamonds ", "Heart "};
        String values[] = {"2", "3", "4", "5", "6", "7",
        "8", "9", "10", "J", "Q", "K", "A"};
        String deck[] = new String[52];
        int i = 0;
        for (String s:suits){
            for (String v:values){
                deck[i] = s+v;
                //System.out.println(deck[i]);
                i++;
            }
        }

        //Init number of players
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int num = sc.nextInt();
        if (num<=1) {
            System.out.println("Too few players");
            System.exit(-1);
        }
        if (5*num>52) {
            System.out.println("Too much players");
            System.exit(-1);
        }

        //Drawing cards
        String players[] = new String[num];
        for (int p=0;p<num;p++){
            players[p] = "";
        }
        int buf = -1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rn = new Random();
        for (int n=0; n<num; n++){
            for (int c=0; c<5; c++){
                i++;
                buf = rn.nextInt(52);
                while (list.contains(buf)){
                    buf = rn.nextInt(52);
                }
                list.add(buf);
                players[n]+=deck[buf]+"\n";
            }
        }

        for (String player:players){
            System.out.println(player);
        }
    }
}
