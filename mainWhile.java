import java.util.Scanner;
public class mainWhile {
    public static void main(String[] args) {
        Boolean onRept=true;
        while (onRept){
            System.out.println("Enter your birth momnth :");
            System.out.println("enter the option : 1 or 2 or 3 or 4");
            String FirstChoice= "January";
            String SecondChoice="March";
            String ThirdChoice="July";
            String ForthChoice="June";
            System.out.println("1. "+FirstChoice+"  2. "+SecondChoice+"  3. "+ThirdChoice+"  4. "+ForthChoice);
            Scanner input= new Scanner(System.in);
            String userInput=input.next();
            String correctOption=ForthChoice.toLowerCase();
            
            if (userInput.toLowerCase().equals("4")){
                 System.out.println("Congrats! You have choosen right option");
                 onRept=false;
             } else if (userInput.toLowerCase().equals(correctOption)){
                 System.out.println("Congrats! You have choosen right option");
                 onRept=false;
             } else{
                 System.out.println("Wrong answer! Do you wanna try again ?  y/n");
                 userInput=input.next();
                 if (userInput.toLowerCase().equals("n")){
                    System.out.println("Get the fuck out of here");
                    onRept=false;
                    input.close();
                 }
                 
             }
            }

    }
    
}