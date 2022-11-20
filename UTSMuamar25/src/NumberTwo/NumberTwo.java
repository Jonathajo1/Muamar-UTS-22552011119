package NumberTwo;
import java.util.Scanner;
public class NumberTwo {
    public static void main(String[] args) {

        int Nmaks = 100;
        int jumdata, j, temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("|                Data Absen               |");
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah data: ");
        jumdata = scan.nextInt();

        int arrayNilai[] = new int[jumdata];

        for (int i = 0; i < jumdata; i++) {
            System.out.print("Masukkan data ke-" + i + " : ");
            arrayNilai[i] = scan.nextInt();
        }

        for (int a = 0; a < arrayNilai.length; a++) {
            for (int b = 0; b < arrayNilai.length - 1; b++) {
                if (arrayNilai[b] > arrayNilai[b + 1]) {
                    temp = arrayNilai[b];
                    arrayNilai[b] = arrayNilai[b + 1];
                    arrayNilai[b + 1] = temp;
                }
            }
        }
        System.out.println("\nDATA ABSEN GENAP :");
        for (int i = 0; i < jumdata; i++) {
            if (i % 2 == 0) {
                System.out.print(arrayNilai[i] + ", ");
            }
        }

        System.out.println("\nDATA ABSEN GANJIL :");
        for (int c = 0; c < jumdata; c++) {
            if (c % 2 != 0) {
                System.out.print(arrayNilai[c] + ", ");
            }
        }
        System.out.print("\n\n=========== Muamar ===========");
}
}