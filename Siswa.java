//Object Class
public class Siswa {
    int id;
    String nama;
    double ipk;

    /*Constructor nama sama dgn nama Class
    */
    public Siswa() {
        id = 0;
        nama = "";
        ipk = 0;
    }

    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }
}