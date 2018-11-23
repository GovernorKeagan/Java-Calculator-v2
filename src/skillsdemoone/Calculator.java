package skillsdemoone;
import java.util.Scanner;

public class Calculator {

    public static double finalAnswer, firstNumber, secondNumber, addAnswer, subtractAnswer, divideAnswer, multiplyAnswer;

    public static void main(String[] args) {     
        //Declaring variables to be used for calculations
        String numOperation;
        Boolean isAdd, isSub, isDiv, isMulti;
                
        //Create a new scanner class with the name userInput
        Scanner userInput = new Scanner(System.in);
        
        //Creating a heading using print statements
        System.out.println("  _   _   _   _   _   _   _   _   _   _  ");
        System.out.println(" / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ ");
        System.out.println("( C | a | l | c | u | l | a | t | o | r )");
        System.out.println(" \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ ");
        
        //Ask the user to type in their first number, and then we store it in the variable firsNumber
        System.out.println("\nPlease enter your first number: ");
        firstNumber = userInput.nextDouble();
        
        //Ask the user to type in their second number, and then we store it in the variable secondNumber
        System.out.println("Please enter your second number: ");
        secondNumber = userInput.nextDouble();
        
        //Ask the user to choose a operation and take the value and store it in numOperation
        System.out.println("Please enter your operation (+ - * /): ");
        numOperation = userInput.next();
        
        //Initialize answer variables, that were decalred at the top of the program, so that we can use them to get answers.
        addAnswer = firstNumber + secondNumber;
        subtractAnswer = firstNumber - secondNumber;
        divideAnswer = firstNumber / secondNumber;
        multiplyAnswer = firstNumber * secondNumber;
        
        
        isAdd = numOperation.equals("+");
        isSub = numOperation.equals("-");
        isDiv = numOperation.equals("/");
        isMulti = numOperation.equals("*");
            
            if(isAdd){
                Calculator.tooLarge();
            }
            else if(isSub){
                Calculator.tooLarge(); 
            }
            else if(isDiv){
                Calculator.tooLarge();
            }
            else if(isMulti){
                Calculator.tooLarge();
            }
            else{
                System.out.println("Plese select a valid option.");
            }
        } 
    
        public static void tooLarge() {

            if(finalAnswer > (2^31) || finalAnswer < (-2^31) ){
                System.out.println(firstNumber +  " added to  " + secondNumber + " = " + (long)addAnswer);
            }
            else{
                System.out.println(firstNumber +  " added to  " + secondNumber + " = " + addAnswer);
            }
            
            if(finalAnswer > (2^31) || finalAnswer < (-2^31) ){
                System.out.println(firstNumber +  " subtracted by  " + secondNumber + " = " + (long)subtractAnswer);
            }
            else{
                System.out.println(firstNumber +  " subtracted by  " + secondNumber + " = " + subtractAnswer);
            }
            
            if(finalAnswer > (2^31) || finalAnswer < (-2^31) ){
                System.out.println(firstNumber +  " divided by  " + secondNumber + " = " + (long)divideAnswer);
            }
            else{
                System.out.println(firstNumber +  " divided by  " + secondNumber + " = " + divideAnswer);
            }
            
            if(finalAnswer > (2^31) || finalAnswer < (-2^31) ){
                System.out.println(firstNumber +  " multiplied by  " + secondNumber + " = " + (long)multiplyAnswer);
            }
            else{
                System.out.println(firstNumber +  " multiplied by  " + secondNumber + " = " + multiplyAnswer);
            }
        }
    } 
