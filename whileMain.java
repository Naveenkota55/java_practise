import java.util.Scanner;
public class whileMain {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        boolean isOn= true;
        while (isOn){
            System.out.println("is on repeat");
            System.out.println("do you want to stop the repeat? enter yes or no");
            String userInput=input.next();
            if (userInput.toLowerCase().equals("yes")){
                isOn=false;
                input.close();
            }

        }
        System.out.println("playing Next");


    }
}