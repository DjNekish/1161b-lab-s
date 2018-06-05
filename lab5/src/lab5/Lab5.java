package lab5;
import java.util.Scanner;

class Circle{
    private int x;
    private int y;
    private int r;
    public Circle(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус r:");
        if(in.hasNextInt()) r=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Введите кординаты x:");
        if(in.hasNextInt()) x=in.nextInt();
        else System.out.println("Введены неверные значения");
        System.out.print("Введите кординаты y:");
        if(in.hasNextInt()) y=in.nextInt();
        else System.out.println("Введены неверные значения");
    }
//First task
    public void first(){
        double length1=2*Math.PI*r;
        System.out.println("Длинна окружности:"+length1);
    }
//Second task
    public int[] second(){
        x=(int) (Math.random() * 198 - 99);
        y=(int) (Math.random() * 198 - 99);
        return new int[] {x,y};
    }
//Third task
        public double third(Circle b) {
            return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
        }
//fourth task        
                public void fourth (Circle b) {
            if (Math.abs(this.r - b.r) == this.third(b))
                System.out.println("Окружности касаются друг друга");
            else
                System.out.println("Окружности не касаются друг друга");
            System.out.println("I think what it works(maybe)");
        }

}

public class Lab5 {
    public static void main(String[] args) {
        Circle a = new Circle();
        a.first();
        a.second();
        Circle b = new Circle();
        System.out.println("Расстояние между двумя окружностями равно: "+a.third(b));
        a.fourth(b);
    }
}