import java.util.Scanner;
public class FactionalFibo {

	public static void main(String[] args) {
		display();
    }
    
    static void display() {
        Scanner sc = new Scanner(System.in);
        String get;
        String fact = "Factorial";
        String fibo = "Fibonacci";
        
        
        do{
        System.out.println("What do you like to obtain? (Factorial or Fibonacci?)");
        get = sc.nextLine();
     
        
        if ("Factorial".equals(get)){
            System.out.println("Input size of array: ");
            int size = sc.nextInt();
            int[] a = new int [size];
            
            System.out.println("Enter Elements: ");
                for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                }
                
                System.out.println("Factorial of Elements:");
                for (int i = 0; i < a.length; i++) {
                    System.out.print("f(" + a[i] + ")" + "\t");
                }
            System.out.println("");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(factorial(a[i]) + "\t");
                }
                break;
        }
          if ("factorial".equals(get)){
            System.out.println("Input size of array: ");
            int size = sc.nextInt();
            int[] a = new int [size];
            
            System.out.println("Enter Elements: ");
                for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                }
                
                System.out.println("Factorial of Elements:");
                for (int i = 0; i < a.length; i++) {
                    System.out.print("f(" + a[i] + ")" + "\t");
                }
            System.out.println("");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(factorial(a[i]) + "\t");
                }
                break;
        }
        
        else if ("Fibonacci".equals(get)){
            System.out.println("Input size of array: ");
            int size = sc.nextInt();
            int[] a = new int [size];
            
            System.out.println("Enter Elements: ");
                for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                }
                
                System.out.println("Fibonacci of Elements:");
                for (int i = 0; i < a.length; i++) {
                    System.out.print("f(" + a[i] + ")" + "\t");
                }
            System.out.println("");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(fibonacci(a[i]) + "\t");
                }
             break;   
        }
           else if ("fibonacci".equals(get)){
            System.out.println("Input size of array: ");
            int size = sc.nextInt();
            int[] a = new int [size];
            
            System.out.println("Enter Elements: ");
                for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                }
                
                System.out.println("Fibonacci of Elements:");
                for (int i = 0; i < a.length; i++) {
                    System.out.print("f(" + a[i] + ")" + "\t");
                }
            System.out.println("");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(fibonacci(a[i]) + "\t");
                }
             break;   
        }
            
        
        }while(get != fact && get != fibo);
        
        
    }
    
        static int factorial(int n){    
      if (n == 0)    
        return 1;    
      else    
        return(n * factorial(n-1));    
     }
        
         static int fibonacci(int n) {
        if (n<=1){
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
	}

}
