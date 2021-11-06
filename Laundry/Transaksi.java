package Laundry;
import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi extends Client{
    private ArrayList<Integer> idClient = new ArrayList<Integer>(); // idClient
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>(); 
    private ArrayList<Integer> banyak = new ArrayList<Integer>(); // hitungan kg
    int globalTemp = 0;
    Scanner input = new Scanner(System.in);
    
    public void prosesInputTransaksi(){
        System.out.println("\n========== Input Laundry ==========");
        System.out.println("Input Jenis Laundry");
        System.out.print("Jenis Laundry : ");
        int jenisTemp = input.nextInt();
        System.out.println("Input ID Client");
        System.out.print("ID Client     : ");
        int idTemp = input.nextInt();
        System.out.println("Input Berat Laundry");
        System.out.print("Berat laundry(kg) : ");
        int beratTemp = input.nextInt();
            this.idClient.add(idTemp);
            this.idJenisLaundry.add(jenisTemp);
            this.banyak.add(beratTemp);           
    }
    public void prosesTransaksi(Client client, JenisLaundry jenisLaundry){
        System.out.println("\n========== Proses Laundry ==========");        
        System.out.println("Nama            : " + client.getNama(idClient.get(0)));
        System.out.println("Alamat          : " + client.getAlamat(idClient.get(0)));
        System.out.println("No. Telp.       : " + client.getTelepon(idClient.get(0)));
        System.out.println("Saldo           : " + client.getSaldo(idClient.get(0)));
        System.out.println("Jenis Laundry   : " + jenisLaundry.getJenis(idJenisLaundry.get(0)));
        System.out.println("Harga           : " + jenisLaundry.getHarga(idJenisLaundry.get(0))*this.banyak.get(0));
        System.out.println("Durasi          : " + jenisLaundry.getDurasi(idJenisLaundry.get(0))*this.banyak.get(0)+ " Menit");
        globalTemp = client.getSaldo(idClient.get(0)) - (jenisLaundry.getHarga(idJenisLaundry.get(0))*this.banyak.get(0)) ;
    }
    public void prosesAkhir(Client client,JenisLaundry jenisLaundry){
        System.out.println("\n========== Akhir Laundry ==========");
        System.out.println("Yang Terhormat Client   : " + client.getNama(idClient.get(0)));
        System.out.println("Sisa Saldo Anda         : " + globalTemp);
        System.out.println("\n========== Terimakasih ! ==========");
    }
}
