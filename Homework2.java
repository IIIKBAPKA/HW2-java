import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int mass[] = {0,5,2,4,7,1,3,19};
        task_1();
        task_2();
        task_3();
        task_4(mass);
        task_5();
        task_6();
        task_7();
    }
//    Задание 1. Определить в каком подъезде и на каком этаже расположена квартира
    static void task_1(){
        System.out.println("\nЗадание 1. Определить в каком подъезде и на каком этаже расположена квартира");
        Scanner scanner = new Scanner(System.in);
        int kv=0;
        try {
            kv = scanner.nextInt();
        }
        catch (InputMismatchException i){
            System.out.println("\tВы ввели неккоректные данные");
            return;
        }
        int mas[][][] = new int[4][9][4]; //[Подъезд][Этаж][Квартира]
        int g = 1;
        for(int i =0;i<4;i++){
            for(int j=0;j<9;j++){
                for(int l =0;l<4;l++){
                    mas[i][j][l]= g++;
                    if(kv==g){
                        System.out.println("\tДанная квартира находится в "+(i+1)+" подъезде, на "+(j+1)+" этаже");
                    }
                }
            }
        }
        if((kv>g)||(kv<=0)){
            System.out.println("\tТакой квартиры в этом доме не существует");
        }
    }
//    Задание 2. С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры.
    static void task_2(){
        System.out.println("\nЗадание 2. С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры.");
        System.out.println("\tВведите количество полос");
        int column = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            column = scanner.nextInt();
        }
        catch (InputMismatchException i) {
            System.out.println("\tВы ввели неккоректные данные");
            return;
        }
        if(column<=0){
            System.out.println("\tВы ввели число меньше 1");
            return;
        }
        for(int line = 1;line<12;line++){
            System.out.println();
            for (int i=0;i<column;i++){
                if (i%2==0) {
                    System.out.print("***");
                }
                else{
                    System.out.print("+++");
                }
            }
        }
    }
//    Задание 3. Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
    static void task_3(){
        System.out.println("\nЗадание 3. Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).");
        System.out.println("\tВведите любое число, чтобы узнать его факториал");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int factorial=1;
        try{
            n = scanner.nextInt();
        }
        catch (InputMismatchException i){
            System.out.println("\tВы ввели неккоректные данные");
            return;
        }
        if((n>4)&&(n<16)){
            for(int i=n;i>0;i--){
                factorial*=i;
            }
            System.out.println(factorial);
        }
        else {
            System.out.println("\tВведеное число не отвечает условиям задания");
        }
    }
//    Задание 4. Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.
    static void task_4(int[] mass){
        System.out.println("\nЗадание 4. Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.");
        int num = 0;
        List<Integer> list= new ArrayList<>();
        for(int o:mass){
            if(o%2==1){
                num++;
                list.add(o);
            }
        }
        System.out.println("\tКоличество нечетных цифр в масиве равно: "+num+". Это числа: "+list.toString());
    }
//    Задание 5. Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры) заполнените элементы произвольными числами.
    static void task_5(){
        System.out.println("\nЗадание 5. Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры) заполнените элементы произвольными числами.");
        System.out.println("\tВведите размер массива, который хотите создать");
        Scanner scanner = new Scanner(System.in);
        int num=0;
        try {
            num = scanner.nextInt();
            int mass[] = new int[num];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (int) (Math.random() * 20);
            }
            System.out.print("\tВы получаете такой массив: ");
            for (int o : mass) {
                System.out.print(o + " ");
            }
        }
        catch (InputMismatchException | NegativeArraySizeException i){
            System.out.println("\tВы ввели неккоректные данные");
            return;
        }
    }
//    Задание 6. Создать масив (15 элементов) и второй массив который удвоит эти значения
    static void task_6(){
        System.out.println("\n\nЗадание 6. Создать масив (15 элементов) и второй массив который удвоит эти значения");
        int mass[] = new int[15];
        int mass1[] = new int[30];
        for(int i=0;i<mass.length;i++){
            mass[i]=(int)(Math.random()*15);
        }
        System.arraycopy(mass,0,mass1,0,15);
        System.arraycopy(mass,0,mass1,15,15);
        for (int j =15;j<mass1.length;j++){
            mass1[j]*=2;
        }
        System.out.print("Было: ");
        for (int o:mass){
            System.out.print(o+" ");
        }
        System.out.print("\nСтало: ");
        for (int o:mass1){
            System.out.print(o+" ");
        }
    }
//    Задание 7. Введите строку текста с клавиатуры — реализуйте программу для \n" +
//            "возможности подсчета количества символа — 'b' в этой строке
    static void task_7(){
        System.out.println("\n\nЗадание 7. Введите строку текста с клавиатуры — реализуйте программу для \n" +
                "возможности подсчета количества символа — 'b' в этой строке");
        System.out.println("\tВведите любую строку, чтобы проверить её на наличие символа \'d\'");
        Scanner scanner = new Scanner(System.in);
        String sent = scanner.nextLine();
        char[] symbol = sent.toCharArray();
        int count = 0;
        for(int i = 0;i<symbol.length;i++){
            if(symbol[i]=='d'){
                count++;
            }
        }
        System.out.println("\tВ этой строке "+count+" символa(ов) d");
        scanner.close();
    }
}
