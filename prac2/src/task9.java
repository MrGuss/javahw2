import java.util.ArrayList;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class task9 {
    public static void main(String[] args){
        //Init deck
        String suits[] = {"H", "T", "C", "P"};
        String values[] = {"2", "3", "4", "5", "6", "7",
        "8", "9", "10", "J", "Q", "K", "A"};
        String deck[] = new String[52];
        int i = 0;
        for (String s:suits){
            for (String v:values){
                deck[i] = s+v;
                i++;
                //System.out.println(deck[s*v]);
            }
        }
        for (String str:deck){
            System.out.println(str);
        }

        //Init number of players
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int num = sc.nextInt();
        if (num<=0) {
            System.out.println("Too few players");
            System.exit(-1);
        }
        if (5*num>52) {
            System.out.println("Too much players");
            System.exit(-1);
            //return -2;
        }

        ArrayList<String> list = new ArrayList<String>();
        for (int n=0; n<num; n++){
            for (int c=0; c<5; c++){
                //list.add
            }
        }
    }
}
