package guessme;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
       System.out.println("Welcomeu to my game");
       
       System.out.println("Please Enter your name:");

       Scanner sc=new Scanner(System.in);   
       
       String username=sc.next();
       
       System.out.println("Hello "+username);
       
       System.out.println("Ok,Let's start the game:");
       
       System.out.println("\t1.Yes");
       System.out.println("\t2.No");
       
        System.out.println("Enter your option....");
        
        int option=sc.nextInt();
        
        while(option!=1){
        System.out.println("Ok,Let's start the game:");
        System.out.println("\t1.Yes");
        System.out.println("\t1.No");
       
        System.out.println("Enetr an option....");
        
        option=sc.nextInt();
        }
        
        Random random=new Random();
        //int bound=20;
        int x=random.nextInt(20) + 1;
        System.out.println("please guess the number between 1-20..");
        int userInput=sc.nextInt();
        
        int timesTried=0;
        boolean hasWon=false;
        boolean shouldFinish=false;
        
        while(!shouldFinish){
            timesTried++;
            if(timesTried<5){
                if(userInput==x){
                    
                    hasWon=true;
                    shouldFinish=true;
                }
                else if(userInput>x){
                    System.out.println("Guess lower value.");
                    userInput=sc.nextInt();
                }
                else{
                    System.out.println("Guess higher value.");
                    userInput=sc.nextInt();
                }
            }else{
                shouldFinish=true;
            }
        }
        if(hasWon==true){
            System.out.println("You Won,you have guess in your "+timesTried+" guess");
        }else{
            System.out.println("Better luck next time...");
        }
    }
    
}
