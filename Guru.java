//Object Class
public class Guru {
    String Guru;
    int id;
    String nama;
    String mapel;
    String alamat;

    public String getGuru() {
        return this.Guru;
    }

    public void setGuru(String Guru) {
        this.Guru = Guru;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /*Constructor*/
    public Guru() {
        id = 1;
        nama = "pakDiaur";
        mapel = "pjok";
        alamat = "malang";
        id = 2;
        nama = "buAulia";
        mapel = "rpl produktif";
        alamat = "malang";
        id = 3;
        nama = "buFeni";
        mapel = "matematika";
        alamat = "malang";
        id = 4;
        nama = "buPasha";
        mapel = "rpl produktif";
        alamat = "malang";
        id = 5;
        nama = "pakAndre";
        mapel = "bahasa inggris";
        alamat = "malang";
        id = 6;
        nama = "buChusnu";
        mapel = "ipas";
        alamat = "malang";
        id = 7;
        nama = "pakEmil";
        mapel = "kesiswaan";
        alamat = "malang";
    }
    //Constructor Parameter
    public Guru(int id,String nama,String mapel,String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }


    //method
    public void print() {
        System.out.println("id : "+id);
        System.out.println("nama : "+nama);
        System.out.println("mapel : "+mapel);
        System.out.println("alamat : "+alamat);

    }

    
}
