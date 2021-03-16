import java.util.Scanner;
public class desain{
	public static void main(String[]args){
//        inisialisasi java library scanner
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner nitem=new Scanner(System.in);
		Scanner hharga=new Scanner(System.in);
//        menampilkan menu makanan

//LABEL NAMA TOKO
System.out.println("                             S E L A M A T D A T A N G                               ");
System.out.println("                                                                                     ");
System.out.println("                                        DI                                           ");
System.out.println("                                                                                     ");
System.out.println("                                 ISNAINI BOUTIQUE                                    ");
System.out.println("                                                                                     ");
System.out.println("                 ----------------------------------------------------                ");
System.out.println("                                                                                     ");
System.out.println("                                  ii  ii  iiiiiiiiiii       		                 ");
System.out.println("                                  ii  ii  ii           		                         ");
System.out.println("                                  ii  ii  ii                      	   	             ");
System.out.println("                                  ii  ii  iiiiiiiiiii                    		     ");
System.out.println("                                  ii  ii           ii   		                     ");
System.out.println("                                  ii  ii     	   ii                                ");
System.out.println("                                  ii  ii  iiiiiiiiiii                                ");
System.out.println("                                                                                     ");
System.out.println("                 -----------------------------------------------------               ");
System.out.println("                       GELORA, BANGKINANG, JAKARTA, RIAU, INDONESIA                    ");
System.out.println("                                                                                     ");
System.out.println("                                                                                     ");
System.out.println("                                                                                     ");
System.out.println("                                                                                     ");
System.out.println("                                                                                     ");

//LABEL ITEM YANG TERSEDIA

System.out.println("                               DAFTAR barang                                         ");
System.out.println("\t\t 1.kain katun                  Rp. 50.000,00                                     ");
System.out.println("\t\t 2.BROKAT                      Rp. 100.000,00								     ");
System.out.println("\t\t 3.PENDEDEL                    Rp. 10.000,00                                     ");
System.out.println("\t\t 4.MESIN OBRAS                     Rp. 30.000,00								     ");
System.out.println("\t\t 5.SKOCHI                      Rp. 20.000,00                                     ");
System.out.println("                                                                                     ");
System.out.println("                                                                                     ");

//        inisialisasi pembayaran awal
        int harga=0;
        int kembalian=0;
//        inisialisasi harga ketiga menu
        int h1 = 50000, h2 = 100000, h3 = 100000, h4 = 30000, h5 = 200000;
        String item, pelanggan;
        double  totalharga, totalpembayaran;

        System.out.print("\t\t--------------------------------------------------");
        System.out.println("   ");        
        System.out.print("\t\tMasukkan nama pelanggan: ");
        pelanggan=scan.nextLine();
        System.out.print("\t\t--------------------------------------------------");        

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println(" ");
//        pengguna memasukkan nomor pesanan
        System.out.print("\t\tMasukkan Nomor Pesanan  : ");
        int inNomor = scan.nextInt();
        
        System.out.print("\t\tMasukkan Banyak Pesanan : ");
        int jumlah = scan.nextInt();
        
        System.out.println(" ");

        
        if (inNomor == 1)
        {
//            jika nomor satu, maka menu yang dipilih adalah MASKER MULKBERRY, dan harganya adalah h1, yang merupakan harga menu pertama
            item = " KAIN KATUN ";
            System.out.println("\t\tPilihan anda nomor " +inNomor + item);
            harga = harga + h1 * jumlah;

        }
            else if (inNomor == 2)
            {
//            jika nomor dua, maka menu yang dipilih adalah KAOS BY YU, dan harganya adalah h2, yang merupakan harga menu kedua
                item = " BROKAT ";
                System.out.println("\t\tPilihan anda nomor "+inNomor +" " + item);
                harga = harga + h2 * jumlah;
            }
                else if (inNomor == 3)
                {
//            jika nomor tiga, maka menu yang dipilih adalah PAKET LENGKAP SKINCARE BY YU, dan harganya adalah h3, yang merupakan harga menu ketiga
                    item = " PENDEDEL ";
                    System.out.println("\t\tPilihan anda nomor " +inNomor + item);
                    harga = harga + h3 * jumlah;
                }
                    else if (inNomor == 4)
                    {
//            jika nomor tiga, maka menu yang dipilih adalah HAND SANITIZER BY YU, dan harganya adalah h4, yang merupakan harga menu ketiga
                        item = " MESIN OBRAS ";
                        System.out.println("\t\tPilihan anda nomor " +inNomor + item);
                        harga = harga + h4 * jumlah;
                    }
                        else if (inNomor == 5)
                        {
//            jika nomor tiga, maka menu yang dipilih adalah TOTEBAG BY YU, dan harganya adalah h5, yang merupakan harga menu ketiga
                            item = " SKOCHI  ";
                            System.out.println("\t\tPilihan anda nomor : " +inNomor + item);
                            harga = harga + h5 * jumlah;
                        }
                     else
//            jika selain nomor satu sampai lima, maka akan ditampilkan "Item Yang Anda Pilih Tidak Tersedia Didalam Toko"
                    {
                        System.out.println("\t\tItem Yang Anda Pilih Tidak Tersedia Didalam Toko");
                    }
            
        System.out.println("\t\tApakah anda mau melanjutkan? Y/T\n");
            i = scan.next();
        System.out.print("\t\t--------------------------------------------------");
        System.out.println("   "); 
        }

        System.out.println("\t\tTotal pembayaran   : "+"Rp." +harga);
        System.out.println("\t\tTotal pembayaran   : "+"Rp." +harga);
        System.out.println("\t\tTotal pembayaran   : "+"Rp." +harga);
        System.out.println("\t\tTotal pembayaran   : "+"Rp." +harga);
        
        System.out.println("\t\tTotal pembayaran   : "+"Rp." +harga);
        

        System.out.print("\t\tMasukkan pembayaran: Rp.");
        int bayar;
        bayar=scan.nextInt();
        
        kembalian = bayar-harga;
        System.out.print("\t\tKembalian          : Rp." +kembalian); 

        System.out.println("   ");
         System.out.print("\t\t--------------------------------------------------");
        System.out.println("   ");
        
        System.out.println("   ");
        
        System.out.println("\t\t\tTerimakasih atas kunjungannya");
        System.out.println("\t\t\t   Silahkan Datang Kembali");
    
    }
}