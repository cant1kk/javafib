import java.util.Scanner;

public class fibo {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String n=System.getProperty("line.separator");
    int count=1, x=1, y=1, sum;
    System.out.println("Введите число");
    int num=input.nextInt();
    for (count=1;count<=num;count++) {
        System.out.print(" "+x);
        sum=x+y;
        x=y;
        y=sum;
        {
            input.close();
        }
    }
   } 
}