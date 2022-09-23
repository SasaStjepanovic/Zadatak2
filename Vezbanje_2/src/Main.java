import java.util.*;

import static netscape.security.Privilege.add;

public class Main {

    public static void main(String[] args) {
//      Zadatak_2
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                String string = "";
                if (string == null || string.isEmpty()) {
                    System.out.println("You didn't enter nothing 10 seconds, exit....");
                    System.exit(0);
                }
            }
        };

        int number1 = 0;
        int number2 = 0;
        boolean isNumber;
        timer.schedule(task, 10000);
        do {
            System.out.println("Enter a first as whole number: ");

            if (sc.hasNextInt()) {
                number1 = sc.nextInt();
                isNumber = true;
                System.out.println();


            } else {
                System.out.println(("Given number is not good !!!"));
                isNumber = false;
                sc.next();
            }
        }
        while (!isNumber);
        timer.cancel();

//        timer.schedule(task,10000);
//        do {
//            System.out.println("Enter a second as whole number: ");
//            if (sc.hasNextInt()) {
//                number2 = sc.nextInt();
//                isNumber=true;
//                System.out.println();
//            } else {
//                System.out.println(("Given number is not good !!!"));
//                isNumber=false;
//                sc.next();
//            }
//        }
//        while (!isNumber);
//        timer.cancel();

        int rezultat = number1 + number2;
        System.out.println("Rezultat je:" + rezultat);
    }
}

