/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1072 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            int X = leitor.nextInt();

            if (X >= 10 && X < 20) {
                in++;
            }

            if (X < 10 || X > 20) {
                out++;
            }
        }
        System.out.println(in + (" in"));
        System.out.println(out + " out");
    }
}
