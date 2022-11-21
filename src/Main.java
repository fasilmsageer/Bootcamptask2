import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        char operator;
        Double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option : ");
        System.out.println("1 : find largest of 3 number");
        System.out.println("2 : find smallest of 3 number");
        System.out.println("3 : find prime or not");
        System.out.println("4 : find even or not");
        System.out.println("5 : find reverse of the number");
        System.out.println("6 : exit");
        operator = sc.next().charAt(0);

        switch(operator){
            case '1':
                Double largest, temp;
                System.out.println("Enter first number: ");
                a = sc.nextDouble();

                System.out.println("Enter second number: ");
                b = sc.nextDouble();

                System.out.println("Enter third number: ");
                c = sc.nextDouble();

                temp=a>b?a:b;

                largest=c>temp?c:temp;
                System.out.println("largest of the numbers is " + largest);
                break;

        }



    }
}