import java.util.Scanner;

class D6 {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, d10 = 0;
        
        d1 = (int) (Math.random()*6) +1;
        d2 = (int) (Math.random()*6) +1;
        d3 = (int) (Math.random()*6) +1;
        d4 = (int) (Math.random()*6) +1;
        d5 = (int) (Math.random()*6) +1;
        d6 = (int) (Math.random()*6) +1;
        d7 = (int) (Math.random()*6) +1;
        d8 = (int) (Math.random()*6) +1;
        d9 = (int) (Math.random()*6) +1;
        d10 = (int) (Math.random()*6) +1;
        
        System.out.println("Die roll 1 = " + d1 ); 
        System.out.println("Die roll 2 = " + d2 ); 
        System.out.println("Die roll 3 = " + d3 ); 
        System.out.println("Die roll 4 = " + d4 ); 
        System.out.println("Die roll 5 = " + d5 ); 
        System.out.println("Die roll 6 = " + d6 ); 
        System.out.println("Die roll 7 = " + d7 ); 
        System.out.println("Die roll 8 = " + d8 ); 
        System.out.println("Die roll 9 = " + d9 ); 
        System.out.println("Die roll 10 = " + d10 ); 
        
    } 
       
    
    
}
