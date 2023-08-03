package Controller;

import java.util.Scanner;

public class Scan {
    public Scanner sc = new Scanner(System.in);

    public String input() {
        String input = sc.nextLine().trim();
        return input;
    }

}
