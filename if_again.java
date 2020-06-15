import java.util.Scanner;
public class if_again {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        int givenInput=input.nextInt();
        input.close();
        if (givenInput<5){
            System.out.println("you choose lower number");
        } else {
            System.out.println("you choose number greater than 5");
        }



    }
}