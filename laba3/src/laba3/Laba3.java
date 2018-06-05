package laba3;
import java.util.Random;

public class Laba3 {

    public static void main(String[] args) {
        //This is first
      int n;
        int[] arr = new int [] 
        {
            2, 4, 6, 8, 10, 12, 14, 16, 18, 20
        };
        n = arr.length;
        for (int i = 0; i<n; i++)
        {
         System.out.print (arr[i] + " ");   
        }
        
        System.out.println ();
        
        for (int i = 0; i<n; i++)
        {
         System.out.println (arr[i]);   
        }
        
        
        //This is second
    int[] arr2;
    arr2 = new int[100];
    for (int i = 0; i < 100; i++) {
        if (i % 2 == 1) {
            arr2[i] = i;
            System.out.print(arr2[i] + " ");
        }
    }
    System.out.println("\n");
    for (int i = 100 - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (arr2[j] < arr2[j + 1]) {
                int tmp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = tmp;
            }
        }
    }
    for (int a = 0; a < 100; a++) {
        if (a < 50) {
            System.out.print(arr2[a] + " ");
        }   
    }
    
    
    //This is third
    int b=0;
        int[] Mas = new int[15];
        for(int i=0;i<Mas.length;i++){
            Random rnd=new Random();
            Mas[i]=rnd.nextInt(10);
            System.out.print(Mas[i] +" ");
            if(Mas[i]>0&Mas[i]%2==0)b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве "+b+" четных");
        
        
        //This is fouth
         int[][] Mas2 = new int[8][5];
        //Заполним массив при помощи двух вложенных циклов, первым (внешним циклом заполним значения строк, вторым (внутренним) значения столбцов
        for(int i=0;i<Mas2.length;i++){
            for(int j=0;j<Mas2[i].length;j++){
                Mas2[i][j]=(int)(Math.random()*90)+10;
                System.out.print(Mas2[i][j]+" ");
            }
            System.out.println(" ");
            
        }
        //This is fifth
         int [][] Mas3 = new int[7][4];
        //Для хранения значений произведения элементов строк, создадим простой массив размером равным количеству строк двумерного массива
        int [] Mas4 = new int[Mas3.length];
        //Заполним двухмерный массив
        for(int i =0;i<Mas3.length;i++){
            //Для информативности - перед каждой строкой массива будет выведен ее индекс
            System.out.print("Строка №"+i+" ");
            for(int h=0;h<Mas3[i].length;h++){
                Mas3[i][h]=(int)(Math.random()*11)-5;
                System.out.print(Mas3[i][h]+" ");
                //Заполним второй массив, путем перемножения всех элементов определенной строки двумерного массива
                if(h==0)Mas4[i]=Mas3[i][h];
                else Mas4[i]*=Mas3[i][h];
                //Для удобства восприятия каждую новую строку будем выводить с абзаца
                if(h==Mas3[i].length-1)
                    System.out.println(" ");
            }
        }
        //Создадим переменные, в которых будут храниться значения максимального произведения по модулю элеметов строк и индекс такой строки
        int max=0,max_i=0;
        //Переберем элементы второго массива, и выберем больший по модулю. Запомним его а также индекс этого элемента, который будет равняться индексу строки двумерного массива
        for(int i=0;i<Mas4.length;i++){
            if(Math.abs(Mas4[i])>max){
                max=Mas4[i];
                max_i=i;
            }
        }
        //Выведем информацию на экран
        System.out.println("Строка с наибольшим по модулю произведением элементов ("+max+") имеет индекс - "+max_i);
    }
    
}