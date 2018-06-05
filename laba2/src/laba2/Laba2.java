package laba2;

import java.util.Scanner;

public class Laba2 {

    public static void main(String[] args) {
        // первое задание
        int i;
        for (i=1; i<=100; i++){
            if (i%2==0)
            {
                System.out.println(i);
            }
            } 
            // второе задание
            int width, height, maxW, maxH; 
                Scanner num = new Scanner (System.in);
                 maxW = num.nextInt();
                 maxH = num.nextInt();
                for (height=1;height<=maxH;height++){
                    
                    for (width=1;width<=maxW;width++){
                        System.out.print(8);
                    }
                    System.out.println();
                }
                System.out.println("Compleate");
              
            //третье задание
            maxH = num.nextInt();
            for (height=1;height<=maxH;height++){
    for (width=1;width<=height;width++){
        System.out.print(8+" ");
    }
    System.out.println();
    }
    System.out.println("Compleate");  
      //четвертое задание
    int a,b;
    a = num.nextInt();
    b = num.nextInt();
    if (a>b){
        System.out.println(a+" больше " +b);
    } else if (b>a)
    {
        System.out.println(b+" больше " +a);
    } else 
    {
        System.out.println(a+" равен " +b);
    }
    System.out.println("Compleate");
      
          
     }  
        }
    
    
    
    
   
        
        
    
    

