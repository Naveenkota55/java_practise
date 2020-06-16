import java.util.Scanner;
public class calMain {
    public static void main(String args[]){
        Boolean onRepeat=true;
        int Count=3;
        Boolean Count1=false;
        while (onRepeat){
            System.out.println("Choose a option: 1. Addition 2. Substraction  3. Multiplication  4. Division  5. exit");
            Scanner input = new Scanner(System.in);
            int userInput1=input.nextInt();
            if ((userInput1<=4) && (userInput1>=1) ){
                System.out.println("Do you wanna enter the values? y/n ");
                String userInput2=input.next();
                if (userInput2.toUpperCase().equals("N")){
                    System.out.println("do you want to continue with default values 10 & 5? y/n");
                    userInput2=input.next();
                    if (userInput2.toUpperCase().equals("Y")){
                        Calculator Variables1= new Calculator(10, 5);
                        if (userInput1==1){
                            System.out.println(Variables1.calAdd());}
                        else if (userInput1==2){
                            System.out.println(Variables1.calSub());}
                        else if (userInput1==3){
                            System.out.println(Variables1.calMul());}
                        else if (userInput1==4){
                            System.out.println(Variables1.calDiv());}
                        
                    } else { onRepeat=false;}
                } else if(userInput2.toUpperCase().equals("N")) {
                    System.out.println("Enter the first value:");
                    int userInput3= input.nextInt();
                    System.out.println("Enter the Second value:");
                    int userInput4= input.nextInt();

                    if ((userInput1==4) & ((userInput3==0) | (userInput4==0))){
                        System.out.println("Invalid input!, make sure neither values are equal to zero for division");
                    }
                    else {
                        Calculator Variables2= new Calculator(userInput3, userInput4);
                        if (userInput1==1){
                            System.out.println(Variables2.calAdd());}
                        else if (userInput1==2){
                            System.out.println(Variables2.calSub());}
                        else if (userInput1==3){
                            System.out.println(Variables2.calMul());}
                        else if (userInput1==4){
                            System.out.println(Variables2.calDiv());}
                    }
                }else{
                    System.out.println("Invalid Selection!");
                    Count=Count-1;
                    if (Count==0){
                        Count1=true;
                }
            } else if ((userInput1==5) | (Count1==true)){
                System.out.println("Closing Application!");
                onRepeat=false;
                input.close();
            }
            else {
                System.out.println("Invalid Selection!");
                Count=Count-1;
                if (Count==0){
                    Count1=true;
                }
            }
        }

    }
    
    }