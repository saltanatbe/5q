import java.util.Scanner;
import java.util.Arrays;

public class One{
    public static void main(String[] args){
        int arr[] = {1, 6, 9, -4, 3};
        //task1();
        task2();
        task3();
        task4();
        task5(-5);
        task6("ahelloa");
        task7(arr);
        task8(arr);
    }
    public static void task1(){
        Scanner sc=new Scanner(System.in);  
        System.out.print("Введите первое число:");
        int a=sc.nextInt();
        System.out.print("Введите второе число:");
        int b=sc.nextInt();
        
        int sum=a+b;
        System.out.println("Сумма: " +sum);
        
        int product=a*b;
        System.out.println("умножение: " +product);
        
        int minus=a-b;
        System.out.println("Вычитание: " +minus);
        
        int divide=a/b;
        System.out.println("Деление: " +divide);
        
        sc.close();
    }

    public static void task2(){
        for(int i=1; i<21; i++, i++){
            System.out.print(i+" ");
        }
    }

    public static void task3(){
        int a=10;
        int b=50;
        int temp=a;
        a=b;
        b=temp;
    }

    public static void task4(){
        Scanner sc=new Scanner(System.in);  
        System.out.print("Введите первое число:");
        int a=sc.nextInt();
        System.out.print("Введите второе число:");
        int b=sc.nextInt();
        System.out.print("Введите третье число:");
        int c=sc.nextInt();

        int most=Math.max(a,b);
        most=Math.max(most,c);
        System.out.print("Наибольшее: " +most);
        
        sc.close();
    }
    public static void task5(int a){
        if(a>0){
            System.out.println("Положительное");
        } else {
            if(a==0){
                
            System.out.println("0");
            }
            else{
                
            System.out.println("Отрицательное");
            }
        }
    }
    public static String task6(String st){
        char[] char_array = st.toCharArray();
        for(int i=0;i<char_array.length; i++){
            if(char_array[i]=='a'){
                char_array[i]='b';
            }
        }
        return String.valueOf(char_array);
    }
    public static int task7(int[] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return sum;
    }
    public static int task8(int[] array){
        Arrays.sort(array);
        return array[array.length-2];
    }

}