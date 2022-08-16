import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AstonTaskJavaIvanon {
    public static String name;
    public static List<Integer> array = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        System.out.println("Старт задания:.");
        taskInt();
        taskArray();
        taskName();
    }
    public static void taskInt(){
        System.out.println("Введите число больше '7'");
        if (sc.hasNextInt()){
            int a = sc.nextInt();
            if(a > 7){
                System.out.println("Привет");
            }else{
                System.out.println("Введенное число меньше или равно '7'!");
            }
        }else{
            System.out.println("Неверные входные данные!");
        }
    }
    public static void taskArray(){
        System.out.println("Проверка кратности чисел:.");
        System.out.println("Введине 7 чисел:");
        if (sc.hasNextInt()){
            for (int i = 0; i < 7; i++) {
                array.add(sc.nextInt());
            }
        }else
            System.out.println("Неверные входные данные!");

        System.out.print("Числа кратные 3: -> ");
        for (int j : array) {
            if (j % 3 == 0 && j != 0)
                System.out.print(j + ", ");
        }
        System.out.println();
    }
    public static void taskName(){
        System.out.println("Введите имя 'Вячеслав':.");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            name = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (name.equalsIgnoreCase("Вячеслав")){
            System.out.println("Привет, Вячеслав!");
        }else
            System.out.println("Нет такого имени!");
    }
}