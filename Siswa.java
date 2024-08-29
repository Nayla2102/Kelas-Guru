//Object Class
public class Siswa {
    int id;
    String nama;
    double ipk;

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

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    /*Constructor*/  
    public Siswa() {
        id = 10;
        nama = "";
        ipk = 0;

    }
    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }    


    //Getter-->mendapatkan nilai-->tipe data   

    //Setter-->mengubah nilai-->void
    public void setID(int id) {
        this.id = id;  
    }    

    public void setNAMA(String nama){
        this.nama = nama;
    }    

    public void setIPK(double ipk) {
        this.ipk = ipk;
    } 
    

    //method tidak menghasilkan value
    public void print() {
        System.out.println("id : "+ id);
        System.out.println("nama : "+ nama);
        System.out.println("ipk : "+ipk);
    }

    //method yang menghasilkan value 
    public String print2(){
        return "ID : "+ id
         + "\nNama : " + nama 
         + "\nIpk : " + ipk;
    }
    
}