import java.util.Scanner;

public class task10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        int ptr = 0;
        int sum = 0;
        while (str.indexOf(" ", ptr)!=-1){
            sum+=1;
            ptr = str.indexOf(" ", ptr)+1;
        }
        if (!(str.lastIndexOf(" ")==(str.length()-1))){
            sum+=1;
        }
        System.out.println("You string has "+sum+" word");
    }
}
