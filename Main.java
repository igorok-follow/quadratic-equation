

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, d;
        double x1, x2;
        System.out.println("Введите a: ");
        a = in.nextDouble();
        System.out.println("Введите b: ");
        b = in.nextDouble();
        System.out.println("Введите c: ");
        c = in.nextDouble();
        d = Math.pow(b , 2) - (4 * a * c);
        if (d > 0) {
            x1 = ((-1) * b + Math.sqrt(d)) / (a * 2);
            x2 = ((-1) * b - Math.sqrt(d)) / (a * 2);
            System.out.print("x1= " + x1 + " x2= " + x2);
        }
        else if(d==0){
            x1 = ((-1) * b)/(a * 2);
            System.out.println("x= " + x1);
        }
        else
            System.out.println("Значений нет!");
    }
}
