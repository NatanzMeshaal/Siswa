//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa natanz = new Siswa();
        Siswa althaf = new Siswa();
        Siswa fadli = new Siswa();
        Siswa felix = new Siswa();
        Siswa widi = new Siswa();

        natanz.id = 27;
        natanz.nama = "Natanz";
        natanz.ipk = 85.0;
        natanz.print();

        althaf.id = 2;
        althaf.nama = "althaf";
        althaf.ipk = 90.0;
        althaf.print();

        fadli.id = 2;
        fadli.nama = "fadli";
        fadli.ipk = 90.0;
        fadli.print();

        felix.id = 14;
        felix.nama = "felix";
        felix.ipk = 68.0;
        felix.print();

        widi.id = 34;
        widi.nama = "widi";
        widi.ipk = 78.0;
        widi.print();
    }
}