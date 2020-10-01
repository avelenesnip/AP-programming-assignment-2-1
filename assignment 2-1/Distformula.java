import java.util.Scanner;

class Distformula {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        double xA = 0, yA = 0, xB = 0, yB = 0;
        double distance = 0;

        System.out.println("Distance Calculator");
        System.out.println("----------------------");
        System.out.println("");
        System.out.print("Enter the x coordinant for point A: ");
        xA = sc.nextDouble();
        System.out.print("Enter the y coordinant for point A: ");
        yA = sc.nextDouble();
        System.out.print("Enter the x coordinant for point B: ");
        xB = sc.nextDouble();
        System.out.print("Enter the y coordinant for point B: ");
        yB = sc.nextDouble();
   
        distance = Math.sqrt ( Math.pow((xB-xA),2) + Math.pow((yB-yA),2));
        System.out.println("The distance between point A and point B is " + distance + " units.");
    } 
       
    
    
}
