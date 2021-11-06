package Laundry;
import java.util.Scanner;
import java.util.ArrayList;
public class JenisLaundry {
 
    private ArrayList<String> jenisLaundry = new ArrayList<String>(); //cepat, lambat
    private ArrayList<Integer> harga = new ArrayList<Integer>();  // rupiah per kg
    private ArrayList<Integer> durasi = new ArrayList<Integer>(); // hitungan menit
    Scanner input = new Scanner(System.in);

    public JenisLaundry() {
        this.jenisLaundry.add("Fast");
        this.harga.add(30000);
        this.durasi.add(5); //Per-kg
        this.jenisLaundry.add("Slow");
        this.harga.add(20000);
        this.durasi.add(10); //Per-kg
    }

    public void infoLaundry(){  
        System.out.println("\n========== Jenis Laundry ==========");
        for(int i=0;i < this.jenisLaundry.size();i++){
            System.out.println("Jenis   : " + this.jenisLaundry.get(i) + " ("+i+")");
            System.out.println("Harga   : " + this.harga.get(i) + " Rupiah");
            System.out.println("Durasi  : " + this.durasi.get(i));
            System.out.println("===================================");
        }       
    }
    public String getJenis(int index){
        return this.jenisLaundry.get(index);
    }
    public int getHarga(int index){
        return this.harga.get(index);
    }
    public int getDurasi(int index){
        return this.durasi.get(index);
    }
}
