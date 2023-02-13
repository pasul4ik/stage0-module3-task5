package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {
    public void convert(float minutes) {

        Scanner S = new Scanner(System.in);
        int seconds = 60;
        System.out.println("please enter the number of minutes you want to convert?");
        int minuts = S.nextInt();
        int answer = minuts * seconds;
        System.out.println(answer);
    }
}
