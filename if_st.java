import java.util.Scanner;
public class if_st {
    public static void main(final String args[]){
        System.out.println("Pick a number between 1 to 10");
        Scanner input= new Scanner(System.in);
        int inpNum=input.nextInt();
        input.close();
        if (inpNum<=5){
            System.out.println("you won! Dude");
        } else {
            System.out.println("you loose");
        }

    }
    
}