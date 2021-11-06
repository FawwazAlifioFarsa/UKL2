package Laundry;
import java.util.ArrayList;
import java.util.Scanner;

public class Client implements User{
    ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
        
    Client(){
        this.namaClient.add("Udin1");
        this.alamat.add("Malang");
        this.telepon.add("082331045347");
        this.saldo.add(1000000);
        
        this.namaClient.add("Udin2");
        this.alamat.add("Jember");
        this.telepon.add("082331045347");
        this.saldo.add(2000000);
    }

    public void infoClient(){
        System.out.println("\n==========  Data Client  ==========");  
        for(int i=0;i < this.namaClient.size();i++){ 
            System.out.println("Nama        : " + this.getNama(i));
            System.out.println("Alamat      : " + this.getAlamat(i));
            System.out.println("No. Telp.   : " + this.getTelepon(i));
            System.out.println("Saldo       : " + this.getSaldo(i));
            System.out.println("===================================");
        }                                 
    }

    public void setSaldo(int index, int saldo){
        this.saldo.set(index, saldo);
    }
    public int getSaldo(int index){
        return this.saldo.get(index);
    }

    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
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
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
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