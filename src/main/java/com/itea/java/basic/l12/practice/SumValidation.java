package com.itea.java.basic.l12.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumValidation {

    public static void main(String[] args) {

        while (true) {
            int a = nextInt();
            int b = nextInt();
            int sum = a + b;
            if (sum == 0) {
                System.exit(0);
            }
            System.out.println(sum);
        }
    }

    private static int nextInt() {
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = next();
                ok = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter the number!\nTry again");
            } catch (IOException e) {
                // ignore
            }
        }
        return i;
    }

    private static int next() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
