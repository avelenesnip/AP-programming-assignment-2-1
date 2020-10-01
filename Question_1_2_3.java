import java.util.Scanner;

class Question_1_2_3 {
 
    public static void main ( String [] args) {
        
        Scanner sc = new Scanner(System.in);
        double x = 0;
        int    y = 0;
          
        
        // Question # 1
        
        y = 1/4;
        System.out.println("1. a) 1/4 = " + y);
        
        x = 4.0/2;
        System.out.println("   b) 4.0/2 = " + x);
        
        x = 1.0/4.0;
        System.out.println("   c) 1.0/4.0 = " + x);
        
       
        System.out.println("   d) int x = 4.0/2 = ERROR");
        
        x = 1/2;
        System.out.println("   e) 1/2 = " + x);
        
        
        
        //Question # 2
        
        x = 1.0/3;
        System.out.println("2. double y = 1.0/2 = " + x);
        
        
        
        //Question # 2
        
        y = (int) 4.999;
        System.out.println("3. a) int x = (int) 4.999 = " + y);
        
        x = (int) 0.999;
        System.out.println("   b) double x = (int) 0.999 = " + x);
        
        System.out.println("   c) int x = (double) 8 = ERROR");
        
        y = (int) 4.999 / (int) 2.5;
        System.out.println("   d) int x = (int) 4.999 / (int) 2.5; = " + y);
        
        y = (int) (4.5/0.9);
        System.out.println("   e) int x = (int) (4.5/0.9); = " + y);
      
    } 
       
    
    
}
