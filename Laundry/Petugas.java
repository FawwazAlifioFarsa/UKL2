package Laundry;
import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    private ArrayList<Integer> kode = new ArrayList<Integer>();
    JenisLaundry jenisLaundry = new JenisLaundry();

    Petugas(){
        this.namaPetugas.add("Fawwaz");
        this.alamat.add("Malang");
        this.telepon.add("082331045347");
        this.jabatan.add(1);
    }
    
    public void infoPetugas(){
        System.out.println("\n==========  Data Petugas  ==========");  
        for(int i=0;i < this.namaPetugas.size();i++){ 
            System.out.println("Nama        : " + this.getNama(i));
            System.out.println("Alamat      : " + this.getAlamat(i));
            System.out.println("No. Telp.   : " + this.getTelepon(i));
            System.out.println("Jabatan     : " + this.getJabatan(i));
            System.out.println("===================================");
        }                                 
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int jabatan){
        return this.jabatan.get(jabatan);
    }
    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {        
        return this.namaPetugas.get(idPetugas);
    }
    @Override
    public String getAlamat(int idAlamat) {
        return this.alamat.get(idAlamat);
    }
    @Override
    public String getTelepon(int idTelepon) {
        return this.telepon.get(idTelepon);
    }
}
