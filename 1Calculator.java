import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		 double num1, num2;
	        Scanner abenes = new Scanner(System.in);
	        
	        System.out.print("Enter first number:");
	        num1 = abenes.nextDouble();
	        System.out.print("Enter second number:");
	        num2 = abenes.nextDouble();

	        System.out.print("Enter an operator ");
	            
	       String operator = abenes.next();

	       
	        

	        switch(operator)
	        {
	             case "+": 
	            System.out.println(num1 + "+" +num2+ "="+ (num1 + num2));
	                break;
	             case "add":
	                System.out.println(num1 + "add" +num2+ "= "+ (num1 + num2));

	            case "-":
	            	System.out.println(num1 + "-" +num2+ "="+ (num1 - num2));
	                break;
	             case "minus":
	            	System.out.println(num1 + "minus" +num2+ "= "+ (num1 - num2));
	                break;
	            case "*":
	            	System.out.println(num1 + "*" +num2+ "= "+ (num1 * num2));
	                break;
	             case "multiply":
	            	System.out.println(num1 + "multiply" +num2+ "="+ (num1 * num2));

	            case"/":
	            	System.out.println(num1 + "/" +num2+ "="+ (num1 / num2));
	                break;
	             case"divide":
	                 System.out.println(num1 + "divide" +num2+ "="+ (num1 / num2));
	            
	            default:
	                System.out.printf("You have entered wrong operator");
	                return;
	        }
	    }
	}