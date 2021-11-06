package Laundry;
import java.util.Scanner;
public class Laundry {
    public static void main(String[]args){
        
        Transaksi transaksi =  new Transaksi();
        JenisLaundry jenisLaundry = new JenisLaundry();
        Client client = new Client();
        Petugas petugas = new Petugas();
        Scanner input = new Scanner(System.in);
        Boolean ulang = true;
        while(ulang){
            System.out.println("Selamat Datang di Laundry Pio");
            System.out.println("1. List Data Client");
            System.out.println("2. List Data Petugas");
            System.out.println("3. Jenis Laundry");
            System.out.println("4. Transaksi");
            System.out.println("99. Keluar");
            System.out.print("=> ");
            int menu = input.nextInt();
            if(menu == 1){
                client.infoClient();                         // Menampilkan infoClient
            }else if(menu == 2){
                petugas.infoPetugas();  
            }else if(menu == 3){
                jenisLaundry.infoLaundry();                  // Menampilkan semua info Laundry
            }else if(menu == 4){
                transaksi.prosesInputTransaksi();            // Bagian Input dari Transaksi
                transaksi.prosesTransaksi(client,jenisLaundry); //Bagian proses dari transaksi
                transaksi.prosesAkhir(client,jenisLaundry);  // Akhir dari Proses transaksi
            }else if(menu > 3 && menu < 99 && menu > 99){
                System.out.println("INPUT TIDAK VALID");
            }else if(menu == 99){
                ulang = false;
            }
        }
        //Jika ingin input Jenis Laundry Baru
        //argument diisi petugas, index petugas, kode petugas
        //jenislaundry.setAllLaundry(petugas,0,12345); 
        
        }
    
}
    
