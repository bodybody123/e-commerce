import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /* Nama : muhammad erlangga darmawan
            Kelas : XI RPL b
        */
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int Hnasigoreng = 18000;
        int Hmiegoreng = 5000;
        int Hayambakar = 23000;
        int Hbakso = 12000;
        int Hmierebus = 5000;
        int Hayamgoreng = 15000;


        String pesanan;
        String pilihan;
        String NasiGoreng = "1";
        String MieGoreng = "2";
        String AyamBakar = "3";
        String Basko = "4";
        String MieRebus = "5";
        String AyamGoreng = "6";
        String y = "y";

        System.out.printf("\n\nSELAMAT DATANG DI RESTORAN KAMI!!!");
        System.out.printf("\n\nSilahkan Pesan Menu Makanan : \n\n");
        System.out.printf("1.Nasi goreng = Rp.%d\t4.bakso\t      = Rp.%d\n2.Mie goreng  = Rp. %d\t5.Mie rebus   = Rp. %d\n3.Ayam bakar  = Rp.%d\t6.Ayam goreng = Rp.%d\n\n",Hnasigoreng,Hbakso,Hmiegoreng,Hmierebus,Hayambakar,Hayamgoreng);
        System.out.print("Masukkan nomor pesanan : ");
        pesanan = scan.nextLine();
        if (pesanan.equals(NasiGoreng)) {/* 1 */
            System.out.printf("\n\n==========================");
            System.out.printf("\n\n\tNasi goreng\n\n");/* 2 */
            System.out.printf("==========================\n");
            System.out.print("Masukkan jumlah porsi  : ");
            int porsi = scan.nextInt();
            total = porsi * Hnasigoreng;/* 3 */
            System.out.printf("\n%d X Rp.%d = Rp.%d\n\n", porsi,Hnasigoreng,total);/* 4 */

        }else if (pesanan.equals(MieGoreng)) {/* 1 */
            System.out.printf("\n\n==========================");
            System.out.printf("\n\n\tMie goreng\n\n");/* 2 */
            System.out.printf("==========================\n");
            System.out.print("Masukkan jumlah porsi  : ");
            int porsi = scan.nextInt();
            total = porsi * Hmiegoreng;/* 3 */
            System.out.printf("\n%d X Rp.%d = Rp.%d\n\n", porsi,Hmiegoreng,total);/* 4 */
        }else if (pesanan.equals(AyamBakar)) {/* 1 */
            System.out.printf("\n\n==========================");
            System.out.printf("\n\n\tAyam bakar\n\n");/* 2 */
            System.out.printf("==========================\n");
            System.out.print("Masukkan jumlah porsi  : ");
            int porsi = scan.nextInt();
            total = porsi * Hayambakar;/* 3 */
            System.out.printf("\n%d X Rp.%d = Rp.%d\n\n", porsi,Hayambakar,total);/* 4 */
        }else if (pesanan.equals(Basko)) {/* 1 */
            System.out.printf("\n\n==========================");
            System.out.printf("\n\n\bakso\n\n");/* 2 */
            System.out.printf("==========================\n");
            System.out.print("Masukkan jumlah porsi  : ");
            int porsi = scan.nextInt();
            total = porsi * Hbakso;/* 3 */
            System.out.printf("\n%d X Rp.%d = Rp.%d\n\n", porsi,Hbakso,total);/* 4 */
        }else if (pesanan.equals(MieRebus)) {/* 1 */
            System.out.printf("\n\n==========================");
            System.out.printf("\n\n\tMie rebus\n\n");/* 2 */
            System.out.printf("==========================\n");
            System.out.print("Masukkan jumlah porsi  : ");
            int porsi = scan.nextInt();
            total = porsi * Hmierebus;/* 3 */
            System.out.printf("\n%d X Rp.%d = Rp.%d\n\n", porsi,Hmierebus,total);/* 4 */
        }else if (pesanan.equals(AyamGoreng)) {/* 1 */
            System.out.printf("\n\n==========================");
            System.out.printf("\n\n\tayam goreng\n\n");/* 2 */
            System.out.printf("==========================\n");
            System.out.print("Masukkan jumlah porsi  : ");
            int porsi = scan.nextInt();
            total = porsi * Hayamgoreng;/* 3 */
            System.out.printf("\n%d X Rp.%d = Rp.%d\n\n", porsi,Hayamgoreng,total);/* 4 */
        }
    }
}
