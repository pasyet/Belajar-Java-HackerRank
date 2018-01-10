package latihan.java.core;
import java.io.*;
import java.util.*;


public class Loop2 {

    public static void main(String[] args) {
        int result;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++){ 
            result = n*i;
            System.out.printf(String.format("%d x %d = %d%n", n, i, result));
        }
    }
}