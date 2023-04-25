package LR1.main;

import java.lang.Math;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private double a = -2; //властивості класу
    private double b = 3;
    private double x = 2.4;

    public static double f1(double a, double b, double x) {//обчислення першої функції
        return Math.exp(a * Math.pow(Math.cos(x), 2)) - Math.abs(b * Math.pow(Math.log(Math.sqrt(x)), 5));
    }

    public static double f2(double a, double b, double x) {//обчислення другої функції
        return (a * Math.pow(x, 3)) / (Math.pow(Math.sin(x + b), 2));
    }

    public void input() {//ввід нових значень змінних
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть а: ");
        this.a = scan.nextDouble();
        System.out.println("Введіть b: ");
        this.b = scan.nextDouble();
        System.out.println("Введіть x: ");
        this.x = scan.nextDouble();
    }

    public void output() {//вивід значень змінних
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
        System.out.println("x = " + this.x);
    }

    public void calc() {//обчислення значень функцій
        System.out.println("f1(x) = " + f1(this.a, this.b, this.x));
        System.out.println("f2(x) = " + f2(this.a, this.b, this.x));
    }

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY");//задання формату часу
    public static void out_date() {//вивід дати і часу
        Date thisdate = new Date();
        System.out.format("Поточна дата і час: %s", dateFormat.format(thisdate)).println();
    }
    public void menu(){//метод, що відповідає за меню
        int key;//змінна, що відповідає за введене значення
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Для того, щоб виконати вказану дію, введіть число, яке вказане перед дією.");
            System.out.println("1. Введення значень вхідних даних");
            System.out.println("2. Виведення значень вхідних даних");
            System.out.println("3. Виведення обчислених значень функцій");
            System.out.println("4. Виведення поточної дати й часу у форматі дд міс рррр");
            System.out.println("5. Вихід");
            key = scan.nextInt();
            switch(key)
            {
                case 1: input(); break;
                case 2: output(); break;
                case 3: calc(); break;
                case 4: out_date(); break;
                case 5:
                {
                    System.out.println("До побачення!");
                    return;
                }
                default: System.out.println("Щось ви не те ввели... Введіть, будь ласка, правильний номер");
            }
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.menu();
    }
}