package latihan.java.core;
import java.io.*;
import java.util.*;

public class Loop1 {

    public static void main(String[] args) {
        
        int n = 2; //input n = 2
        int values; //tempat menampung nilai perkalian n kali i
        for(int i = 1; i <= 10; i++){ //perulangan i mulai dari 1 akan di eksekusi line 12 dari output 2 *1 =2
            values = (n*i);
            System.out.printf(String.format("%d x %d = %d%n", n, i, values)); // [i]=1 [i]=1+1=2 akan dieksekusi
                                                                              //lagi line 12 dan seterusnya samapai i kurang besar sama 10
        }
    }
}