package dz_5.View;

import java.util.Scanner;

public class View {
    public static String inNumber(){
        System.out.println("Введите число");
        return new Scanner(System.in).next();
    }
    public static String inOperator(){
        System.out.println("Введите оператор");
        return new Scanner(System.in).next();
    }
    public static void result(String res){
        System.out.println(res);
    }
    public static String inExpression(){
        System.out.println("Введите выражение");
        return new Scanner(System.in).next();
    }
}
