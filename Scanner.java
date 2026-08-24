import java.util.Scanner;
 
class Main
{
       public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("Sum: " + (n1 + n2));
        System.out.println("Diff: " + (n1 - n2));
        System.out.println("Prod: " + (n1 * n2));
        System.out.println("div: " + (n1 / n2));
        System.out.println("Rem: " + (n1 % n2));
}
}
