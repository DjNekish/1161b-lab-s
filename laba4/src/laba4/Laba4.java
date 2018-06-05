package laba4;

public class Laba4 {

    public static int randAB(int a,int b) 
    {   int c;
        if(a > b)
        {
            c=(int)(Math.random()*(a - b + 1))+b;
            return c;
        }
        else 
        {
            c=(int)(Math.random()*(b - a + 1))+a;
            return c;
        }
    }
    
    public static int [] fill(int [] n)
    {
        for(int i = 0; i < n.length; i++)
        {
            n[i] = randAB(1, 9); //тут задаётся отрезок a;b и 
        }
        return n;
    }
    
    public static void printing(int [] a)
    //метод, выводящий массив в строку с указанием номера массива
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
            if(i == a.length - 1)
                System.out.println();
        }
    }
    
    public static void ending(String task)
    //метод, показывающий конец каждого задания
    {
        System.out.println(task + " done!");
        System.out.println();
    }
    
    public static void bubble(int[] a) 
    {
        for (int i = a.length-1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
         
            {
                if (a[j] > a[j + 1])
                {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        for(int i = 0; i <  a.length; i++) 
        {
            System.out.print(a[i] + "  "); //вывод получившегося массива
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) 
    {
        int[] arr0 = new int[20];
        System.out.print("FIrst array is: ");
        fill(arr0);
        printing(arr0);
        ending("First");
        
        int[] arr1 = new int[10];
        System.out.print("In the one: ");
        fill(arr1);
        printing(arr1);
        
        int[] arr2 = new int[10];
        System.out.print("In the two:");
        fill(arr2);
        printing(arr2);
        
        int[] arr3 = new int[10];
        System.out.print("In the three : ");
        fill(arr3);
        printing(arr3);
        
        int[] arr4 = new int[10];
        System.out.print("In the four:");
        fill(arr4);
        printing(arr4);
        
        int[] arr5 = new int[10];
        System.out.print("In the five: ");
        fill(arr5);
        printing(arr5);
        ending("Second");
        
        int[] a = arr5;
        bubble(a); 
        ending("Third");
        System.out.print("I do it");
    }
}