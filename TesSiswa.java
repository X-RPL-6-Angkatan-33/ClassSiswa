//Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
        //membuat obyek
        Siswa adi = new Siswa();
        Siswa lia = new Siswa();

        Siswa ria = new Siswa(10, "Ria", 50);
        Siswa cahya = new Siswa(id,nama,ipk);
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

        ria.print();
        cahya.print();
    }
}
