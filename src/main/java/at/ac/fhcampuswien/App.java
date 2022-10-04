package at.ac.fhcampuswien;

import com.sun.jdi.IntegerValue;
import com.sun.org.apache.xml.internal.utils.StringToIntTable;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.graalvm.compiler.lir.Variable;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here
        int A = (int) 0xface;
        int B = (int) 'Z';
        int C = 012;
        int D = (int) 80L;
        int E = (int) 44e-1f;
        int F = (int) 5.5f;
        int G = (int) 8.88e1f;
        int H = (int) 99.9f;
        int sum = A + B + C + D + E + F + G + H;
        System.out.println(sum);


    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        /**
         * The following 5 lines of Code have been taken (and slightly altered) from the Internet | URL https://falconbyte.net/java-scanner.php, last visit: 30.09.2022
         */

        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();

        int input2 = scanner.nextInt();

        int summe = input1 + input2;

        System.out.println(summe);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swap:");

        System.out.print("x: ");
        int input1 = scanner.nextInt();
        System.out.print("y: ");
        int input2 = scanner.nextInt();

        System.out.println("After Swap:");

        System.out.print("x: ");
        System.out.println(input2);
        System.out.print("y: ");
        System.out.println(input1);

    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1: ");
        int input1 = scanner.nextInt();
        System.out.print("n2: ");
        int input2 = scanner.nextInt();

        if (input1 > input2) {
            System.out.println("n1 > n2\n");
        } else if (input1 < input2) {
            System.out.println("n2 > n1\n");
        } else if (input1 == input2) {
            System.out.println("n1 == n2\n");
        }


        System.out.print("n1: ");
        int input3 = scanner.nextInt();
        System.out.print("n2: ");
        int input4 = scanner.nextInt();

        if (input3 > input4) {
            System.out.println("n1 > n2\n");
        } else if (input3 < input4) {
            System.out.println("n2 > n1\n");
        } else if (input3 == input4) {
            System.out.println("n1 == n2\n");
        }

        System.out.print("n1: ");
        int input5 = scanner.nextInt();
        System.out.print("n2: ");
        int input6 = scanner.nextInt();

        if (input5 > input6) {
            System.out.println("n1 > n2");
        } else if (input5 < input6) {
            System.out.println("n2 > n1");
        } else if (input5 == input6) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int input1 = scanner.nextInt();
        if (input1 >= 100000 || input1 < 0) {
            System.out.println("Invalid Revenue\n");
        } else if (input1 >= 0 || input1 < 20000) {
            System.out.println("Poor Sales Revenue\n");
        } else if (input1 >= 20000 || input1 < 50000) {
            System.out.println("Average Sales Revenue\n");
        } else if (input1 >= 50000 || input1 < 80000) {
            System.out.println("Good Sales Revenue\n");
        } else if (input1 >= 80000 || input1 < 100000) {
            System.out.println("Excellent Sales Revenue\n");
        }

        System.out.print("Enter annual Revenue: ");
        int input2 = scanner.nextInt();
        if (input2 >= 100000 || input2 < 0) {
            System.out.println("Invalid Revenue");
        } else if (input2 >= 0 || input2 < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (input2 >= 20000 || input2 < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (input2 >= 50000 || input2 < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (input2 >= 80000 || input2 < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ComissionClass: ");
        while (scanner.hasNext()) {
            int select = 0;
            if (scanner.hasNextInt()) {
                select = scanner.nextInt();
            }
            System.out.print("Your Commision Rate was set to ");

            switch ("test") {
                case "1":
                    System.out.println("0.01");
                    break;

                case "2":
                    System.out.println("0.02");
                    break;

                case "3":
                    System.out.println("0.03");
                    break;

                case "4":
                    System.out.println("0.04");
                    break;

                default:
                    System.out.println("0.00");
            }

        }
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here

    }

    //todo Task 10
    /**
     * The following 5 lines of Code have been taken from the Internet | URL https://mein-javablog.de/java-uebung-zahlen-umdrehen/#:~:text=Du%20brauchst%20somit%20ein%20Scanner,und%20%C3%BCbergib%20die%20Zahl%2021765., last visit: 04.10.2022
     */
    public void transposedNumbers() {
        // input your solution here

                Scanner scanner = new Scanner(System.in);
                System.out.print("Number: ");
                int zahl = scanner.nextInt();
                int zwErgeb = 0;
                int zaehler = 0;
                int faktorZehn = 1;
                int umgedrehteZahl = 0;
                zwErgeb = zahl;

                //Ermittlung der Anzahl der Ziffern
                while (zwErgeb != 0) {
                    zwErgeb = zwErgeb / 10;
                    zaehler++;
                }

                //Ermittlung der 10-Potenz
                for (int i = 1; i < zaehler; i++) {
                    faktorZehn = faktorZehn * 10;
                }

                //Zahl umdrehen
                zwErgeb = zahl; //Zahl wird wieder im Zwischenergebnis gespeichert
                while (zwErgeb != 0) {
                    umgedrehteZahl = (zwErgeb % 10) * faktorZehn + umgedrehteZahl;
                    zwErgeb = zwErgeb / 10;
                    faktorZehn = faktorZehn / 10;
                }
                System.out.println(umgedrehteZahl);
            }



    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}