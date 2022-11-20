package NumberOne;

import static java.lang.System.out;

public class NumberOne {public static void main(String[] args) {
    //Nomer 1
    int [] bil = {2, 3, 6, 12, 13, 25, 33, 35, 66, 80, 200, 321, 241, 444, 666};
    out.println("|          Bilangan Ganjil Genap          |");
    out.println("===========================================");
    out.print("Bilangan Genap  :  ");
    for (int j : bil) {
        if (j % 2 == 0) {
            out.print(j + " ");
        }
    }
    out.println();
    out.print("Bilangan Ganjil :  ");
    for (int j : bil) {
        if (j % 2 != 0) {
            out.print(j + " ");
        }
    }
    out.println();
    out.print("========== Muamar ===========");
}
}