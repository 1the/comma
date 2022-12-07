//remove all commas from a given string from user
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sen = input.nextLine();
        for(int i=0;i<sen.length(); i++)
        {
            if(sen.charAt(i)==',')
                sen=sen.replace(sen.charAt(i),' ');
        }
        System.out.println(sen);
    }
}