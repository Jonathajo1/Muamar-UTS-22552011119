package NumberThree;

public class Mahasiswa {

    private final int id;
    private String name;
    private String kelas;
    private int tglMasuk;

    public Mahasiswa(int id, String name, String kelas, int tglMasuk) {
        this.id = id;
        this.name = name;
        this.kelas = kelas;
        this.tglMasuk = tglMasuk;
    }



    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getkelas() {
        return kelas;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public int getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(int tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mahasiswa Mahasiswa = (Mahasiswa) o;

        if (id != Mahasiswa.id) return false;
        if (!name.equals(Mahasiswa.name)) return false;
        if (!kelas.equals(Mahasiswa.kelas)) return false;
        return (tglMasuk != Mahasiswa.tglMasuk);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + kelas.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", kelas='" + kelas + '\'' +
                ", tglMasuk=" + tglMasuk +
                '}';
    }
}