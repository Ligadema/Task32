package by.yandex.sidvlada;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        FileOutputStream f = new FileOutputStream("C:\\Users\\sid-v\\hello.dat");
        DataOutputStream a;

        try {
            a = new DataOutputStream((new BufferedOutputStream(new FileOutputStream("C:\\Users\\sid-v\\hello.dat"))));
        } catch (FileNotFoundException e) {
            System.out.println("nit");
            return;
        }
        Random random = new Random();
        for (int i = 0; i < 19; i++) {
            a.writeInt(random.nextInt());
        }
        a.close();
        

        DataInputStream dataInputStream = null;

        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\sid-v\\hello.dat")));
            int res = dataInputStream.readInt();
            while (true) {
                System.out.print(" " + res);
                try {
                    res = dataInputStream.readInt();
                } catch (EOFException e) {
                    break;
                }
                }
        } catch (FileNotFoundException e) {
        System.out.println("nit");
        return;
        }



    }
}