package guitartrainer.core;
import java.util.Scanner;

public class InputReception{

    private static final Scanner scanner = new Scanner(System.in);

    //number input
    public static int nextInt(){
    int n = scanner.nextInt();
    scanner.nextLine();
    return n;
}


    public static String nextLine(){
        return scanner.nextLine();
    }
}