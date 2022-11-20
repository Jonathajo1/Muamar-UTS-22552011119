package NumberThree;

import java.util.ArrayList;
import java.util.List;

public class NumberThree {

    public static void main(String[] args) {

        List<Mahasiswa> MahasiswaList = new ArrayList<>();
        MahasiswaList.add(new Mahasiswa(1, "Muamar", "TIF 1", 12));
        MahasiswaList.add(new Mahasiswa(2, "jonathan", "ATE 2", 13));
        MahasiswaList.add(new Mahasiswa(3, "jojo", "TU 3", 14));
        MahasiswaList.add(new Mahasiswa(4, "asep", "PKI 1", 15));
        MahasiswaList.add(new Mahasiswa(5, "ucok", "GPL 2", 16));

        MahasiswaList.set(4, new Mahasiswa(6, "Indra", "TIF 2", 20));

        MahasiswaList.add(3, new Mahasiswa(8, "Dadang", "DKV 2", 31));

        System.out.println(MahasiswaList.contains(new Mahasiswa(1, "Muamar", "TIF 1", 27)));
        System.out.println(MahasiswaList.indexOf(new Mahasiswa(9, "jonathan", "ATE", 03)));

        MahasiswaList.remove(2);
        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa));

    }
}