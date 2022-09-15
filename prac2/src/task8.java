//import java.util.Scanner;

public class task8 {

    public static void main(String[] arg){
        //Scanner sc = new Scanner(System.in);
        String mas[] = {"a", "b", "c", "d", "e"};
        String buf = "";
        for (int i=0; i<mas.length/2; i++){
            buf = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length-i-1] = buf;
        }
        for (String str : mas){
            System.out.println(str);
        }

    }
}
