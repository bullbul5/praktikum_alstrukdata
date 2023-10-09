public class abstrak {
    public static void main(String[] args){

        mahasiswa mhs;
        mhs = new mahasiswa();

        mhs.setData("Nabila", "Bogor");
        mhs.Biodata();
        mhs.ubahAlamat("Bandung");
        mhs.Biodata();
    }
}

abstract class orang{
    String nama;
    String alamat;

    public abstract void Biodata();    
    public String ubahAlamat(String alamat){
        return this.alamat = alamat;
    }

}

class mahasiswa extends orang {
    public void Biodata() {
        System.out.println("Nama = " + super.nama + " Alamat: " + this.alamat);
    }
    public void setData(String nama, String alamat){
        super.nama = nama;
        super.alamat = alamat;
    }

}