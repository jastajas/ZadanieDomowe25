import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class NewDoubleTest {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ile liczb chcesz wprowadzić?");

        int no = sc.nextInt();

        double[] userNumbers = new double[no];

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Wprowadź liczbę: ");
            userNumbers[i] = sc.nextDouble();
        }

        FileWriter fw = new FileWriter("userNo", true);
        BufferedWriter bw = new BufferedWriter(fw);

        String temp = "";

        for (int i = 0; i < userNumbers.length; i++) {
            temp = String.valueOf(userNumbers[i]);
            bw.write(temp);
            bw.newLine();
        }
        bw.close();
    }

}
