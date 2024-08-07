//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        //membuat obyek
        Siswa adi = new Siswa();
        Siswa lia = new Siswa();
        adi.id = 100;
        adi.nama = "Adi";
        adi.ipk = 4;
        System.out.println("Ini Data Adi");
        System.out.println(adi.id);
        System.out.println(adi.nama);
        System.out.println(adi.ipk);
        System.out.println("Ini Data Lia");
        System.out.println(lia.id);
        System.out.println(lia.nama);
        System.out.println(lia.ipk);
    }
}
