import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        Double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("1 : find largest of 3 number");
        System.out.println("2 : find smallest of 3 number");
        System.out.println("3 : find prime or not");
        System.out.println("4 : find even or not");
        System.out.println("5 : find reverse of the number");
        System.out.println("6 : exit");
        System.out.println("Choose an option : ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '1':
                Double largest, temp;
                System.out.println("Enter first number: ");
                a = sc.nextDouble();

                System.out.println("Enter second number: ");
                b = sc.nextDouble();

                System.out.println("Enter third number: ");
                c = sc.nextDouble();

                temp = a > b ? a : b;

                largest = c > temp ? c : temp;
                System.out.println("largest of the numbers is " + largest);
                break;
            case '2':
                Double smallest, tempo;
                System.out.println("Enter first number: ");
                a = sc.nextDouble();

                System.out.println("Enter second number: ");
                b = sc.nextDouble();

                System.out.println("Enter third number: ");
                c = sc.nextDouble();

                tempo = a > b ? b : a;

                smallest = c > tempo ? tempo : c;
                System.out.println("smallest of the numbers is " + smallest);
                break;

            case '3':
                int i, n = 0, m = 0, flag = 0;
                System.out.println("Enter the  number to check:");
                n = sc.nextInt();
                m = n / 2;
                if (n == 0 || n == 1)
                {
                    System.out.println(n + " not a prime number");
                }
                else {
                    for (i = 2; i <= m; i++) {
                        if (n % i == 0) {
                            System.out.println(n + " not a prime number");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(n + " is a prime number");
                    }
                }
                break;
            case '4':
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if(num % 2 == 0)
                    System.out.println(num + " is even");
                else
                    System.out.println(num + " is odd");
                break;
        }
    }
}