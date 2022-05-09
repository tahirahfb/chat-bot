import java.util.Scanner;

public class ChatBot {
    
    // 1. Greeting the user
    public static String greeting(){
        return "Hi, User. \nI'm Robot, they call me Bot for short!";
    }

    // 2. Asking the user to repeat their name
    public static void repeatName(){
        Scanner input = new Scanner(System.in);

        int repeat = 0;

        while (repeat <= 2){
        System.out.println("User, tell me your name!");
        String name = input.nextLine();

        repeat++;

    
        }

    }

    // 3. Guessing the user's age

    public static void guessAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("How old was your mother when she gave birth to you?");
        int momAge = Integer.valueOf(input.nextLine());
        System.out.println("How old is your mother now?");
        int momCurrentAge = Integer.valueOf(input.nextLine());

        int guess = momCurrentAge - momAge;
        System.out.println("My guess is you're " + guess + " years old!");

    }

    // 4. Counting to any number that the user wants

    public static void counting(){
        Scanner input = new Scanner(System.in);

        System.out.println("Let's count! Pick a whole number and we'll count to it!");
        int count = Integer.valueOf(input.nextLine());

        for(int i = 0; i <= count; i++){
            System.out.println(i);
        }
    }

    // 5. Testing the user's "programming knowledge"

    public static void testTheUser(){
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the letter that corresponds to the correct answer:");
        System.out.println("_____" + " exists as long as the application runs and is larger than " + "______" +
        " which is temporary, but faster.");
        System.out.println("A. Stack, Heap Space \nB. RAM, Cache \nC. Heap Space, External\nD. Heap Space, Stack");
        String answer = input.nextLine();

        while (!(answer.equalsIgnoreCase("d"))){

            System.out.println("Incorrect! Take another guess!");
            String guessAgain = input.nextLine();

            if (guessAgain.equalsIgnoreCase("d")){
                System.out.println("Correct!");
                return;
            }

        }

        System.out.println("Correct!");
    }

    // Level 3

    public static void switchStatement(){
        Scanner input = new Scanner(System.in);

        System.out.println("Pick a number, 1 - 7, that corresponds to a day of the week (1 for Sun, 2 for Mon, etc):");
        int num = Integer.valueOf(input.nextLine());

        switch(num){

            case 1: System.out.println("I'm busy on Monday");
            break;

            case 2: System.out.println("Taco Tuesday");
            break;

            case 3: System.out.println("The work week is almost over on Wednesday");
            break;

            case 4: System.out.println("Work from home Thursday");
            break;

            case 5: System.out.println("Friday, the last day before the weekend");
            break;

            case 6: System.out.println("Saturday, the first day of the weekend");
            break;

            case 7: System.out.println("Sunday, the day before Monday :-(");
            break;

            default: System.out.println("Invalid Number!");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(greeting());
        repeatName();
        guessAge();
        counting();
        testTheUser();
        switchStatement();
    }



}
