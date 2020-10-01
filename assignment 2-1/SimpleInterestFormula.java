import java.util.Scanner;

class SimpleInterestFormula {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        double A = 0, P = 0, r = 0, n = 0;
        

        System.out.println("Simple Interest Calculator");
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Enter the Principle: ");
        P = sc.nextDouble();
        System.out.print("Enter the rate: ");
        r = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        n = sc.nextDouble();
        
   
        A = P * Math.pow((1+r),n);
        System.out.println("The interest amount is " + A + " dollars.");
    } 
       
    
    
}
